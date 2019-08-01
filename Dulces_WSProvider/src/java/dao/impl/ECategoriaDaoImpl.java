package dao.impl;

import bean.ECategoriaBean;
import dao.ECategoriaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class ECategoriaDaoImpl implements ECategoriaDao {

    public ConexionDB db;

    public ECategoriaDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public ECategoriaBean findECategoria(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createECategoria(String nombre) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into ecategoria(nombre) values (?)");
            ps.setString(1, nombre);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                return true;
            }

        } catch (SQLException e) {
        }
        return false;

    
}

@Override
        public ArrayList<ECategoriaBean> readECategoria() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public Boolean updateECategoria(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
        public Boolean borrarUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
