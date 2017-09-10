$(document).ready(function () {

    $('.ver').click(function () {

        var id = $(this).parents("tr").find('.empleado_id').text();
      
        $.ajax({

            url: "ModalEmpleados",
            type: "POST",
            data: {id: id},
            success: function (data) {

                $("#VerModal").html(data);

            }

        });
    });

    $('.editarEmpleado').off('click');
    
    
    $('.editarEmpleado').on('click', function () {
        var id = $(this).parents("tr").find('.empleado_id').text();

        alertify.success(id);
        $("#listarEmpleados").load('jsp/tablaEdicionEmpleados.jsp', {id: id}, function () {

        });




    });

    $('.eliminarEmpleado').off('click');
    $('.eliminarEmpleado').on('click', function () {
        var id = $(this).parents("tr").find('.id').text();
        alertify.confirm("Eliminar Empleado?", function (e) {
            if (e) {
                $.post({

                    url: "EliminarEmpleado",
                    type: "POST",
                    data: {id: id},
                    success: function () {

                        $("#listarEmpleados").load('jsp/ListarEmpleadosJSP.jsp',  function () {
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


