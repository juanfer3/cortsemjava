/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.DBTelas;
import Modelo.DBTelasRecibidas;
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
@WebServlet(name = "RecibirTela", urlPatterns = {"/RecibirTela"})
public class RecibirTela extends HttpServlet {

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
            DBTelasRecibidas telas = new DBTelasRecibidas();
            String tela, cliente, tipo_de_unidad, cantidad1;
            int cliente_id, tela_id, cantidad;
            boolean validar = false;

            tela = request.getParameter("tela_id");
            tela_id = Integer.parseInt(tela);
            cliente = request.getParameter("cliente_id");
            cliente_id = Integer.parseInt(cliente);
            tipo_de_unidad = request.getParameter("tipo_de_unidad");
            cantidad1 = request.getParameter("cantidad");
            cantidad = Integer.parseInt(cantidad1);

            validar = telas.RegistrarTelaRecibida(tela_id, tipo_de_unidad, cantidad, cliente_id);

            if (validar == true) {
                out.println("Insercion exitosa");
            }else
            {

                out.println("error en la insercion");
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
