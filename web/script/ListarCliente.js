$(document).ready(function () {

   
    $('.ver').click(function () {

        var id = $(this).parents("tr").find('.cliente_id').val();
        
        $.ajax({

            url: "ModalCliente",
            type: "POST",
            data: {id: id},
            success: function (data) {

                $("#VerModal").html(data);

            }

        });
    });

    $('.editar').off('click');
    $('.editar').on('click', function () {
        var id = $(this).parents("tr").find('.cliente_id').val();
        

        $("#tablaClientes").load('jsp/tablaEdicionCliente.jsp', {id: id}, function () {

        });




    });

    $('.eliminar').off('click');
    $('.eliminar').on('click', function () {
        var id = $(this).parents("tr").find('.cliente_id').val();
        alertify.confirm("Eliminar Cliente?",function (e) {
            if (e) {
                
               
                $.post({

                    url: "EliminarCliente",
                    type: "POST",
                    data: {id: id},
                    
                    success: function () {

                        $("#tablaClientes").load('jsp/ListarClientesJSP.jsp',  function () {
                            alertify.success("Registro Eliminado");
                        });
                    }

                });


            } else {

                alertify.error("Peticion Cancelada");
            }
        });
    });
});




