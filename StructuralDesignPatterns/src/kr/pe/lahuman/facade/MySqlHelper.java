package kr.pe.lahuman.facade;

import java.sql.Connection;

/**
 * Created by lahuman on 2015-03-13.
 */
public class MySqlHelper {
    public static Connection getMySqlDBConnection(){
        return null;
    }

    public void generateMySqlPDFReport(String tableName, Connection con){
        System.out.println("generateMySqlPDFReport");
    }

    public void generateMySqlHTMLReport(String tableName, Connection con){
        System.out.println("generateMySqlHTMLReport");
    }
}
