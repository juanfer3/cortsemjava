/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionBD;
import Modelo.ControlBD;
import Modelo.DBEmpleado;
import Modelo.DBPedidos;
import Modelo.DBUsuarios;
import Modelo.Empleados;
import Modelo.Usuarios;
import static com.sun.corba.se.impl.util.Utility.printStackTrace;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
@WebServlet(name = "RegistroEmpleados", urlPatterns = {"/RegistroEmpleados"})
public class RegistroEmpleados extends HttpServlet {

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
            DBUsuarios user = new DBUsuarios();
            DBEmpleado emp = new DBEmpleado();

            String nombre_completo, fecha_nacimiento, usuario, apellido, contrasena, cargo, documento, nombre, rh, contacto, telefono_contacto, celular_contacto, telefono, celular;
            String correo_personal;
            String c1, c2, direccion;
            int id;
            int u = 0;
            int r;

            ResultSet rs = null;
            ResultSet rsu = null;
            nombre = request.getParameter("nombre");
            
            documento = request.getParameter("documento");
            cargo = request.getParameter("cargo");
            correo_personal=request.getParameter("correo_personal");
            telefono = request.getParameter("telefono");
            celular = request.getParameter("celular");
            fecha_nacimiento = request.getParameter("fecha_nacimiento");
            rh = request.getParameter("rh");
            contacto = request.getParameter("contacto_familiar");
            telefono_contacto = request.getParameter("telefono_contacto");
            celular_contacto = request.getParameter("celular_contacto");
            usuario = request.getParameter("usuario");
            direccion = request.getParameter("direccion");

            System.out.println("=========================================================="+correo_personal);

            contrasena = request.getParameter("contrasena");

            if( user.RegistrarUsuario(usuario, contrasena)){
            id = user.BuscarIDUsuario(usuario, contrasena);
            if(emp.RegistrarEmpleado(nombre, documento, cargo, correo_personal,telefono, celular, fecha_nacimiento, rh, contacto, telefono_contacto, celular_contacto, direccion, id)==true){
            
            }else{
                 out.println("<h1> Fallo en la insercion</h1>");
            }
            }else{
                 out.println("<h1> Fallo en la insercion</h1>");
            }

            request.getRequestDispatcher("ListarEmpleados").forward(request, response);
           

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
