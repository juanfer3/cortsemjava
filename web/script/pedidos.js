$(document).ready(function () {

    $('.ver').off('click');
    $('.ver').on('click', function () {

        var id = $(this).parents("tr").find('.id').text();



        $('#listarPedidos').load('jsp/pedidosPorClientedetalle.jsp', {id: id}, function () {


            
        });



    });

    $('.volverPedidos').off('click');
    $('.volverPedidos').on('click', function () {



        

        $('#pedidoDetalleCliente').load('jsp/tablaPedidosDetallados.jsp', function () {


            
        });



    });


});

