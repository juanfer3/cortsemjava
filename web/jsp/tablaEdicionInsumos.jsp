<%-- 
    Document   : tablaEdicionEmpleados
    Created on : 17/04/2017, 11:05:34 AM
    Author     : Juan
--%>

<%@page import="Modelo.Insumos"%>
<%@page import="Modelo.DBInsumos"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<script src="script/insumosEdicion.js"></script>
<%          DBInsumos insumos=new DBInsumos();
          
            ArrayList<Insumos> Listar=new ArrayList();
            Listar.clear();            
            String id1;
            int id;
            id1=request.getParameter("id");
            id=Integer.parseInt(id1);
            Listar=insumos.ListarinsumosPorId(id);

    
    for (Insumos myemp : Listar) {
%>
<div class="container" id="tablaEdicionEmpleados">

    <div class="row">
        <div class="col-md-12">
            <form action="#">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title"><%=myemp.getNombre()%></h3>
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
                            <th><h4>Informacion</h4></th>
                            <th><h4>Datos</h4></th>

                        </tr>
                    </thead>    <tr> </tr>

                    <tbody>
                        <tr>
                            <th>Nombre</th>
                            <td><input type="text" style="" value="<%=myemp.getNombre()%>" class="form-control nombbre" name="nombre" id="nombre"> </td>
                        </tr>
                        
                        <tr>
                            <th>Tipo de unidad</th>
                            <td><input style=""  class="form-control t_unidad" value="<%=myemp.getTipoDeUnidad() %>" name="t_unidad" id="t_unidad"> </td>
                        </tr>
                        <tr>
                            <th>Cantidad</th>
                            <td><input type="text" style="" value="<%=myemp.getCantidad() %>" class="form-control cantidad" name="cantidad" id="cantidad"></td>
                        </tr>
                        <tr>
                            <th>Valor unitario</th>
                            <td><input type="text" style="" value="<%=myemp.getValorUnitario() %>" class="form-control v_unitario" name="v_unitario" id="v_unitario"></td>
                        </tr>
                        <tr>
                            <th>Valor total</th>
                            <td><input type="text" style="" value="<%=myemp.getValorTotal() %>" class="form-control v_total" name="v_total" id="v_total"></td>
                        </tr>
                        
                       
                        
                        
                    <input value="<%=myemp.getId()%>" style="visibility:hidden" name="id" id="id">
                        
                    </tbody>


                </table>
                       
                    
            </div>
                    <div class="row">
                        <div class="col-xs-6 col-md-6"><input type="button" value="aceptar" class="btn btn-primary btn-block btn-lg aceptar" tabindex="7" id="aceptar"></div>
                                    <div class="col-xs-6 col-md-6"><a href="ListarInsumos.jsp" class="btn btn-danger btn-block btn-lg cancelar" id="cancelar">cancelar</a></div>
                                </div>
                    </form>
        </div>

    </div>
                      
</div>
<%

    }%>