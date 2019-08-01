package services;

import dao.impl.ECategoriaDaoImpl;

public class ECategoriaServices {

    ECategoriaDaoImpl ecategoriaDaoImpl;

    public ECategoriaServices() {
        ecategoriaDaoImpl = new ECategoriaDaoImpl();
    }

    public Boolean createECategoria(String nombre) {
        return ecategoriaDaoImpl.createECategoria(nombre);
    }
}
