package com.highradius;

import java.sql.*;

public class DataBaseCheck {

    public static void main(String[] args) {

        Connection connection = null;

        String url = "jdbc:mysql://127.0.0.1:3306/test";
        String user = "root";
        String password = "";
        PreparedStatement statement = null;
        String q = "INSERT INTO testtable (a,b,c) VALUES (?,?,?);";
        ResultSet resultSet = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try {
            statement = connection.prepareStatement(q);
            statement.setInt(1,3);
            statement.setInt(3,3);
            statement.setNull(2,Types.INTEGER);
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }

        try {
            statement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
            return;
        }
//        while(true){
//            try {
//                if (!resultSet.next()) break;
//                else{
//                    System.out.println(resultSet.getString("a_title"));
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//                return;
//            }
//
//        }


    }
}
