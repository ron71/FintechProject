package com.highradius.databasehandlers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseHelper {

    static final String URL = "jdbc:mysql://127.0.0.1:3306/fintechdb";
    static final String USER = "root";
    static final String PASSWORD = "";
    static Connection connection;

    public static Connection connectAndOpenDatabase(){
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.err.println("SQL CONNECTION ERROR : "+e.toString());
        }
        return connection;
    }

}
