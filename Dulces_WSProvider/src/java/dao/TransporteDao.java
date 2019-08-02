package dao;

import bean.TransporteBean;
import java.sql.Date;
import java.util.ArrayList;

public interface TransporteDao {

    public TransporteBean buscarTransporte(String Id);

    public Boolean createTransporte(String placa, String anoFabricacion, String fechaMantenimiento);

    public ArrayList<TransporteBean> readTransporte();

    public Boolean updateTransporte(String placa, String anoFabricacion, String fechaMantenimiento);

    public Boolean deleteTransporte(String Id);
}
