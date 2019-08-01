package dao;

import bean.ModeloBean;
import java.util.List;
import java.util.ArrayList;

public interface ModeloDao {

    public ModeloBean findModelo(String nombre);

    public Boolean createModelo(String nombre);

    public ArrayList<ModeloBean> readModelo();

    public Boolean updateModelo(String nombre);

    public Boolean borrarModelo(String id);

}
