package services;

import dao.impl.TipoDaoImpl;

public class TipoServices {

    TipoDaoImpl tipoDaoImpl;

    public TipoServices() {
        tipoDaoImpl = new TipoDaoImpl();
    }

    public Boolean createTipo(String nombre) {
        return tipoDaoImpl.createTipo(nombre);
    }

}
