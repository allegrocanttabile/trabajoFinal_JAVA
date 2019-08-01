package ws;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import services.CargoServices;

@WebService(serviceName = "CargoWS")

public class CargoWS {

    CargoServices cargoService = new CargoServices();

    @WebMethod(operationName = "RegCargo")
    public boolean regCargo(@WebParam(name = "nombre") String nombre) {
        return cargoService.createCargo(nombre);
    }
}
