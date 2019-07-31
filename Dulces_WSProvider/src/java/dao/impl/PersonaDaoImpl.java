/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.PersonaBean;
import dao.PersonaDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import utils.ConexionDB;


/**
 *
 * @author AllegroCanttabile
 */
public class PersonaDaoImpl implements PersonaDao {
    public ConexionDB db;
    
    public PersonaDaoImpl(){
       db = new ConexionDB();
    }

    @Override
    public Boolean validarLogin(String dni, String pass) {
         Connection accesoDB = db.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from persona where dni=? and pass=?");
            ps.setString(1, dni);
            ps.setString(2, pass);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public PersonaBean buscarUsuario(String dni) {
        PersonaBean persona = null;
        Connection accesoDB = db.getConexion();
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from persona where dni=?");
            ps.setString(1, dni);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
               persona = new PersonaBean();
               persona.setNombres(rs.getString(2));
               persona.setApellidos(rs.getString(3));
               persona.setFechaNacimiento(rs.getString(4));
               persona.setSexo(rs.getString(5));
               persona.setDireccion(rs.getString(6));
               persona.setCelular(rs.getString(7));
               persona.setFechaIngreso(rs.getString(8));
               return persona;
            }
        } catch (SQLException e) {
            return null;
        }
        return persona;
    }

    @Override
    public Boolean createPersona(String nombres, String apellidos, String dni, Date fechaNacimiento, String sexo, String direccion, String celular, Date fechaIngreso, String pass) {
        
        Connection accesoDB = db.getConexion();
        try {
            
                PreparedStatement ps = accesoDB.prepareStatement("insert into persona(nombres, apellidos, dni, fechaNacimiento,sexo, direccion, celular, fechaIngreso, pass) values (?,?,?,?,?,?,?,?,?)");
                ps.setString(1, nombres);
                ps.setString(2, apellidos);
                ps.setString(3, dni);
                ps.setDate(4, fechaNacimiento);
                ps.setString(5, sexo);
                ps.setString(6, direccion);
                ps.setString(7, celular);
                ps.setDate(8, fechaIngreso);
                ps.setString(9, pass);

                int rs = ps.executeUpdate();

                if(rs>0){
                    return true;
                }
            
        } catch (SQLException e) {
        }
        return false;
        
    }

    @Override
    public ArrayList<PersonaBean> readPersona() {
        
         ArrayList<PersonaBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        PersonaBean persona = null;
        try {
            
            PreparedStatement ps = accesoDB.prepareStatement("select * from persona");
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()) {
               persona = new PersonaBean();
               persona.setNombres(rs.getString(2));
               persona.setApellidos(rs.getString(3));
               persona.setDni(rs.getString(4));
               persona.setFechaNacimiento(rs.getString(5));
               persona.setSexo(rs.getString(6));
               persona.setDireccion(rs.getString(7));
               persona.setCelular(rs.getString(8));
               persona.setFechaIngreso(rs.getString(9));
               arreglo.add(persona);
            }
            
        } catch (SQLException e) {
        }
        return arreglo;
        
        
    }

    @Override
    public Boolean updatePersona(String nombres, String apellidos, String dni, Date fechaNacimiento, String sexo, String direccion, String celular, Date fechaIngreso, String pass) {
        
         Connection accesoDB = db.getConexion();
        try {
            PreparedStatement ps = accesoDB.prepareStatement("update persona set nombres=?, apellidos=?,"
                    + " fechaNacimiento=?, sexo=?, direccion=?, celular=?, fechaIngreso=?, pass=?,  where dni=?");
            
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, dni);
            ps.setDate(4, fechaNacimiento);
            ps.setString(5, sexo);
            ps.setString(6, direccion);
            ps.setString(7, celular);
            ps.setDate(8, fechaIngreso);
            ps.setString(9, pass);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                return true;
            }
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public Boolean deletePersona(String dni) {
        Connection accesoDB = db.getConexion();
        try{
            PreparedStatement ps = accesoDB.prepareStatement("delete from persona where dni = ?");
            ps.setString(1, dni);
            
            int rs = ps.executeUpdate();
            
            if(rs>0){
                return true;
            }
        }catch(SQLException e){
        }
        return false;
    }
    

    
}
