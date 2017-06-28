<%-- 
    Document   : tablaPedido.jsp
    Created on : 8/05/2017, 08:26:47 PM
    Author     : Juan
--%>

<%@page import="Modelo.Telas"%>
<%@page import="Modelo.DBClientes"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.Clientes"%>
<%@page import="Modelo.DBPedidoDetallado"%>
<%@page import="Modelo.DBPedidos"%>
<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.DBColor"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>
<% DBColor color = new DBColor();
    DBTelas telas = new DBTelas();
    DBPedidos pedidos = new DBPedidos();
    DBPedidoDetallado detallado = new DBPedidoDetallado();
    DBClientes clientes = new DBClientes();

%>


<%String documento_cliente = (String) request.getParameter("documento");
    String cont1 = (String) request.getParameter("contador");
    String fecha_pedido = (String) request.getParameter("f_pedido");
    String fecha_entrega = (String) request.getParameter("f_entrega");
    String descripcion_pedido = (String) request.getParameter("descripcion_pedido");
    int cont = Integer.parseInt(cont1);
    int cliente_id = 0;
    ArrayList<Clientes> ListarClientes = new ArrayList();
    ListarClientes.clear();
    ListarClientes = clientes.BuscarIdporNit(documento_cliente);
    
    for (Clientes myCliente : ListarClientes) {
        cliente_id = myCliente.getId();

    }%>

<%if (cont == 1) {%>

<%--insercion pedido--%>
<%

    boolean registro = false;

    registro = pedidos.RegistrarPedido(fecha_pedido, fecha_entrega, cliente_id);

    
}%>






<%--insercion telas--%>
<% String ref_tela = (String) request.getParameter("ref_tela");
    String descripcion_tela = (String) request.getParameter("descripcion_tela");
    String diseno_tela = (String) request.getParameter("diseno_tela");
    int tela_id = 0;
    
   
    if (telas.BuscarTelaPorReferencia(ref_tela) == false) {

        telas.RegistrarTela(ref_tela, descripcion_tela, diseno_tela);

        ArrayList<Telas> ListarTelas = new ArrayList();
        ListarTelas.clear();
        ListarTelas = telas.buscarIdPorRef(ref_tela);
        for (Telas mytela : ListarTelas) {

            tela_id = mytela.getId();

        }

    } else {
        
        ArrayList<Telas> ListarTelas = new ArrayList();
        ListarTelas.clear();
        ListarTelas = telas.buscarIdPorRef(ref_tela);
        for (Telas mytela : ListarTelas) {
            
            tela_id = mytela.getId();

        }

    }
   %>
<%--insercion pedido detallado  detallado.RegistrarPedidoDetallado(pedido_id, prenda, talla, tela_id, cantidad, valor, iva, valor_total);--%>
<%
    String prenda = (String) request.getParameter("prenda");
    String pieza = (String) request.getParameter("pieza");
    String talla = (String) request.getParameter("talla");
    String cantidad1 = (String) request.getParameter("cantidad");
    int cantidad = Integer.parseInt(cantidad1);
    String valor_unitario = (String) request.getParameter("valor_unitario");
    float valor = Float.parseFloat(valor_unitario);
    String iva1 = (String) request.getParameter("iva");
    float iva = Float.parseFloat(iva1);
    String valor_total1 = (String) request.getParameter("valor_total");
    float valor_total = Float.parseFloat(valor_total1);
    int pedido_id = 1;
   
    detallado.RegistrarPedidoDetallado(pedido_id, prenda, talla, tela_id, cantidad, valor, iva, valor_total);
   


%>







<div class="row">
    <div class="col-md-12">
        <div class="panel panel-primary">
            <div class="panel-heading">
                <h3 class="panel-title">Mostrar</h3>
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

                        <th>Prenda</th>
                        <th>Pieza</th>
                        <th>Talla</th>
                        <th>Cantidad</th>
                        <th>Eliminar</th>

                    </tr>
                </thead>

                <tbody class="colocar">
                    <tr>

                <td><%=prenda%></td>
                <td><%=pieza%></td>
                <td><%=talla%></td>        
                <td><%=cantidad1%></td>
                <td></td>

                    </tr>
                    <tr>

                        <th>Referencia tela</th>
                        <th>Descripción</th>
                        <th>Diseño</th>
                        <th>Valor unitario</th>
                        <th></th>

                    </tr>
                    <tr>

                <td><%=ref_tela%></td>
                <td><%=descripcion_tela%></td>
                <td><%=diseno_tela%></td>        
                <td><%=valor_unitario%></td>
                <td><a href="#" id="eliminar"><span class="glyphicon glyphicon-remove eliminar"></span></a></td>
                <td><button type="button" class="glyphicon glyphicon-remove eliminar"></button></td>
                    </tr>
                    <tr>
                        <td><%=iva%></td>
                        <td><%=valor_total1%></td>
                        <td></td>
                        <td></td>
                        <td></td>
                    </tr>
                    

                </tbody>


            </table>
        </div>
    </div>
    
</div>