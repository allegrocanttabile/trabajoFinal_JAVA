package services;


import bean.RegistroBean;
import dao.impl.RegistroDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

public class RegistroServices {
    RegistroDaoImpl registroDao;

    public RegistroServices() {
        registroDao = new RegistroDaoImpl();
    }

    public Boolean createRegistro(String trackNumber, Date fechaRecojo,Date fechaEntrega, String estado) {
        return registroDao.createRegistro(trackNumber,fechaRecojo, fechaEntrega,estado);
    }

    public ArrayList<RegistroBean> readRegistro() {
        return registroDao.readRegistro();
    }
}
