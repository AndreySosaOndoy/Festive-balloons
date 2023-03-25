
package com.mycompany.festiveballoons;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FestiveBalloons {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionURL = "jdbc:sqlserver://";
        Connection con = DriverManager.getConnection(connectionURL);
        System.out.print("Nos Conectamos");
        
    }
}
