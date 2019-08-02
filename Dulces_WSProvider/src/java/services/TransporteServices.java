
package services;


import bean.TransporteBean;
import dao.impl.TransporteDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author isai
 */
public class TransporteServices {
       TransporteDaoImpl transporteDao;

    public TransporteServices() {
        transporteDao = new TransporteDaoImpl();
    }

    public Boolean createTransporte(String placa, String anoFabricacion, String fechaMantenimiento) {
        return transporteDao.createTransporte(placa, anoFabricacion, fechaMantenimiento);
    }

    public ArrayList<TransporteBean> readTransporte() {
        return transporteDao.readTransporte();
    } 
}
