/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBEmpleado;
import Modelo.Empleados;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan
 */
@WebServlet(name = "Empleadomodal", urlPatterns = {"/Empleadomodal"})
public class Empleadomodal extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            DBEmpleado emp=new DBEmpleado();
    ArrayList<Empleados> Listar=new ArrayList();
    
    String id1;
    int id;
    id1=request.getParameter("id");
    id=Integer.parseInt(id1);
    Listar=emp.listarEmpleadoPorId(id);
    
    for(Empleados myemp:Listar){
            
        out.println("Nombre: "+myemp.getNombre());
        out.println("Documento: "+myemp.getDocumento());
        out.println("FNacimiento: "+myemp.getFNacimiento());
        out.println("Telefono: "+myemp.getTelefono());
        out.println("Celular: "+myemp.getCelular());
        out.println("Direccion: "+myemp.getDireccion());
        out.println("Cargo: "+myemp.getCargo());
        out.println("Rh: "+myemp.getRh());
        out.println("ContactoFamiliar: "+myemp.getContactoFamiliar());
        
    }
            
       
      
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

}
