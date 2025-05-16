
package com.cgu.ConnectionProvider;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
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
    
    public static void runSQLFile(String filePath) {
        try (Connection conn = ConnectToDB();
             Statement stmt = conn.createStatement();
             BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            StringBuilder sql = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();
                // Skip empty lines and comments
                if (line.isEmpty() || line.startsWith("--")) {
                    continue;
                }
                
                sql.append(line).append(" ");
                
                // Execute when line ends with semicolon
                if (line.endsWith(";")) {
                    String query = sql.toString();
                    try {
                        stmt.execute(query);
                    } catch (SQLException e) {
                        System.err.println("Error executing query: " + query);
                        e.printStackTrace();
                    }
                    sql.setLength(0); // Clear the buffer
                }
            }
            System.out.println("SQL file executed successfully.");
        } catch (IOException e) {
            System.err.println("Error reading SQL file: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("SQL execution error: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        // Update the path to your SQL file location
        String sqlFilePath = "C:\\Users\\LENOVO\\Documents\\NetBeansProjects\\Advance Library Management System\\src\\com\\cgu\\ConnectionProvider\\DatabaseAndTables.sql";
        
        // Run the SQL file to create database and tables
        runSQLFile(sqlFilePath);
    }
}
