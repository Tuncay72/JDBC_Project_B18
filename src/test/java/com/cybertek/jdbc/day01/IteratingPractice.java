package com.cybertek.jdbc.day01;

import java.sql.*;

public class IteratingPractice {

    public static void main(String[] args) throws SQLException {


        String connectionStr = "jdbc:oracle:thin:@52.71.242.164:1521:XE";
        String username = "hr";
        String password = "hr";
        Connection conn = DriverManager.getConnection(connectionStr, username, password);
        Statement stmnt = conn.createStatement();
        ResultSet rs = stmnt.executeQuery("SELECT * FROM COUNTRIES ");


        while(rs.next()==true){
            System.out.println(rs.getString(1)+" "
            +rs.getString(2)+" "
            +rs.getString(3));
        }

        
    }

}
