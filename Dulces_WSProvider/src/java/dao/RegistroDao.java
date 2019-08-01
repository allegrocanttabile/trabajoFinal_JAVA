
package dao;

import java.sql.Date;
import bean.RegistroBean;
import java.util.ArrayList;

public interface RegistroDao {
    public RegistroBean buscarRegistro(String Id);
    
    public Boolean createRegistro(String trackNumber,Date fechaRecojo,Date fechaEntrega, String estado);
    
    public ArrayList<RegistroBean> readRegistro();
    
    public Boolean updateRegistro (String trackNumber,Date fechaRecojo,Date fechaEntrega, String estado);
    
    public Boolean deleteRegistro(String Id);        
}
