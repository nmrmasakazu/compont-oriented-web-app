package com.nmrmasakazu.api.auth.dto;

import java.util.List;

import com.nmrmasakazu.api.auth.model.Role;

public class UserDataDTO {

    private String username;

    private String email;

    private String plainPassword;

    private String password;

    List<Role> roles;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPlainPassword() {
        return password;
    }

    public void setPlainPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }

}
