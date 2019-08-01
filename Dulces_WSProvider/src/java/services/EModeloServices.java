package services;

import dao.impl.EModeloDaoImpl;

public class EModeloServices {

    EModeloDaoImpl emodeloDaoImpl;

    public EModeloServices() {
        emodeloDaoImpl = new EModeloDaoImpl();
    }

    public Boolean createEModelo(String nombre) {
        return emodeloDaoImpl.createEModelo(nombre);
    }
}
