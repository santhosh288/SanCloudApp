package com.san.cloud.pages.login;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: santhosh
 * Date: 12/06/2012
 * Time: 21:57
 * To change this template use File | Settings | File Templates.
 */
public class LoginInfo implements Serializable {
    private String username;
    private String password;
    private boolean loginSuccessful;

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

    public boolean isLoginSuccessful() {
        return loginSuccessful;
    }

    public void setLoginSuccessful(boolean loginSuccessful) {
        this.loginSuccessful = loginSuccessful;
    }
}
