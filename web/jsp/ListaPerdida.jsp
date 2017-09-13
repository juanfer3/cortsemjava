<%-- 
    Document   : ListaPerdida
    Created on : 12/09/2017, 08:39:21 PM
    Author     : Juan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


        
        
        
        
  



    <div class="row">
        <div class="col-md-12">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <h3 class="panel-title">Perdidas</h3>
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
                            
                            <th>#</th>
                            <th></th>
                            <th>Nombre</th>
                            <th>Tipo de unidad</th>
                            <th>Cantidad</th>
                            <th>Valor unitario</th>
                            <th>Valor total</th>

                            <th>Ver</th>
                            <th>Editar</th>
                            <th>Eliminar</th>
                            
                        </tr>
                    </thead>
                   

                    <tbody>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td></td>
                            
                            <td><a id="" href="#" class="ver" id="ver" data-toggle="modal" data-target="#myModal"><span><img src="imagenes/ojo.png"></span></a></td>
                            <td align="center"><a href="#!EditarPerdida" class="editar" id="editarEmpleado"><span><img src="imagenes/editar.png"></span></a></td>
                            <td align="center"><a href="#!" class="eliminar" id="eliminarEmpleado"><span><img src="imagenes/borrar.png"></span></a></td>
                            
                        </tr>

                    </tbody>






                    
                </table>
            </div>
        </div>

    </div>
    <div class="row ">
        
        <div class="col-xs-12 col-md-12"><a href="#!RegistarPerdida" class="btn btn-success btn-block btn-lg">Ingresar Insumos</a></div>
        
    </div>
    
           
            

  
