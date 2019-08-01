package dao;

import java.util.List;
import bean.TipoBean;
import java.util.ArrayList;

public interface TipoDao {

    public TipoBean findTipo(String nombre);

    public Boolean createTipo(String nombre);

    public ArrayList<TipoBean> readTipo();

    public Boolean updateTipo(String nombre);

    public Boolean borrarUsuario(String id);

}
