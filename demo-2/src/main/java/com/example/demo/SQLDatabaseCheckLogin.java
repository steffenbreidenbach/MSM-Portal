package com.example.demo;

import java.sql.*;

public class SQLDatabaseCheckLogin {

    public static boolean login(String login, String password) {
        String connectionUrl =
                "jdbc:sqlserver://Msm.database.windows.net:1433;"
                        + "database=MSM_Promotion_Vorversion;"
                        + "user=MSM_Promotion_Admin;"
                        + "password=Seebaer181050;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "hostNameInCertificate=*.database.windows.net;"
                        + "loginTimeout=30;";


        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();) {

            // Create and execute a SELECT SQL statement.
            String selectSql = "SELECT LeistungskundeAccount_Login,LeistungskundeAccount_Password from dbo.LeistungskundeAccount";
            resultSet = statement.executeQuery(selectSql);

            // Print results from select statement
            while (resultSet.next()) {
                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
            }
            if(resultSet.getString(1)==login&&resultSet.getString(2)==password) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
