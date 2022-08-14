package com.rizal.userservice.service;

import com.rizal.userservice.dto.UserDto;
import com.rizal.userservice.model.User;

import java.util.List;


public interface UserService {

    void saveUser(UserDto userDto);

    boolean existsByEmail(String email);

    User getUserByEmail(String email);
}
