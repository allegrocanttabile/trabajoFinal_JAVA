package dao;

import bean.EclienteBean;
import java.sql.Date;
import java.util.ArrayList;

public interface EclienteDao {

    public EclienteBean buscarUsuario(String id);

    public Boolean createEcliente(String nombres, String apellidos, String direccionEnvio, String telefono, String correo);

    public ArrayList<EclienteBean> readEcliente();

    public Boolean updateEcliente(String nombres, String apellidos, String direccionEnvio, String telefono, String correo);

    public Boolean deleteEcliente(String id);
}
