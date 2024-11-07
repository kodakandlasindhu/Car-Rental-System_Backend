package com.project.mycar_rental_system.services.auth;

import com.project.mycar_rental_system.dto.SignupRequest;
import com.project.mycar_rental_system.dto.UserDto;

public interface AuthService {

    UserDto createCustomer(SignupRequest signupRequest) ;

    boolean hasCustomerWithEmail(String email);
}
