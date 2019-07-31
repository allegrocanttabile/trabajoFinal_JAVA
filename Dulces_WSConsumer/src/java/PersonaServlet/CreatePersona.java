/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import ws.Date;
import ws.PersonaWS_Service;

/**
 *
 * @author AllegroCanttabile
 */
@WebServlet(name = "CreatePersona", urlPatterns = {"/CreatePersona"})
public class CreatePersona extends HttpServlet {
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/Dulces_WSProvider/PersonaWS.wsdl")
    private PersonaWS_Service service;

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            response.setContentType("text/html;charset=UTF-8");
            String nombres = request.getParameter("txtnom");
            
            if (nombres == null){
                request.setAttribute("name", null);
            }else{
                String apellidos = request.getParameter("txtape");
                String dni = request.getParameter("txtdni");
                String fechaNacimiento = request.getParameter("txtfechan");
                String sexo = request.getParameter("cbosexo");
                String direccion = request.getParameter("txtdir");
                String celular = request.getParameter("txtcel");
                String parseDate(fechaIngreso = request.getParameter("txtfechai")) ;
                String password = request.getParameter("txtpass");
                //String cargoId = request.getParameter("cbocargo");
                //String transporteId = request.getParameter("cbotrans");
                Boolean re = createSPersona(nombres, apellidos, dni, null, sexo, direccion, celular, null, password);
                if(re){
                    request.setAttribute("name", "-- Usuario registrado --");
                }else{
                    request.setAttribute("name", "--Usuario no registrado --");
                }
             
            }
            
            
        } catch (Exception e) {
            
             request.setAttribute("name", "--Usuario no registrado --");
        }
         request.getRequestDispatcher("main.jsp").forward(request, response);
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private boolean createSPersona(java.lang.String nombres, java.lang.String apellidos, java.lang.String dni, ws.Date fechaNacimiento, java.lang.String sexo, java.lang.String direccion, java.lang.String celular, ws.Date fechaIngreso, java.lang.String password) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.PersonaWS port = service.getPersonaWSPort();
        return port.createSPersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, password);
    }
    
    
    

}
