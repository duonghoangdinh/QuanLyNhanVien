/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.qlnv.connect;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

/**
 *
 * @author HP
 */
public class connectDatabase {

    public static Connection connectDatabase() {
        try {

            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String myURL = "jdbc:sqlserver://localhost:1433;database=DA1_QLNV; encrypt=false;";
            String USERNAME = "sa";
            String PASSWPRD = "123456";
            Connection connection = DriverManager.getConnection(myURL, USERNAME, PASSWPRD);
            DatabaseMetaData meta = connection.getMetaData();

            return connection;
        } catch (Exception e) {
            System.out.printf("Error: %s\n", e.getMessage());
        }
        return null;
    }
}