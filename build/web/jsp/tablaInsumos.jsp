<%-- 
    Document   : tablaInsumos
    Created on : 7/03/2017, 11:21:00 PM
    Author     : ALEJANDRA MOLINA
--%>


<%@page import="Modelo.ControlBD"%>
<%ControlBD control=new ControlBD();   

    


%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<form class="form-inline formulario" action="login">
                <table border="2">
                    <thead><th>Id</th><th>Nombre</th><th>Cantidad</th><th>Precio</th></thead>
                <tbody>
                    <%ResultSet r=(ResultSet)request.getAttribute("listar");
                    
    while(r.next()){%>
                    <tr>
                        <td><%= r.getInt(1) %></td>
                        <td><%= r.getString(2) %></td>
                        <td><%= r.getInt(3) %></td>
                        <td><%= r.getInt(4) %></td>
                    </tr>
                    <%}%>                </tbody>
                <tfoot><tr><td colspan="4" style="text-align: center">Cortem</td></tr></tfoot>
                </table>
                
            </form>
