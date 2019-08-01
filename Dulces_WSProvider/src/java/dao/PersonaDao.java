/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.PersonaBean;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author AllegroCanttabile
 */
public interface PersonaDao {
    
    public Boolean validarLogin(String dni, String pass);
    
    public PersonaBean buscarUsuario(String dni);
    
    public Boolean createPersona(String nombres, String apellidos, String dni, String fechaNacimiento, String sexo,
            String direccion, String celular, String fechaIngreso, String pass, String cargoId, String transporteId);
    
    public ArrayList<PersonaBean> readPersona();
    
    public Boolean updatePersona(String nombres, String apellidos, String dni, String fechaNacimiento, String sexo,
            String direccion, String celular, String fechaIngreso, String pass, String cargoId, String transporteId);
    
    public Boolean deletePersona(String dni);
    
}
