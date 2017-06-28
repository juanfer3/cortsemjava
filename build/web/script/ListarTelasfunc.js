$(document).ready(function () {

    $('.eliminar').off("click");
    $('.eliminar').click(function () {
        var id = $(this).parents("tr").find(".hijo").val();

        alertify.confirm("<p>Realmente desea borrar este Registro?</p>", function (e) {
            if (e) {

                $.ajax({

                    url: 'EliminarTelasPorId',
                    type: "POST",
                    data: {id: id},
                    success: function (data) {
                        $('#tablaListarTelas').load('jsp/tablaTelas.jsp', function () {
                            alertify.success("Registro Eliminado ");
                        });
                    }

                });


            } else {


                alertify.error("Peticion Cancelada")

            }


        });



    });

    $('.ver').off('click');
    $('.ver').on('click', function () {

        var id = $(this).parents("tr").find(".id").val();
        $.ajax({

            url: 'ModalTelas',
            type: "POST",
            data: {id: id},
            success: function (data) {

                alertify.confirm(data).show();


            }


        });

    });

    $('.editar').off('click');
    $('.editar').on('click', function () {

        var id = $(this).parents("tr").find(".id").val();

        $.get('jsp/tablaEdicionTelas.jsp', {id: id}, function (tabla) {



            $('#tablaEdicionTelas').html(tabla).show('slow');

            $('#tablaListarTelas').hide('slow');

            $('#tablaEdicionTelas').load('jsp/tablaEdicionTelas.jsp', function () {
//                alertify.alert("div recargado").show();
            });

        });





    });

    $('#aceptarEdicion').off('click');
    $('#aceptarEdicion').on('click', function (e) {

        var ref_tela = $('#ref_tela').val()
        var descripcion = $('#descripcion_tela').val();
        var id = $('#id').val();
        

        var data = {

            ref_tela: ref_tela,
            descripcion: descripcion,
            id: id

        }

        $.ajax({
            url: 'EditarTela',
            type: "POST",
            data: data,
            success: function (data) {
                if (data != 0) {

                    $.get('jsp/tablaTelas.jsp',function (tabla){
                        
                       $('#tablaListarTelas').html(tabla).show('slow');

                       $('#tablaEdicionTelas').hide('slow');
                       
                       
                        
                    });


                    alertify.success("Cambios Guardados");

                } else {

                    alertify.alert("NO se pudo Editar");

                }
            }
        });




    });


    $('#cancelarEdicion').click(function(){
        
       $.get('jsp/tablaTelas.jsp',function (tabla){
                        
                       $('#tablaListarTelas').html(tabla).show('slow');

                       $('#tablaEdicionTelas').hide('slow');
                       
                       alertify.error("Edicion Cancelada"); 
                        
                    });
                   
        
    });


});

