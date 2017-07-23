<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <link rel="stylesheet" href="imagenes">
        <link href="https://file.myfontastic.com/wBMVThpWoWLWzeaWjCkHtV/icons.css" rel="stylesheet">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href="bootstrap/css/estilos.css">
        <title></title>
    </head>
    <body>
        <%@include file="jsp/header.jsp" %>
        
       

           <div class="container" id="contenido">

    <div class="row">
        <div class="col-md-12">
            <form action="RegistroEmpleados">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Registrar Empleado</h3>
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
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="nombre"> </td>
                        </tr>
                        
                        <tr>
                            <th>Documento</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="documento"> </td>
                        </tr>
                        <tr>
                            <th>Cargo</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="cargo"></td>
                        </tr>
                        <tr>
                            <th>Telefono</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="telefono"></td>
                        </tr>
                        <tr>
                            <th>Celular</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="celular"></td>
                        </tr>
                        <tr>
                            <th>Direccion</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="direccion"></td>
                        </tr>
                        <tr>
                            <th>Rh</th>
                            <td><select class="form-control seleccion" id="sel1" style="height:45px;" name="rh">
                                        <option value="O-">O-</option>
                                        <option value="O+">O+</option>
                                        <option value="A-">A-</option>
                                        <option value="A+">A+</option>
                                        <option value="B-">B-</option>
                                        <option value="B+">B+</option>
                                        <option value="AB-">AB-</option>
                                        <option value="AB+">AB+</option>
                                    </select></td>
                        </tr>
                        <tr>
                            <th>Fecha de nacimiento</th>
                            <td><input type="date" style="border:none" value="" class="entradasdeedicion form-control input-lg" name="fecha_nacimiento" tabindex="5"></td>
                        </tr>
                        <tr>
                            <th>Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="contacto_familiar"></td>
                        </tr>
                        <tr>
                            <th> Telefono Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="telefono_contacto"></td>
                        </tr>
                        <tr>
                            <th>Celular Contacto Familiar</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="celular_contacto"></td>
                        </tr>
                        <tr>
                            <th>Usuario</th>
                            <td><input type="text" style="border:none" value="" class="entradasdeedicion" name="usuario"></td>
                        </tr>
                        <tr>
                            <th>Contraseña</th>
                            <td><input type="password" style="border:none" value="" class="entradasdeedicion" name="contrasena"></td>
                        </tr>
                       
                                
                    <input value="" style="visibility:hidden" name="id">
                        
                    </tbody>


                </table>
                       
                    
            </div>
                    <div class="row">
                                    <div class="col-xs-6 col-md-6"><input type="submit" value="aceptar" class="btn btn-primary btn-block btn-lg" tabindex="7"></div>
                                    <div class="col-xs-6 col-md-6"><a href="ListarEmpleados" class="btn btn-danger btn-block btn-lg">cancelar</a></div>
                                </div>
                    </form>
        </div>

    </div>
                      
</div>
      
                
                <%@include file="jsp/footer.jsp" %>
                </body>
                </html>