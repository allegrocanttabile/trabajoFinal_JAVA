package services;

import bean.OficinaBean;
import dao.impl.OficinaDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

public class OficinaServices {

    OficinaDaoImpl oficinaDao;

    public OficinaServices() {
        oficinaDao = new OficinaDaoImpl();
    }

    public Boolean createOficina(String nombre, String direccion, String telefono) {
        return oficinaDao.createOficina(nombre, direccion, telefono);
    }

    public ArrayList<OficinaBean> readOficina() {
        return oficinaDao.readOficina();
    }
}
