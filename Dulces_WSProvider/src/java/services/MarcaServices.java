package services;

import dao.impl.MarcaDaoImpl;

public class MarcaServices {

    MarcaDaoImpl marcaDaoImpl;

    public MarcaServices() {
        marcaDaoImpl = new MarcaDaoImpl();
    }

    public Boolean createMarca(String nombre) {
        return marcaDaoImpl.createMarca(nombre);
    }

}
