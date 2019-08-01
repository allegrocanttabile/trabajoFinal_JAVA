
package dao;

import bean.ECategoriaBean;
import java.util.ArrayList;

public interface ECategoriaDao {
    public ECategoriaBean findECategoria(String nombre);
    public Boolean createECategoria(String nombre);
    public ArrayList<ECategoriaBean> readECategoria();
    public Boolean updateECategoria(String nombre); 
    public Boolean borrarUsuario(String id);    
}
