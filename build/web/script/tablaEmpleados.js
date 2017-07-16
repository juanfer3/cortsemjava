$(document).ready(function () {

    $('.verEmpleado').off('click');
    $('.verEmpleado').on('click', function () {

        var id = $(this).parents("tr").find('.id').text();
        $.ajax({

            url: "Empleadomodal",
            type: "POST",
            data: {id: id},
            success: function (data) {

                alert(data);

            }

        });
    });

    $('.editarEmpleado').off('click');
    $('.editarEmpleado').on('click', function () {
        var id = $(this).parents("tr").find('.id').text();


        $("#listarEmpleados").load('jsp/ListarEmpleadosJSP.jsp', {id: id}, function () {

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
                            alertify.success("Registro Eliminado Correctamente");
                        });
                    }

                });


            } else {

                alertify.error("Peticion Cancelada");
            }
        });
    });
});


