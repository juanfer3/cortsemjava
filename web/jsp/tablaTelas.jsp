<%-- 
    Document   : tablaEmpleados
    Created on : 27/03/2017, 10:23:00 PM
    Author     : ALEJANDRA MOLINA
--%>

<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.Telas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Empleados"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="script/ListarTelasfunc.js"></script>
<div class="container" id="tablaListarTelas">
    <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Empleados</h3>
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
                            
                            <th>Editar</th>
                            <th>Eliminar</th>
                        </tr>
                    </thead>
                    <%ArrayList<Telas> Listar = new ArrayList();
                        DBTelas mistelas=new DBTelas();
                        Listar.clear();
                        Listar=mistelas.ListarTelas();
                        int cont;
                        cont = 1;
                        for (Telas cloth : Listar) {

                    %>
                    
                    <tbody>
                        <tr class="padre">
                            <td><%=cont%></td>
                            <td><%=cloth.getRefTela()%></td>
                            <td><%=cloth.getDescripcion() %> </td>
                            <td><input class="id hijo" value="<%=cloth.getId() %>" style="visibility:hidden"> </td>
                     
                            <td align="center"><a href="#" id="llamartablaeditarEmpleados" class="editar"><span><img src="imagenes/editar.png"></span></a></td>
                            <td align="center"><a href="#" class="eliminar"><span><img src="imagenes/borrar.png"></span></a></td>

                        </tr>

                    </tbody>

                  



                    <%;%>
                    <%cont += 1;
                        }%>
                </table>
            </div>
        </div>

    </div>
    <div class="row ">

        <div class="col-xs-12 col-md-12"><a href="RegistroEmpleado.jsp" class="btn btn-success btn-block btn-lg">Registrar Empleado</a></div>
    </div>
</div>
