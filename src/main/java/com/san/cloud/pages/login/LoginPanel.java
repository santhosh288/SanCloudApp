package com.san.cloud.pages.login;

import com.san.cloud.pages.SanCloudHomePage;
import com.san.cloud.service.LoginService;
import org.apache.wicket.Session;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.markup.html.panel.FeedbackPanel;
import org.apache.wicket.markup.html.panel.Panel;
import org.apache.wicket.model.CompoundPropertyModel;
import org.apache.wicket.model.IModel;

/**
 * Created by IntelliJ IDEA.
 * User: santhosh
 * Date: 12/06/2012
 * Time: 21:34
 * To change this template use File | Settings | File Templates.
 */
public class LoginPanel extends Panel {
    private LoginInfo loginInfo;

    private LoginService loginService = new LoginService();

    public LoginPanel(String id) {
        super(id);
        initPanel();
    }

    public LoginPanel(String id, IModel<?> model) {
        super(id, model);
        initPanel();
    }

    public LoginInfo getLoginInfo() {
        return loginInfo;
    }

    public void setLoginInfo(LoginInfo loginInfo) {
        this.loginInfo = loginInfo;
    }

    private void initPanel() {
        setDefaultModel(new CompoundPropertyModel<LoginInfo>(loginInfo = new LoginInfo()));

        add(new FeedbackPanel("feedback"));

        Form loginForm = new Form("loginForm") {
            @Override
            protected void onSubmit() {
                if(loginService.isValid(loginInfo)) {
                    setResponsePage(SanCloudHomePage.class);
                } else {
                    Session.get().error("Invalid username/password. Please try using admin/admin...");
                }
            }
        };

        loginForm.add(new TextField("username"));
        loginForm.add(new PasswordTextField("password"));

        add(loginForm);
    }
}
