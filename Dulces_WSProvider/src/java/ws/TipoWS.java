
package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import services.TipoServices;

@WebService(serviceName = "TipoWS")
public class TipoWS {

  TipoServices tipoService = new TipoServices();
  
    @WebMethod(operationName = "RegTipo")
    public boolean regTipo(@WebParam(name = "nombre") String nombre) {
        return tipoService.createTipo(nombre);
    }
    
     
    
}
