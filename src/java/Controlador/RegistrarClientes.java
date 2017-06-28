/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBClientes;
import Modelo.DBUsuarios;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Juan
 */
@WebServlet(name = "RegistrarClientes", urlPatterns = {"/RegistrarClientes"})
public class RegistrarClientes extends HttpServlet {

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
            DBClientes cliente = new DBClientes();
            DBUsuarios user = new DBUsuarios();

            String nombre, documento, telefono, celular, direccion, correo, usuario, contrasena, id1;
            int user_id;
            nombre = request.getParameter("nombre");
            documento = request.getParameter("documento");
            telefono = request.getParameter("telefono");
            celular = request.getParameter("celular");
            direccion = request.getParameter("direccion");
            correo = request.getParameter("correo");
            usuario = request.getParameter("usuario");
            contrasena = request.getParameter("contrasena");
            
            if (user.RegistrarUsuario(usuario, contrasena) == true) {
                
                user_id = user.BuscarIDUsuario(usuario, contrasena);

                if (cliente.RegistrarCliente(nombre, documento, telefono, celular, direccion, correo, user_id) == true) {

                    request.getRequestDispatcher("ListarClientes").forward(request, response);

                } else {
                    out.println("<h1> Fallo en la insercion</h1>");
                }
            } else {
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
