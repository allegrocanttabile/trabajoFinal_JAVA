/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws;

import bean.TransporteBean;
import java.sql.Date;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import services.TransporteServices;



/**
 *
 * @author isai
 */
@WebService(serviceName = "TransporteWS")
public class TransporteWS {
    
    
    TransporteServices transporteService = new TransporteServices();

    @WebMethod(operationName = "createTransporte")
    public boolean createTransporte(@WebParam(name = "placa") String placa, @WebParam(name = "anoFabricacion") String anoFabricacion,
            @WebParam(name = "fechaMantenimiento") String fechaMantenimiento) {
        return transporteService.createTransporte(placa, anoFabricacion, fechaMantenimiento);
    }

    @WebMethod(operationName = "readTransporte")
    public ArrayList<TransporteBean> readTransporte() {
        return transporteService.readTransporte();
    }
    
}
