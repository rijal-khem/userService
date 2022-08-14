package com.rizal.userservice.model;

public class Principal {


    private Integer id;
    private String email;
    private boolean isAuthenticated = false;

    public Principal (Integer id , String email){
        this.id = id;
        this.email = email;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }

    public void setAuthenticated(boolean authenticated) {
        isAuthenticated = authenticated;
    }
}
