
package dao;

import bean.EModeloBean;
import java.util.ArrayList;

public interface EModeloDao {
    public EModeloBean findEModelo(String nombre);

    public Boolean createEModelo(String nombre);

    public ArrayList<EModeloBean> readEModelo();

    public Boolean updateEModelo(String nombre);

    public Boolean borrarUsuario(String id);   
}
