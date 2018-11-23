package com.example.demo;

import java.sql.*;

public class SQLDatabaseConnection {

    // Connect to your database.
    // Replace server name, username, and password with your credentials
    public static void main(String[] args) {
        String connectionUrl =
                "jdbc:sqlserver://Msm.database.windows.net:1433;"
                        + "database=MSM_Promotion_Vorversion;"
                        + "user=MSM_Promotion_Admin;"
                        + "password=Seebaer181050;"
                        + "encrypt=true;"
                        + "trustServerCertificate=false;"
                        + "hostNameInCertificate=*.database.windows.net;"
                        + "loginTimeout=30;";


        String insertSql = "INSERT INTO dbo.LeistungskundeAccount (ID, LeistungskundeAccount_Login, LeistungskundeAccount_Password, Portalrechte, LeistungkundeAccount_Abteilung) VALUES "
                + "(2, 'jonie', '1234', 'test', 'lol');";

        ResultSet resultSet = null;

        try (Connection connection = DriverManager.getConnection(connectionUrl);
             PreparedStatement prepsInsertProduct = connection.prepareStatement(insertSql, Statement.RETURN_GENERATED_KEYS);) {

            prepsInsertProduct.execute();
            // Retrieve the generated key from the insert.
            resultSet = prepsInsertProduct.getGeneratedKeys();

            // Print the ID of the inserted row.
            while (resultSet.next()) {
                System.out.println("Generated: " + resultSet.getString(1));
            }
        }
        // Handle any errors that may have occurred.
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
