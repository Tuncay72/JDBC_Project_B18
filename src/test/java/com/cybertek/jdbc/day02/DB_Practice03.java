package com.cybertek.jdbc.day02;

import com.cybertek.jdbc.utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.*;

public class DB_Practice03 {
    public static void main(String[] args) throws SQLException {

        DB_Utility.createConnection();
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM EMPLOYEES");
        rs.next();
        // STORE FIRST ROW DATA AS A MAP<String,String>
        // the key of the map is column name , value of the map is the column data
        Map<String, String> rowMap = new HashMap<>();
//        rowMap.put("REGION_ID", "1");
//        rowMap.put("REGION_NAME" ,"Europe" );

//        rowMap.put("REGION_ID",   rs.getString(1) );
//        rowMap.put("REGION_NAME" ,rs.getString(2) );

        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++) {
//            System.out.println( rsmd.getColumnName(i)   );
            rowMap.put(rsmd.getColumnName(i), rs.getString(i));
        }
        System.out.println("rowMap = " + rowMap);


    }
    }