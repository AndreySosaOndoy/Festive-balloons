package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
    private static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe"; // Cambiar a la URL de tu base de datos Oracle
    private static final String USER = "SYSTEM"; // Cambiar a tu usuario de la base de datos Oracle
    private static final String PASSWORD = "Yonemain420$420"; // Cambiar a tu contraseña de la base de datos Oracle

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("oracle.jdbc.OracleDriver"); // Cargar el controlador JDBC de Oracle
        } catch (ClassNotFoundException ex) {
            System.out.println("Error al cargar el controlador JDBC de Oracle: " + ex.getMessage());
        }
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }
}