package com.rizal.userservice.controller;


import com.rizal.userservice.model.User;
import com.rizal.userservice.service.UserService;
import com.rizal.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/signup")
    public String signup(@RequestBody User user){
        userService.saveUser(user);
        return "User has been added.";
    }
}
