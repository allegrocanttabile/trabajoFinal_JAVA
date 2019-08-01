package dao;

import java.util.List;
import bean.CargoBean;
import java.util.ArrayList;

public interface CargoDao {

    public CargoBean findCargo(String nombre);

    public Boolean createCargo(String nombre);

    public ArrayList<CargoBean> readCargo();

    public Boolean updateCargo(String nombre);

    public Boolean borrarUsuario(String id);
}
