package dao.impl;

import bean.EclienteBean;
import bean.PersonaBean;
import dao.EclienteDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class EclienteDaoImpl implements EclienteDao {

    public ConexionDB db;

    public EclienteDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public EclienteBean buscarUsuario(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createEcliente(String nombres, String apellidos, String direccionEnvio, String telefono, String correo) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into ecliente(nombres,apellidos,direccionEnvio,telefono,correo) values (?,?,?,?,?)");
            ps.setString(1, nombres);
            ps.setString(2, apellidos);
            ps.setString(3, direccionEnvio);
            ps.setString(4, telefono);
            ps.setString(5, correo);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                return true;
            }

        } catch (SQLException e) {
        }
        return false;

    }

    @Override
    public ArrayList<EclienteBean> readEcliente() {

        ArrayList<EclienteBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        EclienteBean cli = null;
        try {

            PreparedStatement ps = accesoDB.prepareStatement("select * from ecliente");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                cli = new EclienteBean();
                cli.setNombres(rs.getString(2));
                cli.setApellidos(rs.getString(3));
                cli.setDireccionEnvio(rs.getString(4));
                cli.setTelefono(rs.getString(5));
                cli.setCorreo(rs.getString(6));
                arreglo.add(cli);
            }

        } catch (SQLException e) {
        }
        return arreglo;

    }

    @Override
    public Boolean updateEcliente(String nombres, String apellidos, String direccionEnvio, String telefono, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteEcliente(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
