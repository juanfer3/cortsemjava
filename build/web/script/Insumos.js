$(document).ready(function () {

    var nombre = $('#nombre').val();
    var t_unidad = $('#t_unidad').val();
    var cantidad = $('#cantidad').val();
    var valor_unitario = $('#valor_unitario').val();



    $('#nombre').focusout(function () {
        var nombre = $('#nombre').val();
        if(nombre==""){
        $('#nombre').css("border", "1px solid #a94442");
        alertify.error("El campo nombre no puede estar vacio");
        }else{
            
           $('#nombre').css("border", "1px solid #3c763d");
        }
    });
    
    $('#t_unidad').focusout(function () {
        var t_unidad = $('#nombre').val();
        if(t_unidad==""){
        $('#t_unidad').css("border", "1px solid #a94442");
        alertify.error("El campo tipo de unidad no puede estar vacio");
        }else{
            
           $('#t_unidad').css("border", "1px solid #3c763d");
        }
    });
    
    $('#cantidad').focusout(function () {
        var cantidad = $('#nombre').val();
        if(cantidad==""){
        $('#cantidad').css("border", "1px solid #a94442");
        alertify.error("El campo cantidad no puede estar vacio");
        }else{
            
           $('#cantidad').css("border", "1px solid #3c763d");
        }
    });
    
    $('#valor_unitario').focusout(function () {
        var valor_unitario = $('#nombre').val();
        if(valor_unitario==""){
        $('#valor_unitario').css("border", "1px solid #a94442");
        alertify.error("El campo valor unitario no puede estar vacio");
        }else{
            
           $('#valor_unitario').css("border", "1px solid #3c763d");
        }
    });

    $('#aceptar').off('click');
    $('#aceptar').on('click', function () {

        var nombre = $('#nombre').val();
        var t_unidad = $('#t_unidad').val();
        var cantidad = $('#cantidad').val();
        var valor_unitario = $('#valor_unitario').val();
        var valor_total = $('#valor_totla').text();
        
        if (nombre == "") {

            $('#nombre').focusout(function () {

                $('#nombre').css("border", "1px solid #a94442");
                alertify.error("El campo nombre no puede estar vacio");
            });

        }else{
            $('#nombre').css("border", "1px solid #3c763d");
            if (t_unidad==""){
                
                

                $('#t_unidad').css("border", "1px solid #a94442");
                alertify.error("El campo tipo de unidad no puede estar vacio");
            
            }else{
                
                $('#t_unidad').css("border", "1px solid #3c763d");
                if(cantidad==""){
                    
                    
                    $('#cantidad').css("border", "1px solid #a94442");
                    alertify.error("El campo cantidad no puede estar vacio");
                }else{
                    
                    $('#cantidad').css("border", "1px solid #3c763d");
                    
                    if(valor_unitario==""){
                        
                        
                        $('#valor_unitario').css("border", "1px solid #a94442");
                        alertify.error("El campo valor unitario no puede estar vacio");
                    }else{
                        valor_unitario=parseFloat(valor_unitario);
                        cantidad=parseFloat(cantidad);
                        var valor_total=valor_unitario*cantidad;
                        $('#valor_total').text(valor_total);
                        $('#valor_unitario').css("border", "1px solid #3c763d");
                        
                        var data={
                            
                            nombre:nombre,
                            t_unidad:t_unidad,
                            cantidad: cantidad,
                            valor_unitario: valor_unitario,
                            valor_total: valor_total
                        }
                        var eliminar = "<a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a>";
                        var fila = '<tr class="fila"><td>'+nombre+'</td><td>'+t_unidad+'</td><td>'+cantidad+'</td><td>'+valor_unitario+'</td><td>'+valor_total+'</td><td>'+eliminar+'</td></tr>';
                        $('.lista').append(fila);
                        $.ajax({
                                
                                url:'InsercionInsumos',
                                type: 'POST',
                                data:data,
                                success:function(data){
                                    $('#nombre').css("border", "1px solid #ccc").val("");
                                    $('#t_unidad').css("border", "1px solid #ccc").val("");
                                    $('#cantidad').css("border", "1px solid #ccc").val("");
                                    $('#valor_unitario').css("border", "1px solid #ccc").val("");
                                    $('#valor_total').css("border", "1px solid #ccc").text("");
                                    alertify.success(data);
                                    $('.eliminar').off('click');
                                    $('.eliminar').on('click',function(){
                                        
                                       alertify.success("elimino"); 
                                        
                                    });
                                }
                                
                        });
                        
                        
                    }
                }
                
            }
            
            
        }
     
    });
});

