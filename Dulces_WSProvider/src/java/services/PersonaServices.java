/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import bean.PersonaBean;
import dao.impl.PersonaDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author AllegroCanttabile
 */
public class PersonaServices {
    PersonaDaoImpl personaDao;
    
    public PersonaServices(){
        personaDao = new PersonaDaoImpl();
    }
    
   public Boolean validarLogin(String dni, String pass) {
       return personaDao.validarLogin(dni, pass);
   }
    public PersonaBean buscarUsuario(String dni) {
        return personaDao.buscarUsuario(dni);
    }
    public Boolean createPersona(String nombres, String apellidos, String dni, Date fechaNacimiento, String sexo,
            String direccion, String celular, Date fechaIngreso, String pass){
        return personaDao.createPersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, pass);
    }
    
    public ArrayList<PersonaBean> readPersona() {
        return personaDao.readPersona();
    }
    
    public Boolean updatePersona(String nombres, String apellidos, String dni, Date fechaNacimiento,
            String sexo, String direccion, String celular, Date fechaIngreso, String pass) {
        return personaDao.updatePersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, pass);
        
    }
    
    public Boolean deletePersona(String dni) {
        return personaDao.deletePersona(dni);
    }
    
    
    
        
    
}
