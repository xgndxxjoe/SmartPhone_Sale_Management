/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.connectsqlserver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author phamn
 */
public class ConnectToSQLServer {

    public static Connection getConnectToSQLServer() {
        final String user = "sa";
        final String pass = "123456";
        final String url = "jdbc:sqlserver://localhost:1433;databaseName=QLBanDienThoai;"
                        + "encrypt=true;trustServerCertificate=true;sslProtocol=TLSv1.2";
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            System.out.println("Connection pass!");
            return DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void main(String[] args) {
        getConnectToSQLServer();
    }
    
}
