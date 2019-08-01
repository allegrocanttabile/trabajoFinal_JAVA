package dao;

import bean.EmpresaBean;
import java.util.ArrayList;

public interface EmpresaDao {

    public EmpresaBean buscarEmpresa(String id);

    public Boolean createEmpresa(String nombre, String ruc, String direccion, String telefono, String correo);

    public ArrayList<EmpresaBean> readEmpresa();

    public Boolean updateEmpresa(String nombre, String ruc, String direccion, String telefono, String correo);

    public Boolean deleteEmpresa(String id);
}
