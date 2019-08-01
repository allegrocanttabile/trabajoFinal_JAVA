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
        
//        try {
//            response.setContentType("text/html;charset=UTF-8");
//            String nombres = request.getParameter("txtnom");
//            
//            if (nombres == null){
//                request.setAttribute("name", null);
//            }else{
//                String apellidos = request.getParameter("txtape");
//                String dni = request.getParameter("txtdni");
//                String fechaNacimiento = request.getParameter("txtfechan");
//                String sexo = request.getParameter("cbosexo");
//                String direccion = request.getParameter("txtdir");
//                String celular = request.getParameter("txtcel");
//                String fechaIngreso = request.getParameter("txtfechai");
//                String password = request.getParameter("txtpass");
//                String cargoId = request.getParameter("cbocargo");
//                String transporteId = request.getParameter("cbotrans");
//                Boolean re = createSPersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, 
//        password, cargoId, transporteId);
//                if(re){
//                    request.setAttribute("name", "-- Usuario registrado --");
//                }else{
//                    request.setAttribute("name", "--Usuario no registrado --");
//                }
//             
//            }
//            
//            
//        } catch (Exception e) {
//            
//             request.setAttribute("name", "--Usuario no registrado --");
//        }
//         request.getRequestDispatcher("Dashboard/views/Personal.jsp").forward(request, response);
        
        response.setContentType("text/html;charset=UTF-8");
        
        String nombres = request.getParameter("txtnom");
        String apellidos = request.getParameter("txtape");
        String dni = request.getParameter("txtdni");
        String fechaNacimiento = request.getParameter("txtfechan");
        String sexo = request.getParameter("cbosexo");
        String direccion = request.getParameter("txtdir");
        String celular = request.getParameter("txtcel");
        String fechaIngreso = request.getParameter("txtfechai");
        String password = request.getParameter("txtpass");
        String cargoId = request.getParameter("cbocargo");
        String transporteId = request.getParameter("cbotrans");
        
        Boolean re = createSPersona(nombres, apellidos, dni, fechaNacimiento,
                sexo, direccion, celular, fechaIngreso, password, cargoId, transporteId);
        
        if(re!= null){
                       
            response.sendRedirect("Dashboard/views/Personal.jsp");
        }else{
          response.sendRedirect("main.jsp");  
        }
        
        
        
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

    private boolean createSPersona(java.lang.String nombres, java.lang.String apellidos, java.lang.String dni, java.lang.String fechaNacimiento, java.lang.String sexo, java.lang.String direccion, java.lang.String celular, java.lang.String fechaIngreso, java.lang.String password, java.lang.String cargoId, java.lang.String transporteId) {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        ws.PersonaWS port = service.getPersonaWSPort();
        return port.createSPersona(nombres, apellidos, dni, fechaNacimiento, sexo, direccion, celular, fechaIngreso, password, cargoId, transporteId);
    }

    
    
    
    
    

}
