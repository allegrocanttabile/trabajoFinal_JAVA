package services;

import dao.impl.EMarcaDaoImpl;

public class EMarcaServices {

    EMarcaDaoImpl emarcaDaoImpl;

    public EMarcaServices() {
        emarcaDaoImpl = new EMarcaDaoImpl();
    }

    public Boolean createEMarca(String nombre) {
        return emarcaDaoImpl.createEMarca(nombre);
    }
}
