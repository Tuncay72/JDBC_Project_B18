package com.cybertek.jdbc.day02;

import com.cybertek.jdbc.utility.DB_Utility;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_Practice2 {
    public static void main(String[] args) throws SQLException {

        // print out all data from Jobs Table
        DB_Utility.createConnection();

       // ResultSet rs = DB_Utility.runQuery("SELECT * FROM JOBS");
        ResultSet rs = DB_Utility.runQuery("SELECT * FROM REGIONS");

        // this method call is displaying the data of the resultset
        DB_Utility.displayAllData();
        rs.absolute(2);
        DB_Utility.displayAllData();

        System.out.println("==========================");
        
        //move resultset cursor to second row
        rs.absolute(2);

       // DB_Utility.displayAllData();
        System.out.println("======================================");

//        // get the first row data  | without knowing the column names
//
//       int colCount = DB_Utility.getColumnCNT() ;
////        rs.first() ; // moving to the first row
//        // in order to get whole result cursor must be before first location!
//        while (rs.next()==true) {  // row iteration
//        for (int i = 1; i <= colCount ; i++) {   // column iteration
//            System.out.println(  rs.getString( i ) +"\t" );
//        }
//          }
        System.out.println();


      

        System.out.println("DB_Utility.getColumnDataAtRow(2,1) = "
                + DB_Utility.getColumnDataAtRow(2, 1));


        System.out.println("DB_Utility.getColumnDataAtRow(3, \"REGION_NAME\") = "
                + DB_Utility.getColumnDataAtRow(3, "REGION_NAME"));

        System.out.println("DB_Utility.getRowDataAsList(4) = "
                + DB_Utility.getRowDataAsList(4));
    }
}
