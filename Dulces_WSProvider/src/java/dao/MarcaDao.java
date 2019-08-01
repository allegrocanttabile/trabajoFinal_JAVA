package dao;

import java.util.List;
import bean.MarcaBean;
import java.util.ArrayList;

public interface MarcaDao {

    public MarcaBean findMarca(String nombre);

    public Boolean createMarca(String nombre);

    public ArrayList<MarcaBean> readMarca();

    public Boolean updateMarca(String nombre);

    public Boolean borrarMarca(String id);
}
