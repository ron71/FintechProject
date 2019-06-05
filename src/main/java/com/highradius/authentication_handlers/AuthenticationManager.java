package com.highradius.authentication_handlers;

import com.highradius.databasehandlers.DatabaseHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthenticationManager {

    Connection connection;
    PreparedStatement preparedStatement;

    String paramQuery = "SELECT * FROM employee WHERE emp_email=? AND emp_password=?; ";

    public AuthenticationManager() {
        connection = DatabaseHelper.connectAndOpenDatabase();
        try {
            preparedStatement = connection.prepareStatement(paramQuery);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public String authenticateUser(String email, String password){
        ResultSet resultSet = null;
        try {
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                return resultSet.getString("EMP_NAME");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
