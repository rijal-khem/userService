package com.rizal.userservice.authentication;


import com.rizal.userservice.dto.PrincipalDto;
import com.rizal.userservice.model.Principal;
import com.rizal.userservice.model.User;
import com.rizal.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationManager {


    @Autowired
    UserService userService;




    public  Principal authenticate(PrincipalDto principalDto) {

       User user = userService.getUserByEmail(principalDto.getEmail());

       if(principalDto.getPassword().equals(user.getEncodedPassword())){
           System.out.println("Authenticated");
           Principal principal = new Principal(user.getId(), user.getEmail());
           principal.setAuthenticated(true);
           return principal;
       }
       return null;
    }
}
