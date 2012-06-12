package com.san.cloud.pages.login;

import com.san.cloud.pages.SanCloudBasePage;
import com.san.cloud.pages.SanCloudHomePage;
import com.san.cloud.service.LoginService;
import org.apache.wicket.markup.html.form.Form;

/**
 * Created by IntelliJ IDEA.
 * User: santhosh
 * Date: 12/06/2012
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class LoginPage extends SanCloudBasePage {


    public LoginPage() {
        initPage();
    }

    private void initPage() {

        final LoginPanel loginPanel = new LoginPanel("loginPanel");
        add(loginPanel);
    }
}
