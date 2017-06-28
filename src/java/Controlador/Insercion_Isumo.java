/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ControlBD;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ALEJANDRA MOLINA
 */
@WebServlet(name = "Insercion_Isumo", urlPatterns = {"/Insercion_Isumo"})
public class Insercion_Isumo extends HttpServlet {

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
            ControlBD control= new ControlBD();
            String id1, nombre, cantidad1, precio1;
            int id,cantidad, precio;
            nombre= request.getParameter("nombre");
            id1=request.getParameter("id");
            cantidad1=request.getParameter("cantidad");
            precio1=request.getParameter("precio");
            id=Integer.parseInt(id1);
            cantidad=Integer.parseInt(cantidad1);
            precio= Integer.parseInt(precio1);
            
            if(control.RegistrarInsumos(id, nombre, cantidad, precio)){
            
               ResultSet rs= control.listarInsumos(id);
               request.setAttribute("listar", rs);
               
                RequestDispatcher rd= request.getRequestDispatcher("Formulario_completado.jsp");
                rd.forward(request, response);
            
            }else{
            
                out.println("vaya problemon");
            
            }
            
                    
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Insercion_Isumo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Insercion_Isumo at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
