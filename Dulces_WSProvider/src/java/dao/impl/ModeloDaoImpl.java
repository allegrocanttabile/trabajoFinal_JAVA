package dao.impl;

import bean.ModeloBean;
import dao.ModeloDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class ModeloDaoImpl implements ModeloDao {

    public ConexionDB db;

    public ModeloDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public ModeloBean findModelo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createModelo(String nombre) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into modelo(nombre) values (?)");
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
    public ArrayList<ModeloBean> readModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateModelo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean borrarModelo(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
