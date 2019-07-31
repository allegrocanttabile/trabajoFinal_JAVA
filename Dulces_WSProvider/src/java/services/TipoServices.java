/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import dao.impl.TipoDaoImpl;

/**
 *
 * @author AllegroCanttabile
 */
public class TipoServices {
  TipoDaoImpl tipoDaoImpl;
  
  public TipoServices(){
      tipoDaoImpl = new TipoDaoImpl();
  } 

  public Boolean createTipo(String nombre){
      return tipoDaoImpl.createTipo(nombre);
  }
    
    
}
