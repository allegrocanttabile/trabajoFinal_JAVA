
package dao.impl;

import bean.TipoBean;
import dao.TipoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class TipoDaoImpl implements TipoDao {
    
   public ConexionDB db;
   public TipoDaoImpl(){
       db = new ConexionDB();
   }

    @Override
    public TipoBean findTipo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createTipo(String nombre) {
       Connection accesoDB = db.getConexion();
        try {
            
                PreparedStatement ps = accesoDB.prepareStatement("insert into tipo(nombre) values (?)");
                ps.setString(1, nombre);
                
                int rs = ps.executeUpdate();

                if(rs>0){
                    return true;
                }
            
        } catch (SQLException e) {
        }
        return false;
        
        
    }

    @Override
    public ArrayList<TipoBean> readTipo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateTipo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean borrarUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
