<%--
    Document   : facturaPedidosDetalladoPorID
    Created on : 15/07/2017, 10:46:55 PM
    Author     : Juan
--%>
<%@page import="Modelo.Telas"%>
<%@page import="Modelo.DBTelas"%>
<%@page import="Modelo.Pedidos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="Modelo.PedidosDetallados"%>
<%@page import="Modelo.DBPedidos"%>
<%@page import="Modelo.DBPedidoDetallado"%>
<%
    DBPedidos pedidos=new DBPedidos();
    DBPedidoDetallado detalle=new DBPedidoDetallado();
    DBTelas telas=new DBTelas();

    ArrayList<Pedidos> ListarPedidos=new ArrayList();
    ArrayList<PedidosDetallados> ListarDetalle=new ArrayList();
    ArrayList<Telas> ListarTelas=new ArrayList();

    ListarDetalle.clear();
    ListarPedidos.clear();

    String id1;
    int pedido_id=0;
    float total=0;

    id1=(String) request.getParameter("id");


    pedido_id=Integer.parseInt(id1);

    ListarPedidos=pedidos.BuscarUltimoPedido(pedido_id);
    ListarDetalle=detalle.BuscarDetallesDePedidosPorIdPedido(pedido_id);
    ListarTelas=telas.ListarTelas();
%>
<script src="script/myFacturas.js"></script>
<script src="script/Pedidos.js"></script>

<div class="container" id="pedidoDetalleCliente">
    <div class="row">
        <%for(Pedidos mispedidos:ListarPedidos){%>
            <div class="col-md-3 ">
            <h5>Nombre: <%=mispedidos.getClienteId().getNombre()%> </h5>
            <h5>documento:<%=mispedidos.getClienteId().getDocumento() %></h5>
            <h5>Fecha de Pedido:<%=mispedidos.getFPedido() %></h5>
            <h5>Fecha de Entrega:<%=mispedidos.getFEntrega()%></h5>
            <input style="visibility: hidden" value="<%=mispedidos.getId() %>">
            </div>

            <div class="col-md- col-md-offset-9">
                <h6>Factura N:<p id="pedido_id"><%=mispedidos.getId() %></p></h6>
            <h6>Cortsem </h6>
            <h6>Nit: 2345776-5</h6>
            <h6>Telefono: 3732682</h6>
            <h6>Dir: Cra 56 # 56 a 13</h6>
            </div>
            <%}%>
        <div class="span5">

            <table class="table table-striped table-condensed">
                <thead>
                    <tr>
                        <th>Prenda</th>
                        <th>Tela</th>
                        <th>Talla</th>
                        <th>Cantidad</th>
                        <th>Valor Unitario</th>
                        <th>Valor Total</th>


                    </tr>
                </thead>
                <tbody id="fila">
                    <%

                        for(PedidosDetallados misdetalle:ListarDetalle){
                        String tel=misdetalle.getTelasId().getRefTela();
                        total=total+misdetalle.getValorTotal();

                    %>
                    <tr>
                        <td>
                          <input value="<%=misdetalle.getPrenda()%>"
                          class="form-control prenda"  id="prenda" name="prenda"
                           type="text">
                        </td>
                        <td>
                          <select class="form-control telas listaTelas" name="" id="listaTelas">
                            <%for(Telas mytelas: ListarTelas){%>
                            <%if(mytelas.getRefTela()==misdetalle.getTelasId().getRefTela()||mytelas.getRefTela().equals(misdetalle.getTelasId().getRefTela())){%>
                            <option value="<%=mytelas.getId()%>" selected><%=mytelas.getRefTela()%></option>
                            <%}else{%>
                            <option value="<%=mytelas.getId()%>"><%=mytelas.getRefTela()%></option>
                            <%}%>
                            <%}%>
                          </select>


                        </td>
                        <td>
                          <input value="<%=misdetalle.getTalla()%>"
                          type="text" class="form-control prenda" >
                        </td>
                        <td>
                          <input value="<%=misdetalle.getCantidad() %>"
                          type="text" class="form-control prenda" >
                        </td>
                        <td>
                          <input value="<%=misdetalle.getValorUnitario() %>"
                          type="text" class="form-control prenda" >
                        </td>
                        <td>
                          <input value="<%=misdetalle.getValorTotal() %>"
                          type="text" class="form-control prenda" >
                        </td>

                    </tr>
                    <%}%>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="5" align="right" style=""><p>Total</p></td>
                        <td colspan="1" align="right" style=""><p id="total"><%=total%> </p></td>
                    </tr>
                    <tr>
                        <%for(Pedidos mispedidos:ListarPedidos){%>
                        <td colspan="5" align="right"><p >Iva%</p></td>
                        <td colspan="1" align="right"><input name="iva" id="iva" class="form" value="<%=mispedidos.getIva() %>" style="text-align:right"></td>
                        <%}%>
                    </tr>

                    <tr>
                        <%for(Pedidos mispedidos:ListarPedidos){%>
                        <td colspan="5" align="right"><p >Descuento%</p></td>
                        <td colspan="1" align="right"><input name="descuento" id="descuento" class="form" value="<%=mispedidos.getDescuento() %>" style="text-align:right"></td>
                        <%}%>
                    </tr>
                    <tr>
                        <td colspan="6" align="right"><p id="total_final"></p></td>
                    </tr>
                </tfoot>

            </table>
        </div>
    </div>
                    <div>
                    <div class="col-xs-12 col-md-12 ">
                        <a href="#" class="btn btn-danger volverPedidos col-xs-3 col-md-3 "
                      id="volverPedidos">Ver otros pedidos
                     </a>


                      <a href="#" class="btn btn-success guardar col-xs-3 col-md-3 col-md-offset-1 "
                      id="guardar">Salvar Cambios
                     </a>
                        <button type="button" class="btn btn-warning col-xs-3 col-md-3 col-md-offset-1 plus"><span class="glyphicon glyphicon-plus"></span></button>

                  </div>
                  </div>
</div>
