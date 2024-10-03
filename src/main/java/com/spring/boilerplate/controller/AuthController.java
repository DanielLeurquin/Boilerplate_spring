package com.spring.boilerplate.controller;

import com.spring.boilerplate.config.jwt.TokenSet;

import com.spring.boilerplate.dal.model.dto.RefreshTokenDto;
import com.spring.boilerplate.exceptions.http.HttpUnauthorizedException;

import com.spring.boilerplate.service.SecurityService;
import com.spring.boilerplate.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {


    @Autowired
    UserService userService;

    @Autowired
    SecurityService securityService;

    @PostMapping()
    public void auth(){
        //issue tokenSet on auth validation;
        return;
    }

    @PostMapping("/refresh")
    public TokenSet getRefreshedTokens(@CookieValue(value = "refresh-token", defaultValue = "") String refreshToken, @RequestBody RefreshTokenDto dto) {
        if (refreshToken.equals("") && (dto.getRefreshToken() == null || dto.getRefreshToken().equals("")))
            throw new HttpUnauthorizedException("refresh_token_expired");

        return securityService.refreshUserToken(dto.getRefreshToken() != null && !dto.getRefreshToken().equals("") ? dto.getRefreshToken() : refreshToken);
    }
}
