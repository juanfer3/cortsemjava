/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBPedidoDetallado;
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
@WebServlet(name = "InsertarPedidoDatallado", urlPatterns = {"/InsertarPedidoDatallado"})
public class InsertarPedidoDatallado extends HttpServlet {

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
            DBPedidoDetallado pedido= new DBPedidoDetallado();
            
            String prenda,tela,talla,cantidad1,valor_unitario1,valor_total1,num_pedido;
            
            int cantidad,tela_id,pedido_id;
            
            float valor_unitario,valor_total;
            
            boolean validarRegistro=false;
            
            num_pedido=request.getParameter("pedido_id");
            pedido_id=Integer.parseInt(num_pedido);
            
            prenda=request.getParameter("prenda");
            
            tela=request.getParameter("tela_id");
            tela_id=Integer.parseInt(tela);
            
            talla=request.getParameter("talla");
            
            cantidad1=request.getParameter("cantidad");
            cantidad=Integer.parseInt(cantidad1);
            
            valor_unitario1=request.getParameter("valor_unitario");
            valor_unitario=Float.parseFloat(valor_unitario1);
            
            valor_total1=request.getParameter("valor_total");
            valor_total=Float.parseFloat(valor_total1);
            
            
            validarRegistro=pedido.RegistrarPedidoDetallado(pedido_id,prenda,talla,tela_id,cantidad,valor_unitario,valor_total);
            
            if(validarRegistro==true){
            
                
                out.println(1);
            
            }else{
            
                out.println(0);
            
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
