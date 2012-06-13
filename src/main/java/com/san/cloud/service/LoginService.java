package com.san.cloud.service;

import com.san.cloud.pages.login.LoginInfo;

import java.io.Serializable;
import java.sql.*;

/**
 * Created by IntelliJ IDEA.
 * User: santhosh
 * Date: 12/06/2012
 * Time: 21:59
 * To change this template use File | Settings | File Templates.
 */
public class LoginService implements Serializable {
    public boolean isValid(LoginInfo loginInfo)  {
        Connection con = null;

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            con = DriverManager.getConnection(
                    "jdbc:mysql://instance17451.db.xeround.com:11735/sanclouddb?" +
                            "user=santhosh&password=it5compl1cat3d");

            PreparedStatement stmt = con.prepareStatement("select count(id) from sanappuser where username=? and password=?");
            stmt.setString(1, loginInfo.getUsername());
            stmt.setString(2, loginInfo.getPassword());

            ResultSet rs = stmt.executeQuery();
            int count = 0;

            if(rs.next()) {
                count = rs.getInt(1);
            }
            System.out.println("Count......."+count);
            return count > 0?true:false;
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
                }
            }
        }

        return false;
    }
}
