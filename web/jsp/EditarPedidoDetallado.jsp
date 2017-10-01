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
    DBPedidos pedidos = new DBPedidos();
    DBPedidoDetallado detalle = new DBPedidoDetallado();
    DBTelas tela = new DBTelas();

    ArrayList<Pedidos> ListarPedidos = new ArrayList();
    ArrayList<PedidosDetallados> ListarDetalle = new ArrayList();
    ArrayList<Telas> ListarTelas = new ArrayList();

    ListarDetalle.clear();
    ListarPedidos.clear();
    ListarTelas.clear();

    String id1;
    int pedido_id = 0;
    float total = 0;

    id1 = (String) request.getParameter("id");

    pedido_id = Integer.parseInt(id1);

    ListarPedidos = pedidos.BuscarUltimoPedido(pedido_id);
    ListarDetalle = detalle.BuscarDetallesDePedidosPorIdPedido(pedido_id);
    ListarTelas = tela.ListarTelas();
%>

<script src="script/myFacturas.js"></script>
<script src="script/Pedido.js"></script>

<div class="container" id="pedidoDetalleCliente">
    <div class="row">
        <%for (Pedidos mispedidos : ListarPedidos) {%>
        <div class="col-md-3 ">
            <h5>Nombre: <%=mispedidos.getClienteId().getNombre()%> </h5>
            <h5>documento:<%=mispedidos.getClienteId().getDocumento()%></h5>
            <h5>Fecha de Pedido:<%=mispedidos.getFPedido()%></h5>
            <h5>Fecha de Entrega:<%=mispedidos.getFEntrega()%></h5>
            <input style="visibility: hidden" value="<%=mispedidos.getId()%>">
        </div>

        <div class="col-md- col-md-offset-9">
            <h6>Factura N:<p id="pedido_id"><%=mispedidos.getId()%></p></h6>
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
                        <th></th>
                        <th>Valor Total</th>
                        <th>Eliminar</th>


                    </tr>
                </thead>
                <tbody id="lista" class="lista">
                    <%

                        for (PedidosDetallados misdetalle : ListarDetalle) {

                            total = total + misdetalle.getValorTotal();

                    %>
                    <tr class="contenido">
                        <td>
                            <input value="<%=misdetalle.getPrenda()%>"
                                   type="text"
                                   class="form-control prenda"
                                   size="5px"
                                   >
                        </td>
                        <td>
                            <select class="form-control telas mytela" id="tela">
                                <%for (Telas mytelas : ListarTelas) {%>
                                <%if (mytelas.getRefTela() == misdetalle.getTelasId().getRefTela() || mytelas.getRefTela().equals(misdetalle.getTelasId().getRefTela())) {%>
                                <option value="<%=mytelas.getId()%>" selected><%=mytelas.getRefTela()%></option>
                                <%} else {%>
                                <option value="<%=mytelas.getId()%>"><%=mytelas.getRefTela()%></option>
                                <%}%>
                                <%}%>
                            </select>
                        </td>
                        <td>
                            <input value="<%=misdetalle.getTalla()%>"
                                   type="text"
                                   class="form-control talla"
                                   size="5px;"
                                   >
                        </td>
                        <td><input value="<%=misdetalle.getCantidad()%>"
                                   type="text"
                                   class="form-control cantidad"
                                   >
                        </td>
                        <td>
                            <input value="<%=misdetalle.getValorUnitario()%>"
                                   type="text"
                                   class="form-control valor_unitario"
                                   >
                        </td>
                        <td>
                            <input value="<%=misdetalle.getId()%>"
                                   type="hidden"
                                   class="form-control id"
                                   >
                        </td>
                        <td>
                            <input value="<%=misdetalle.getValorTotal()%>"
                                   type="text"
                                   class="form-control mytotal"
                                   disabled
                                   >
                        </td>
                          <td>
                            <a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a>

                          </td>
                    </tr>
                    <%}%>
                </tbody>
                <tfoot>
                    <tr>
                        <td colspan="7" align="right" style=""><p>Total</p></td>
                        <td colspan="1" align="right" style=""><p id="total"><%=total%> </p></td>
                    </tr>
                    <tr>
                        <%for (Pedidos mispedidos : ListarPedidos) {%>
                        <td colspan="7" align="right"><p >Iva%</p></td>
                        <td colspan="1" align="right"><input name="iva" id="iva" class="form" value="<%=mispedidos.getIva()%>" style="text-align:right" disabled></td>
                            <%}%>
                    </tr>

                    <tr>
                        <%for (Pedidos mispedidos : ListarPedidos) {%>
                        <td colspan="7" align="right"><p >Descuento%</p></td>
                        <td colspan="1" align="right"><input name="descuento" id="descuento" class="form" value="<%=mispedidos.getDescuento()%>" style="text-align:right" disabled></td>
                            <%}%>
                    </tr>
                    <tr>
                        <td colspan="8" align="right"><p id="total_final"></p></td>
                    </tr>
                </tfoot>

            </table>
        </div>
    </div>

    <div class="col-xs-12 col-md-12">
        <button type="button" class="btn btn-danger volverPedidos col-xs-3 col-md-3" id="volverPedidos">Cancelar</button>
        <a href="#" class="btn btn-success col-xs-3 col-md-3 col-md-offset-1"  id="guardarCambios">Guardar Cambios</a>
        <button type="button" class="btn btn-warning col-xs-3 col-md-3 col-md-offset-1 plus" id="plus">Warning</button>
    </div>

</div>
