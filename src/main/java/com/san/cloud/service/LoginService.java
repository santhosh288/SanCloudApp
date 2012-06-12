package com.san.cloud.service;

import com.san.cloud.pages.login.LoginInfo;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: santhosh
 * Date: 12/06/2012
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class LoginService {
    public boolean isValid(LoginInfo loginInfo) {
        if("admin".equals(loginInfo.getUsername()) && "admin".equals(loginInfo.getPassword())) {
            return true;
        }
        return false;
    }
}
