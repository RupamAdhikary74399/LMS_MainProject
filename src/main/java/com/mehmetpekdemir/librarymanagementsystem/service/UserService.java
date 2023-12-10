package com.mehmetpekdemir.librarymanagementsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.mehmetpekdemir.librarymanagementsystem.entity.User;
import com.mehmetpekdemir.librarymanagementsystem.Dto.UserRegistrationDto;

public interface UserService extends UserDetailsService{
    User save(UserRegistrationDto registrationDto);
}
