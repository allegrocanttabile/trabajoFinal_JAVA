package services;

import bean.EclienteBean;
import dao.impl.EclienteDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

public class EclienteServices {

    EclienteDaoImpl eclienteDao;

    public EclienteServices() {
        eclienteDao = new EclienteDaoImpl();
    }

    public Boolean createEcliente(String nombres, String apellidos, String direccionEnvio, String telefono,
            String correo) {
        return eclienteDao.createEcliente(nombres, apellidos, direccionEnvio, telefono, correo);
    }

    public ArrayList<EclienteBean> readEcliente() {
        return eclienteDao.readEcliente();
    }
}
