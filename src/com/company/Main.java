package com.company;
import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;user=sa;password=123123ok");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from [automation].[dbo].[names]");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}