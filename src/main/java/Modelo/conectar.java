package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conectar {
    public static Connection conectar() throws ClassNotFoundException {
        Connection con = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = (Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "SYSTEM", "Yonemain420$420");
            if (con != null){
                System.out.println("Conectado con exito");
            }
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println("No se pudo conectar a la base de datos");
            e.printStackTrace();
        }
        return con;
    }
}
