package dao.impl;

import bean.OficinaBean;
import bean.RegistroBean;
import dao.RegistroDao;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class RegistroDaoImpl implements RegistroDao {

    public ConexionDB db;

    public RegistroDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public RegistroBean buscarRegistro(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createRegistro(String trackNumber, Date fechaRecojo, Date fechaEntrega, String estado) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into registro(trackNumber,fechaRecojo,fechaEntrega,estado) values (?,?,?,?)");
            ps.setString(1, trackNumber);
            ps.setDate(2, fechaRecojo);
            ps.setDate(3, fechaEntrega);
            ps.setString(4, estado);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                return true;
            }

        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public ArrayList<RegistroBean> readRegistro() {
        ArrayList<RegistroBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        RegistroBean re = null;
        try {

            PreparedStatement ps = accesoDB.prepareStatement("select * from registro");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                re = new RegistroBean();
                re.setTrackNumber(rs.getString(2));
                re.setFechaRecojo(rs.getString(3));
                re.setFechaEntrega(rs.getString(4));
                re.setEstado(rs.getString(5));
                arreglo.add(re);
            }

        } catch (SQLException e) {
        }
        return arreglo;

    }

    @Override
    public Boolean updateRegistro(String trackNumber, Date fechaRecojo, Date fechaEntrega, String estado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteRegistro(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
