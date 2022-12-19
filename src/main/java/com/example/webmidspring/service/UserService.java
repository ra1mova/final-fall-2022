package com.example.webmidspring.service;

import com.example.webmidspring.model.User;
import com.example.webmidspring.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface UserService extends UserDetailsService {
    List<User> getAllUsers();
    User save(UserRegistrationDto registrationDto);
}
