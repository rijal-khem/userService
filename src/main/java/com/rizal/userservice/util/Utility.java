package com.rizal.userservice.util;

import com.rizal.userservice.dto.UserDto;
import com.rizal.userservice.model.User;

public class Utility {


     public static User mapUserFromUserDto(UserDto userDto){
         User user = new User();
         System.out.println(userDto.getEmail().toString());
         user.setFirstName(userDto.getFirstName());
         user.setLastName(userDto.getLastName());
         user.setEmail(userDto.getEmail());
         user.setEncodedPassword(userDto.getPassword());
         System.out.println(user);
         return user;
     }
}
