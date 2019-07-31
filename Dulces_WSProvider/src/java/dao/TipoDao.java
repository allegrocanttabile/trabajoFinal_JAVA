/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import bean.TipoBean;
import java.util.ArrayList;

/**
 *
 * @author AllegroCanttabile
 */
public interface TipoDao {
    
    public TipoBean findTipo(String nombre);
    public Boolean createTipo(String nombre);
    public ArrayList<TipoBean> readTipo();
    public Boolean updateTipo(String nombre); 
    public Boolean borrarUsuario(String id);
    
    
    
}
