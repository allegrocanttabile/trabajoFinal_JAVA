
package dao;

import bean.OficinaBean;
import java.sql.Date;
import java.util.ArrayList;

public interface OficinaDao {

    
    public OficinaBean buscarUsuario(String Id);
    
    public Boolean createOficina(String nombre,String direccion, String telefono);
    
    public ArrayList<OficinaBean> readOficina();
    
    public Boolean updateOficina (String nombre,String direccion, String telefono);
    
    public Boolean deleteOficina(String Id);    
}
