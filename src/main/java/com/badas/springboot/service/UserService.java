package com.badas.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.badas.springboot.model.User;
import com.badas.springboot.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);

}
