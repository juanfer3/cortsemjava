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
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    ArrayList<PedidosDetallados>Listar=new ArrayList();
    Listar.clear();
    
   
    Listar=detalle.BuscarDetallesDePedidosPorIdPedido(32);

%>
<form method="POST">
        <div class="row">
            <div class="col-md-12">
                <div class="panel panel-primary">
                    <div class="panel-heading">
                        <h3 class="panel-title">Clientes</h3>
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
                                <th>Valor Total</th>
                                <th>Eliminar</th>
                            </tr>
                        </thead>
      
                        <tbody class="ListedePedidos">
                            
                            <%for(PedidosDetallados mypedido:Listar){%>
                            <tr>
                                <td><%=mypedido.getPrenda()%></td>
                                <td><%=mypedido.getTalla()%></td>
                                <td><%=mypedido.getCantidad()%></td>
                                <td><%=mypedido.getValorUnitario()%></td>
                                <td><%=mypedido.getValorTotal()%></td>
                                
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
