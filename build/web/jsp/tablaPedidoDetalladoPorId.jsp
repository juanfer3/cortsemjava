<%-- 
    Document   : tablaPedidoDetalladoPorId
    Created on : 4/07/2017, 11:18:04 PM
    Author     : Juan
--%>

<%@page import="Modelo.Pedidos"%>
<%@page import="Modelo.DBPedidos"%>
<%-- 
    Document   : tablaPedidosDetalladosPorID
    Created on : 26/06/2017, 08:52:26 PM
    Author     : Juan
--%>

<%@page import="Modelo.PedidosDetallados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.DBPedidoDetallado"%>
<!--script src="script/PedidosDetalladosFunc.js"></script-->
<%
    DBPedidos pedido=new DBPedidos();
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    
    ArrayList<Pedidos>ListarCliente=new ArrayList(); 
    ArrayList<PedidosDetallados>Listar=new ArrayList();
    Listar.clear();
    
    String id1;
    int id;
    
    String idp;
    int id_pedido;
    

    
    id1=(String) request.getParameter("id");
    id=Integer.parseInt(id1);
    
    ListarCliente=pedido.BuscarUltimoPedido(id);
    Listar=detalle.BuscarDetallesDePedidosPorIdPedido(id);
    
%>
<script src="script/llamadoDetallesTabla.js"></script>

<% for(Pedidos mypedido:ListarCliente){
%>
<h6>Cliente:<%=mypedido.getClienteId().getNombre() %> </h6>
<h6>N° pedido:<%=mypedido.getId()%></h6>
<h6>Fecha de pedido: <%=mypedido.getFPedido()%></h6>
<h6>Fecha de entrega: <%=mypedido.getFEntrega()%></h6>


<%

}%>


<form method="POST">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Pedidos</h3>
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
                                <th>Tela</th>
                                <th>Talla</th>
                                <th>Cantidad</th>
                                
                                <th>Valor Total</th>
                                
                                <th></th>
                              
                            </tr>
                        </thead>
      
                        <tbody class="ListedePedidos">
                            
                            <%for(PedidosDetallados mypedido:Listar){%>
                            <tr>
                                <td><%=mypedido.getPrenda()%></td>
                                <td><%=mypedido.getTelasId().getRefTela() %></td>
                                <td><%=mypedido.getTalla() %></td>
                                <td><%=mypedido.getCantidad()%></td>
                                <td><%=mypedido.getValorTotal()%></td>
                                <td><p class="id" style="visibility: hidden;"><%=mypedido.getId()%></p></td>
                                
                            </tr>
                            
                            <%}%>
                            
                        </tbody>
                        
                        
                        
                    </table>
                </div>
            </div>
            
        </div>
        
    </form>

