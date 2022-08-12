package com.rizal.userservice.service;

import com.rizal.userservice.model.User;
import com.rizal.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(User user){
        userRepository.save(user);
    }

    }

