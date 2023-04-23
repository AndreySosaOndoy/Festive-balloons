package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class Crud_cliente {
    Connection conexion;
    ResultSet Resul;
    Statement del;
    
    public Crud_cliente() throws ClassNotFoundException {
        conexion = new conectar().conectar();
    }
    
    public boolean guardar (int id, String Nombre, String Apellido1, String Apellido2, String Correo, String Telefono, String Direccion){
        try{
            String sql = "Insert INTO TAB_CLIENTE (IdCategoria, Nombre, Apellido1, Apellido2, CorreoElectronico, Telefono, Direccion) Values(?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, Nombre);
            statement.setString(3, Apellido1);
            statement.setString(4, Apellido2);
            statement.setString(5, Correo);
            statement.setString(6, Telefono);
            statement.setString(7, Direccion);
            
            int rowsInserted = statement.executeUpdate();
            if(rowsInserted > 0){
                return true;
            }
        }catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            e.printStackTrace();
            return true;
        }
        return false;
    }
    public void setInsertar(String sql) throws SQLException{
        del = conexion.createStatement();
        del.execute(sql);
    }
    
    public void setUpdate(String sql) throws SQLException{
        del = conexion.createStatement();
        del.executeUpdate(sql);
    }
    public void setDelete(String sql) throws SQLException{
        del = conexion.createStatement();
        del.execute(sql);
    }
    
    public ResultSet GetConsultar (String Sql) throws SQLException{
        del = conexion.createStatement();
        Resul = del.executeQuery(Sql);
        return Resul;
    }
}
