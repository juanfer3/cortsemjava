/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBInsumos;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author USUARIO
 */
@WebServlet(name = "InsercionInsumos", urlPatterns = {"/InsercionInsumos"})
public class InsercionInsumos extends HttpServlet {

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
            DBInsumos insumos=new DBInsumos();
            String nombre, cantidad1,tipo_de_unidad,valor_unitario1,valor_total1;
            float cantidad,valor_unitario,valor_total;
            int id_empleado=1;
            boolean validar=false;
                    
            nombre=request.getParameter("nombre");
            tipo_de_unidad=request.getParameter("t_unidad");
            
            cantidad1=request.getParameter("cantidad");
            cantidad=Float.parseFloat(cantidad1);
            
            valor_unitario1=request.getParameter("valor_unitario");
            valor_unitario=Float.parseFloat(valor_unitario1);
            
            valor_total1=request.getParameter("valor_total");
            valor_total=Float.parseFloat(valor_total1);
            
            validar=insumos.RegistrarInsumos(nombre, tipo_de_unidad, cantidad, valor_unitario, valor_total, id_empleado);
            if(validar==true){
            
                out.println("Insumo registrado");
                
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
