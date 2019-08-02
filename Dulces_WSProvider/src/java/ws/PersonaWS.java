/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bean.PersonaBean;
import java.sql.Date;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import services.PersonaServices;

/**
 *
 * @author AllegroCanttabile
 */
@WebService(serviceName = "PersonaWS")
public class PersonaWS {

    PersonaServices personaService = new PersonaServices();

    @WebMethod(operationName = "loginSPersona")
    public boolean loginSPersona(@WebParam(name = "dni") String dni, @WebParam(name = "pass") String pass) {
        return personaService.validarLogin(dni, pass);
    }

    @WebMethod(operationName = "findSPersona")
    public PersonaBean findSPersona(@WebParam(name = "dni") String dni) {
        return personaService.buscarUsuario(dni);
    }

    @WebMethod(operationName = "createSPersona")
    public boolean createSPersona(@WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "dni") String dni, @WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "sexo") String sexo,
            @WebParam(name = "direccion") String direccion, @WebParam(name = "celular") String celular, @WebParam(name = "fechaIngreso") String fechaIngreso,
            @WebParam(name = "password") String pass, @WebParam(name = "cargoId") String cargoId, @WebParam(name = "transporteId") String transporteId) {
        return personaService.createPersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, pass, cargoId, transporteId);
    }

    @WebMethod(operationName = "readSPersona")
    public ArrayList<PersonaBean> readSPersona() {
        return personaService.readPersona();
    }

    @WebMethod(operationName = "updateSPersona")
    public boolean updateSPersona(@WebParam(name = "nombres") String nombres, @WebParam(name = "apellidos") String apellidos,
            @WebParam(name = "dni") String dni, @WebParam(name = "fechaNacimiento") String fechaNacimiento, @WebParam(name = "sexo") String sexo,
            @WebParam(name = "direccion") String direccion, @WebParam(name = "celular") String celular, @WebParam(name = "fechaIngreso") String fechaIngreso,
            @WebParam(name = "password") String pass, @WebParam(name = "cargoId") String cargoId, @WebParam(name = "transporteId") String transporteId) {
        return personaService.updatePersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, pass, cargoId, transporteId);
    }

    @WebMethod(operationName = "deleteSPersona")
    public Boolean deleteSPersona(@WebParam(name = "dni") String dni) {
        return personaService.deletePersona(dni);
    }
}
