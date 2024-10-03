package com.spring.boilerplate.config.jwt;

import lombok.Data;

import java.util.List;

@Data
public class TokenPayload {
    Long id;
    String role;
}
