package dao.impl;

import bean.EmpresaBean;
import bean.TransporteBean;
import dao.EmpresaDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.activation.DataSource;
import utils.ConexionDB;

public class EmpresaDaoImpl implements EmpresaDao {

    public ConexionDB db;

    public EmpresaDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public EmpresaBean buscarEmpresa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createEmpresa(String nombre, String ruc, String direccion, String telefono, String correo) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into empresa(nombre,ruc,direccion,telefono,correo) values (?,?,?,?,?)");
            ps.setString(1, nombre);
            ps.setString(2, ruc);
            ps.setString(3, direccion);
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
    public ArrayList<EmpresaBean> readEmpresa() {
        ArrayList<EmpresaBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        EmpresaBean emp = null;
        try {

            PreparedStatement ps = accesoDB.prepareStatement("select * from empresa");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                emp = new EmpresaBean();
                emp.setNombre(rs.getString(2));
                emp.setRuc(rs.getString(3));
                emp.setDireccion(rs.getString(4));
                emp.setTelefono(rs.getString(5));
                emp.setCorreo(rs.getString(6));
                arreglo.add(emp);
            }

        } catch (SQLException e) {
        }
        return arreglo;

    }

    @Override
    public Boolean updateEmpresa(String nombre, String ruc, String direccion, String telefono, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteEmpresa(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
