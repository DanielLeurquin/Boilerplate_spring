package com.spring.boilerplate.service;

import com.spring.boilerplate.dal.model.dto.UserDto;
import com.spring.boilerplate.dal.postgres.repository.UserRepository;
import com.spring.boilerplate.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Transactional
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    SecurityService securityService;

    public List<UserDto> findAll() {
        return userRepository
                .findAll()
                .stream()
                .map(UserMapper.instance()::convertToDto)
                .collect(Collectors.toList());
    }
}
