package services;

import bean.EclienteBean;
import bean.EmpresaBean;
import dao.impl.EmpresaDaoImpl;
import java.sql.Date;
import java.util.ArrayList;

public class EmpresaServices {

    EmpresaDaoImpl empresaDao;

    public EmpresaServices() {
        empresaDao = new EmpresaDaoImpl();
    }

    public Boolean createEmpresa(String nombre, String ruc, String direccion, String telefono,
            String correo) {
        return empresaDao.createEmpresa(nombre, ruc, direccion, telefono, correo);
    }

    public ArrayList<EmpresaBean> readEmpresa() {
        return empresaDao.readEmpresa();
    }
}
