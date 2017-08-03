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
@WebServlet(name = "EdicionInsumos", urlPatterns = {"/EdicionInsumos"})
public class EdicionInsumos extends HttpServlet {

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
            DBInsumos ins=new DBInsumos();
            String nombre,t_unidad,cantidad1,v_unitario1,v_total1,id1;
            int id;
            float cantidad,v_unitario,v_total;
            boolean validar=false;
            
            nombre=request.getParameter("nombre");
            
            t_unidad=request.getParameter("t_unidad");
            
            cantidad1=request.getParameter("cantidad");
            cantidad=Float.parseFloat(cantidad1);
            
            v_unitario1=request.getParameter("v_unitario");
            v_unitario=Float.parseFloat(v_unitario1);
            
            v_total1=request.getParameter("v_total");
            v_total=Float.parseFloat(v_total1);
            
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
            
            validar=ins.EditarInsumos(nombre, t_unidad, cantidad, v_unitario, v_total,id);
            
            if(validar==true){
                
                out.println("Cambios Guardados");
            
            }else  if(validar==false){
            
                out.println("Cambio no permitido");
                
            }else{
            
                out.println("Error");
            
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
