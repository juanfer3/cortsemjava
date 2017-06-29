<%-- 
    Document   : tablaPedidosDetalladosPorID
    Created on : 26/06/2017, 08:52:26 PM
    Author     : Juan
--%>

<%@page import="Modelo.Pedidos"%>
<%@page import="Modelo.DBPedidos"%>

<%@page import="Modelo.PedidosDetallados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.DBPedidoDetallado"%>
<!--script src="script/PedidosDetalladosFunc.js"></script-->
<%
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    DBPedidos ped=new DBPedidos();
    ArrayList<Pedidos>Listar=new ArrayList();
    Listar.clear();
    
    
    
    Listar=ped.ListarPedidosConClientes();

%>
<script src="script/tablaDetallesTabla.js"></script>
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
                                
                                <th>Nombre</th>
                                <th>Documento</th>
                                <th>N� pedido</th>
                                <th>Fecha del pedido</th>
                                
                                <th>Fecha de entrega</th>
                                
                                <th></th>
                                <th>Detalles</th>
                            </tr>
                        </thead>
      
                        <tbody class="ListedePedidos">
                            
                            <%for(Pedidos mypedido:Listar){%>
                            <tr>
                                <td><%=mypedido.getClienteId().getNombre() %></td>
                                <td><%=mypedido.getClienteId().getDocumento()%></td>
                                <td><%=mypedido.getId() %></td>
                                <td><%=mypedido.getFPedido()%></td>
                                <td><%=mypedido.getFEntrega()  %></td>
                                <td><p class="id" style="visibility: hidden;"><%=mypedido.getId()%></p></td>
                                <td><a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a></td>
                            </tr>
                            
                            <%}%>
                            
                        </tbody>
                        
                        
                        
                    </table>
                </div>
            </div>
            
        </div>
        <div class="row ">

            <div class="col-xs-12 col-md-12"><a href="#" class="btn btn-success btn-block btn-lg">Terminar Operacion</a></div>
        </div>
    </form>
