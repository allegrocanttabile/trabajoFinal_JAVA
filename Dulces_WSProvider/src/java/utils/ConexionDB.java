/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author AllegroCanttabile
 */
public class ConexionDB {
    String ConxBD = "jdbc:mysql://localhost/dbdulces";
    String userBD="root";
    String PassBD="";
    String JdbcBD="com.mysql.jdbc.Driver";
    Connection Conexion;

    public ConexionDB() {
      
        try{
        Class.forName(JdbcBD);
        Conexion = DriverManager.getConnection(ConxBD, userBD, PassBD);
        if(Conexion!=null){
            DatabaseMetaData dm = (DatabaseMetaData)Conexion.getMetaData();
            System.out.println("Conexion establecida...");}
        }catch(ClassNotFoundException|SQLException ex){
           System.out.println("Error al conectar..."+ ex);
        }
    }
     public  Connection getConexion(){
     return  this.Conexion;
     }
     
     public void desconectar(){
         Conexion = null;
         if(Conexion == null){
             System.out.println("Conexion terminada....");
             
         }
     }
     
     public static void main(String[] args) {
        ConexionDB cn = new ConexionDB();
    }
}
