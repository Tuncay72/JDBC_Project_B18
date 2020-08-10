package com.cybertek.jdbc.day03;

import com.cybertek.jdbc.utility.DB_Utility;
import sun.security.pkcs11.Secmod;


public class SpartmanDB_Practice {
    public static void main(String[] args) {
        //please create a package called utility
        //and move your_DB utility under that package

//      String url = "jdbc:oracle:thin:@54.144.97.46:1521:xe";
//      DB_Utility.createConnection(url,"SP","SP");

       // DB_Utility.createConnection();
        DB_Utility.createConnection("dev");


//    Run query "SELECT * FROM EMPLOYEES"
//
        DB_Utility.runQuery("select * from SPARTANS");
//
////    1. Display all data in console
//        DB_Utility.displayAllData();
//
////    2. Print column count
//        System.out.println("DB_Utility.getColumnCNT() = " + DB_Utility.getColumnCNT());
//
////    3. Print row count
//        System.out.println("DB_Utility.getRowCount() = " + DB_Utility.getRowCount());
//
////    4. Print out 3rd row data as a list
//        System.out.println("DB_Utility.getRowDataAsList(3) = "
//                + DB_Utility.getRowDataAsList(3));
//
////    5. Print out 2nd column data as a list
//        System.out.println("DB_Utility.getColumnDataAsList(2) = "
//                + DB_Utility.getColumnDataAsList(2));
//
////    6, Print out Name column data as a list
//        System.out.println("DB_Utility.getColumnDataAsList(\"NAME\") = "
//                + DB_Utility.getColumnDataAsList("NAME"));
//
////    7, Print out 4th row as a Map
//        System.out.println("DB_Utility.getRowMap(4) = "
//                + DB_Utility.getRowMap(4));

////    8, Print out the data at row 5, column 1
        System.out.println("DB_Utility.getColumnDataAtRow(5,1) = "
                + DB_Utility.getColumnDataAtRow(5, 1));

////    9, Print out the data at row 53, phone column
        System.out.println("DB_Utility.getColumnDataAtRow(53,\"PHONE\") = "
                + DB_Utility.getColumnDataAtRow(53, "PHONE"));
//
//
////    10. Print out all the data as List of Map
        System.out.println("DB_Utility.getAllDataAsListOfMap() = "
                + "\n"+DB_Utility.getAllDataAsListOfMap()+"\n");


    }
}
