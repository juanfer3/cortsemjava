/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBFacturas;
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
@WebServlet(name = "RegistrarFactura", urlPatterns = {"/RegistrarFactura"})
public class RegistrarFactura extends HttpServlet {

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
            DBFacturas fac=new DBFacturas();
            String pedido,pedido_detallado,empleado,iva1,descuento1,total1;
            int id_pedido, id_pedido_detallado,id_empleado;
            float iva,descuento, total; 
            boolean validar=false;
            
            pedido=request.getParameter("pedido");
            id_pedido=Integer.parseInt(pedido);
            
            pedido_detallado=request.getParameter("pedido_detallado");
            id_pedido_detallado=Integer.parseInt(pedido_detallado);
            
            empleado=request.getParameter("empleado");
            id_empleado=Integer.parseInt(empleado);
            
            iva1=request.getParameter("iva");
            iva=Float.parseFloat(iva1);
            
            descuento1=request.getParameter("descuento");
            descuento=Float.parseFloat(descuento1);
            
            total1=request.getParameter("total");
            total=Float.parseFloat(total1);
            
            validar=fac.CrearFactura(id_pedido, id_pedido_detallado, id_empleado, iva, descuento, total);
            
            if(validar==true){
                
                out.println("Insercion Correcta");
                
            }else{
                
                out.println("Fallo en la insercion");
               
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
