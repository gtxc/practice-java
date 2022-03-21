package com.gtxc.practice.db;

/*
    Created by gt at 5:27 PM on Friday, February 25, 2022.
    Project: practice, Package: com.gtxc.practice.db.
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    public static Connection connection = null;

    public static boolean getConnection(String databaseName) {

        try {
            connection = DriverManager.getConnection(databaseName);
            System.out.println("DB connection successful.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean closeConnection() {
        try {
            connection.close();
            System.out.println("DB connection is closed.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
