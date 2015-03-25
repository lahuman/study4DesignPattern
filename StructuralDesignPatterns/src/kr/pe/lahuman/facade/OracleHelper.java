package kr.pe.lahuman.facade;

import java.sql.Connection;

/**
 * Created by lahuman on 2015-03-13.
 */
public class OracleHelper {
    public static Connection getOracleDBConnection(){
        return null;
    }
    public void generateOraclePDFReport(String tableName, Connection con){
        System.out.println("generateOraclePDFReport");
    }

    public void generateOracleHTMLReport(String tableName, Connection con){
        System.out.println("generateOracleHTMLReport");
    }
}
