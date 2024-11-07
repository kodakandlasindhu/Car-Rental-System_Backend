package com.project.mycar_rental_system.dto;

import com.project.mycar_rental_system.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private UserRole userRole;
}

