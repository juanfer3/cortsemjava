$(document).ready(function () {

//    $(".ver").off("click"); causa error al cargar con load de jquery 
    $(".ver").click( function () {

        var id = $(this).parents("tr").find(".id").text();
        $.ajax({
            url: 'ModalInsumos',
            type: "POST",
            data: {id: id},
            success: function (data) {

                $("#VerModal").html(data);

            }

        });

    });

    $(".editar").off("click");
    $(".editar").on('click', function () {

        var id = $(this).parents("tr").find(".id").text();
        $.get('jsp/tablaEdicionInsumos.jsp', {id: id}, function (data) {

        
            $('#tablaInsumos').hide('slow');

            $("#EditarPedido").html(data).show('slow');





        });

    });

    
    $(".eliminar").click(function () {

        alertify.success("eliminar");

    });


    







});