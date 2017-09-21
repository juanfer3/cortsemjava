<%-- 
    Document   : PedidosEnProduccion
    Created on : 20/09/2017, 12:28:26 AM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h1>Pedidos en proceso</h1>
                <div ng-controller="CrearProgramacion" class="" ng-repeat="proceso in Produccion track by $id" ng-if="Produccion">
                    {{Produccion.length }}
                <table id="keywords" cellspacing="0" cellpadding="0" class=" " >
                    <thead>
                        <tr>
                            <th><span>{{proceso.clienteId.nombre}}</span></th>
                            <th><span>Impressions</span></th>
                            <th><span>Clicks</span></th>

                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td class="lalign">silly tshirts</td>
                            <td>6,000</td>
                            <td>110</td>

                        </tr>

                    </tbody>
                </table>
            </div>
