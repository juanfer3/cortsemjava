/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.ConexionBD;
import Modelo.DBClientes;
import Modelo.DBUsuarios;
import Modelo.Empleados;
import Modelo.Usuarios;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.console;
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
import javax.servlet.http.HttpSession;

/**
 *
 * @author Juan
 */
@WebServlet(name = "Loguin", urlPatterns = {"/Loguin"})
public class Loguin extends HttpServlet {

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
            DBClientes client=new DBClientes();
            String usuario, contrasena,rol,rolcliente;
            rol="";
            rolcliente="";
            usuario = request.getParameter("usuario");
            contrasena = request.getParameter("contrasena");
            user.ValidarUsuario(usuario, contrasena);
            ArrayList<Empleados> ListarEmpleados = new ArrayList();
            ArrayList<Clientes> ListarClientes= new ArrayList();
            ListarEmpleados.clear();
            ListarClientes.clear();
            ResultSet rs = null;
            String sql = "SELECT empleados.nombre, empleados.documento, empleados.cargo, empleados.telefono, empleados.celular, empleados.f_nacimiento, empleados.rh, empleados.contacto_familiar,empleados.telefono_contacto,empleados.celular_contacto,empleados.direccion,empleados.id,usuarios.usuario from  usuarios inner join empleados on usuarios.id = empleados.usuario_id where usuarios.usuario='" + usuario + "' AND contrasena='" + contrasena + "';";
            ConexionBD bd = new ConexionBD();
            Connection con = bd.conectar();

            try {
                Statement st = con.createStatement();
                rs = st.executeQuery(sql);

                if (rs.next()) {
                    
                    Empleados myemp = new Empleados();
                    

                    
                    myemp.setCargo(rs.getString("cargo"));
                    
                   
                    ListarEmpleados.add(myemp);
                    
                    
                    
                }else{
                
                    
                
                }
                
                bd.cierraConexion();
            } catch (SQLException ex) {
                Logger.getLogger(DBClientes.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            for(Empleados ele: ListarEmpleados){
            
                rol=ele.getCargo();
            
            }
            
            ListarClientes=client.ListarClienteUser(usuario, contrasena);
            
            for(Clientes ele: ListarClientes){
            
                rolcliente=ele.getCargo();
            
            }
            
            
            System.out.println(rol+"==========================================");
            System.out.println(rolcliente+"==========================================");
            if (user.ValidarUsuario(usuario, contrasena) == true) {
                
                HttpSession sc = request.getSession();
                sc.setAttribute("usuario", usuario);
                sc.setAttribute("contrasena", contrasena);
                sc.setAttribute("rol", rol);
                sc.setAttribute("rolcliente", rolcliente);
                RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
                rd.forward(request, response);
            }else{
            
            
            
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
