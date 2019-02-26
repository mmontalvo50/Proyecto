/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;

import java.sql.*;
/**
 *
 * @author HP
 */
public class ConexioBD {
    Connection cn;
    
    public Connection conexion() {
        try {
             Class.forName("com.mysql.jdbc.Driver");
        cn = DriverManager.getConnection("jdbc:mysql://localhost/sistema","root","");
        System.out.println("Se hizo la conexion exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }return cn;
    
    }
    Statement creStatement(){
        throw new UnsupportedOperationException("No soportado");
    }
}
