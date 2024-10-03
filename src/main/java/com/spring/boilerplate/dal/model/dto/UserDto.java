package com.spring.boilerplate.dal.model.dto;


import com.spring.boilerplate.dal.model.enums.Role;
import lombok.Data;

@Data
public class UserDto {
    Long id;
    Role role;
}
