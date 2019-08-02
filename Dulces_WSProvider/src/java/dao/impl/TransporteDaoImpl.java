package dao.impl;

import bean.RegistroBean;
import bean.TransporteBean;
import dao.TransporteDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.ConexionDB;


public class TransporteDaoImpl implements TransporteDao {

    public ConexionDB db;

    public TransporteDaoImpl() {
        db = new ConexionDB();
    }

    @Override
    public TransporteBean buscarTransporte(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean createTransporte(String placa, String anoFabricacion, String fechaMantenimiento) {
        Connection accesoDB = db.getConexion();
        try {

            PreparedStatement ps = accesoDB.prepareStatement("insert into transporte(placa,anoFabricacion,fechaMantenimiento) values (?,?,?)");
            ps.setString(1, placa);
            ps.setString(2, anoFabricacion);
            ps.setString(3, fechaMantenimiento);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                return true;
            }

        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public ArrayList<TransporteBean> readTransporte() {
         ArrayList<TransporteBean> arreglo = new ArrayList<>();
        Connection accesoDB = db.getConexion();
        TransporteBean trans = null;
        try {

            PreparedStatement ps = accesoDB.prepareStatement("select * from transporte");

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                trans = new TransporteBean();
                trans.setPlaca(rs.getString(2));
                trans.setAnoFabricacion(rs.getString(3));
                trans.setFechaMantenimiento(rs.getString(4));
                arreglo.add(trans);
            }

        } catch (SQLException e) {
        }
        return arreglo;
    }

    @Override
    public Boolean updateTransporte(String placa, String anoFabricacion, String fechaMantenimiento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Boolean deleteTransporte(String Id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

}
