package com.rizal.userservice.dto;

import com.rizal.userservice.model.Principal;

public class PrincipalDto {

    private String email;
    private String password;

    public PrincipalDto(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
