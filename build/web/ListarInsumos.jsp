<%-- 
    Document   : RegistroEmpleado
    Created on : 1/03/2017, 08:39:45 PM
    Author     : Juanfernado
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="java/alertify.min.js"></script>
        <!-- include alertify.css -->
        <link rel="stylesheet" href="estilos/alertify.core.css">
        <link rel="stylesheet" href="estilos/alertify.default.css">

        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">     

        <link rel="stylesheet" href="bootstrap/css/estilos.css">


        <script ></script>
        <title>JSP Listar Empleados</title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>


        <%--<h1>Click the filter icon <small>(<i class="glyphicon glyphicon-filter"></i>)</small></h1>--%>

        <div class="container">

            <!-- Modal -->
            <div class="modal fade in" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title" id="tituloModal">Insumos</h4>
                        </div>
                        <div class="modal-body" id="VerModal">

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-primary" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

        </div>
        <div id="tablaInsumos">

            <%@include file="jsp/tablaInsumos.jsp" %>

        </div>

        <%@include file="jsp/footer.jsp" %>

    </body>
</html>
