/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "AceptarEdicionEmpleado", urlPatterns = {"/AceptarEdicionEmpleado"})
public class AceptarEdicionEmpleado extends HttpServlet {

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
            DBEmpleado emp = new DBEmpleado();
            String nombre, documento, cargo, f_nacimiento, telefono, celular,
                    rh, contacto_familiar, telefono_contacto, celular_contacto,
                    direccion, usuario, id1;

            int id;
            nombre=request.getParameter("nombre");
            documento=request.getParameter("documento");
            cargo=request.getParameter("cargo");
            telefono=request.getParameter("telefono");
            celular=request.getParameter("celular");
            direccion=request.getParameter("direccion");
            rh=request.getParameter("rh");
            f_nacimiento=request.getParameter("fnacimiento");
            contacto_familiar=request.getParameter("contacto_familiar");
            telefono_contacto=request.getParameter("telefono_contacto");
            celular_contacto=request.getParameter("celular_contacto");
            usuario=request.getParameter("usuario");
            
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
           
            if(emp.EditarEmpleado(
                    nombre, documento, cargo, telefono, celular, f_nacimiento, rh, 
                    contacto_familiar, telefono_contacto, celular_contacto, direccion, id)==true){
                request.getRequestDispatcher("ListarEmpleados").forward(request, response);
            
            }else{
            
                 out.println("<h1> Fallo en la insercion</h1>");
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
