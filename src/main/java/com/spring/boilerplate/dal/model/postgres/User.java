package com.spring.boilerplate.dal.model.postgres;

import com.spring.boilerplate.dal.model.enums.Role;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class User {

    @Id
    Long id;

    @Enumerated(EnumType.STRING)
    Role role;


}
