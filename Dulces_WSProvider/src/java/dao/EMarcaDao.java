package dao;

import bean.EMarcaBean;
import java.util.ArrayList;

public interface EMarcaDao {

    public EMarcaBean findEMarca(String nombre);

    public Boolean createEMarca(String nombre);

    public ArrayList<EMarcaBean> readEMarca();

    public Boolean updateEMarca(String nombre);

    public Boolean borrarUsuario(String id);
}
