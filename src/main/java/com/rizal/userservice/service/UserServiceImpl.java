package com.rizal.userservice.service;

import com.rizal.userservice.dto.UserDto;
import com.rizal.userservice.model.User;
import com.rizal.userservice.repository.UserRepository;
import com.rizal.userservice.util.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public void saveUser(UserDto userdto){
        User user = Utility.mapUserFromUserDto(userdto);
        userRepository.save(user);
    }

    @Override
    public boolean existsByEmail(String email) {
        List<User> userList = userRepository.usersByEmail(email);
        if(userList.size()!=0){
            return true;
        }
        return false;
    }

    @Override
    public User getUserByEmail(String email) {

        List<User> userList = userRepository.usersByEmail(email);
        if(userList.size()!=0){
            return  userList.get(0);
        }
        return null;
    }


}

