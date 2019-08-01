package services;

import dao.impl.CargoDaoImpl;

public class CargoServices {

    CargoDaoImpl cargoDaoImpl;

    public CargoServices() {
        cargoDaoImpl = new CargoDaoImpl();
    }

    public Boolean createCargo(String nombre) {
        return cargoDaoImpl.createCargo(nombre);
    }
}
