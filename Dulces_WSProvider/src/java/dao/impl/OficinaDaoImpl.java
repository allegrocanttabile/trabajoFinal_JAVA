package dao.impl;

import bean.EclienteBean;
import bean.OficinaBean;
import dao.OficinaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class OficinaDaoImpl implements OficinaDao {

    public ConexionDB db;

    public OficinaDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public OficinaBean buscarUsuario(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createOficina(String nombre, String direccion, String telefono) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into oficina(nombre,direccion,telefono) values (?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, direccion);
            ps.setString(3, telefono);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                return true;
            }

        } catch (SQLException e) {
        }
        return false;

    }

    @Override
    public ArrayList<OficinaBean> readOficina() {
        ArrayList<OficinaBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        OficinaBean ofi = null;
        try {

            PreparedStatement ps = accesoDB.prepareStatement("select * from oficina");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                ofi = new OficinaBean();
                ofi.setNombre(rs.getString(2));
                ofi.setDireccion(rs.getString(3));
                ofi.setTelefono(rs.getString(4));
                arreglo.add(ofi);
            }

        } catch (SQLException e) {
        }
        return arreglo;

    }

    @Override
    public Boolean updateOficina(String nombre, String direccion, String telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteOficina(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
