/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import services.TipoServices;

/**
 *
 * @author AllegroCanttabile
 */
@WebService(serviceName = "TipoWS")
public class TipoWS {

  TipoServices tipoService = new TipoServices();
  
    @WebMethod(operationName = "RegTipo")
    public boolean regTipo(@WebParam(name = "nombre") String nombre) {
        return tipoService.createTipo(nombre);
    }
    
     
    
}
