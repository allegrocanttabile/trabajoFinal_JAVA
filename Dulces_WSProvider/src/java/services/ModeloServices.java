package services;

import dao.impl.ModeloDaoImpl;

public class ModeloServices {

    ModeloDaoImpl modeloDaoImpl;

    public ModeloServices() {
        modeloDaoImpl = new ModeloDaoImpl();
    }

    public Boolean createModelo(String nombre) {
        return modeloDaoImpl.createModelo(nombre);
    }
}
