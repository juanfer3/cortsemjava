/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConexionBD;
import Modelo.DBEmpleado;
import Modelo.Empleados;
import Modelo.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
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
 * @author Juan
 */
@WebServlet(name = "EditarEmpleados", urlPatterns = {"/EditarEmpleados"})
public class EditarEmpleados extends HttpServlet {

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
            ArrayList <Empleados> Listar=new ArrayList();
            Listar.clear();
            DBEmpleado emp=new DBEmpleado();
            String id1, sql;
            int id;
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
            sql= "SELECT empleados.nombre, empleados.documento, empleados.cargo, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id where empleados.id='"+id+"';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();
            
            try {
                Statement st= con.createStatement();
                ResultSet rs= st.executeQuery(sql);
                
                if(rs.next()){
                    Empleados myemp= new Empleados();
                    Usuarios myuser= new Usuarios();
                    
                    
                    myemp.setNombre(rs.getString("nombre"));
                    myemp.setDocumento(rs.getString("documento"));
                    myemp.setCargo(rs.getString("cargo"));
                    myemp.setTelefono(rs.getString("telefono"));
                    myemp.setCelular(rs.getString("celular"));
                    myemp.setFNacimiento(rs.getDate("f_nacimiento"));
                    myemp.setContactoFamiliar(rs.getString("contacto_familiar"));
                    myemp.setTelefonoContacto(rs.getString("telefono_contacto"));
                    myemp.setCelularContacto(rs.getString("celular_contacto"));
                    myemp.setDireccion(rs.getString("direccion"));
                    myemp.setRh(rs.getString("rh"));
                    myuser.setUsuario(rs.getString("usuario"));
                    myemp.setId(rs.getInt("id"));
                    myemp.setUsuarioId(myuser); 
                    
                    Listar.add(myemp);
                
                }
                
                bd.cierraConexion();
                
                
            } catch (SQLException ex) {
                Logger.getLogger(EditarEmpleados.class.getName()).log(Level.SEVERE, null, ex);
            }
            request.setAttribute("Listar_Empleado", Listar);
            RequestDispatcher rd= request.getRequestDispatcher("PaginaEditarEmpleados.jsp");
            rd.forward(request, response);
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
