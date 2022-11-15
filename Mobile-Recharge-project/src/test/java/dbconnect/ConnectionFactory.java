package dbconnect;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionFactory {
	
	static {
        // step-1 : register JDBC-driver
        try {
            Class.forName("oracle.jdbc.OracleDriver");
        } catch (ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    // Factory Method
    public static Connection getConnection() {
        Connection connection = null;
        try {
            // step-2 : create database connection with URL,username and password
            connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sys as sysdba","admin@123");
        } catch (
                SQLException throwables) {
            throwables.printStackTrace();
        }
        return connection;

    }



}
