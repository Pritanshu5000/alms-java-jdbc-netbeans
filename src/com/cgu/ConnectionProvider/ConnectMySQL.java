
package com.cgu.ConnectionProvider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectMySQL {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/advance_lms";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "SQL#2023@hxiz408";
    
    static Connection con = null;
    
    public static Connection ConnectToDB() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish Connection
            con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            System.out.println("Connection Established Successfully...");
        } 
        catch (ClassNotFoundException ex) {
            System.err.println("MySQL JDBC Driver Not Found!");
            Logger.getLogger(ConnectMySQL.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            System.err.println("Database Connection Failed!");
            Logger.getLogger(ConnectMySQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
}
