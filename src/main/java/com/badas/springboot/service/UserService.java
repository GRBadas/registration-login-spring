package com.badas.springboot.service;

import com.badas.springboot.model.User;
import com.badas.springboot.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
