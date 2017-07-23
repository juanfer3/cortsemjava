<%-- 
    Document   : tablaEdicionTelas
    Created on : 25/06/2017, 10:23:44 PM
    Author     : Juan
--%>


<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.Telas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="script/ListarTelasfunc.js"></script>
<div class="container" id="tablaEdicionTelas">
    <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Editar Telas</h3>
                    <div class="pull-right">
                        <span class="clickable filter" data-toggle="tooltip" title="Toggle table filter" data-container="body">

                        </span>
                    </div>
                </div>
                <div class="panel-body">
                    <input type="text" class="form-control" id="dev-table-filter" data-action="filter" data-filters="#dev-table" placeholder="Filter Developers" />
                </div>
                <table class="table table-hover" id="dev-table">
                    <thead>
                        <tr>
                            <th>#</th>
                            <th>Referencia Tela</th>
                            <th>Descripcion</th>
                            <th></th>
                            
                        </tr>
                    </thead>
                    <%
                        String id1;
                        int id;
                        
                        id1 = request.getParameter("id");
                        id=Integer.parseInt(id1);
                        
                        ArrayList<Telas> Listar = new ArrayList();
                        DBTelas mistelas=new DBTelas();
                        Listar.clear();
                        Listar=mistelas.ListarTelasPorId(id);
                        int cont;
                        cont = 1;
                        for (Telas cloth : Listar) {

                    %>
                    
                    <tbody>
                        <tr class="padre">
                            <td><%=cont%></td>
                            <td><input value="<%=cloth.getRefTela()%>" id="ref_tela"></td>
                            <td><input value="<%=cloth.getDescripcion() %>" id="descripcion_tela" </td>
                            <td><input class="id hijo" value="<%=cloth.getId() %>" style="visibility:hidden" id="id"> </td>
                            
                        </tr>

                    </tbody>

                  



                    <%;%>
                    <%cont += 1;
                        }%>
                </table>
            </div>
        </div>

    </div>
      
                <div class="row">
                    
                    <div class="col-xs-3 col-md-3 col-md-offset-3"><button class="btn btn-success btn-block" id="aceptarEdicion">Aceptar</button></div>
                    <div class="col-xs-3 col-md-3"><button class="btn btn-danger btn-block" id="cancelarEdicion">Cancelar</button></div>
                </div>            
                
    
</div>

