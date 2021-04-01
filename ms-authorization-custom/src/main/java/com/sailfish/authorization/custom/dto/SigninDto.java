package com.sailfish.authorization.custom.dto;

import com.sun.istack.internal.NotNull;

/**
 * @author XIAXINYU3
 * @date 2021/4/1
 */
public class SigninDto {

    @NotNull
    private String username;

    @NotNull
    private String password;

    protected SigninDto() {
    }

    public SigninDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}