/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionDb;
import java.sql.*;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet; //obtener resultados de la consulta
import java.sql.PreparedStatement; //ejecutar la conexion
import java.sql.DriverManager; //establecer conexion con Microsoft
import javax.swing.JOptionPane;
/**
 *
 * @author Jonathan
 */
public class ConexionBase {
    
    Connection conectar =null;
    Statement sentencia =null; //sentencia sql
    ResultSet resultado =null; //resultado de la consulta sql
    
    public ConexionBase(){
        try {
            String rutaDb="C:\\Users\\Bren\\Documents\\CentralAutobus1.accdb";
            String url="jdbc:ucanaccess://"+rutaDb;
            conectar=DriverManager.getConnection(url);
            sentencia=conectar.createStatement();
            //JOptionPane.showMessageDialog(null,"Conectado a la Base de Datos");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error al conectar la base de datos"+e);
            System.exit(0);
            
        }
    }
    public Connection getConnection(){
        return conectar;
    }
    
}
