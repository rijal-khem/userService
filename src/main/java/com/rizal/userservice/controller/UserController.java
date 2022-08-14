package com.rizal.userservice.controller;


import com.rizal.userservice.authentication.AuthenticationManager;
import com.rizal.userservice.dto.PrincipalDto;
import com.rizal.userservice.dto.UserDto;
import com.rizal.userservice.model.Principal;
import com.rizal.userservice.model.User;
import com.rizal.userservice.service.UserService;
import com.rizal.userservice.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationManager authenticationManager;


    @PostMapping("/signup")
    public String signup(@RequestBody UserDto user){
        System.out.println("User Controller Called.");
        System.out.println(user.toString());
        userService.saveUser(user);
        return "User has been added.";
    }


    @GetMapping("/login")
    public HttpEntity logIn(@RequestBody PrincipalDto principalDto){
        Principal principal = null;
        principal = authenticationManager.authenticate(principalDto);
        if(!principal.isAuthenticated()){
            return new HttpEntity(HttpStatus.NOT_FOUND);
        }

       return new HttpEntity(principal);
    }


}
