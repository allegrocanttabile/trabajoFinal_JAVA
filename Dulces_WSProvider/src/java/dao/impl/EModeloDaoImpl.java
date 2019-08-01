package dao.impl;

import bean.EModeloBean;
import dao.EModeloDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class EModeloDaoImpl implements EModeloDao {

    public ConexionDB db;

    public EModeloDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public EModeloBean findEModelo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createEModelo(String nombre) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into emodelo(nombre) values (?)");
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
    public ArrayList<EModeloBean> readEModelo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean updateEModelo(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean borrarUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
