
$(document).ready(function () {

    $("#login").click(function () {

    

        $.get('login.jsp', function (tabla) {

            $("#tabla").html(tabla).show('slow');

            $('#contenido').hide('slow');

        });

    });


    $('#cortsemindex').click(function () {

        $.post('ContenidoIndex.jsp', function (tablas) {
            $("#contenido").html(tablas).show('slow');
            $("#tabla").hide('slow');
        });
    });


//    $('#llamartablaeditarclientes').click(function () {
//        var id = $('.id').val();
//        
//        id = parseInt(id);
//        
//        console.log(id);
//        $.post('jsp/tablaEdicionCliente.jsp', {'id': id}, function (cambio) {
//
//            $('#EditarCliente').html(cambio).show('slow');
//            $('#ocultarlistarclientes').hide('slow');
//
//        });
//    });


//    $('#llamartablaeditarEmpleados').click(function () {
//        
//        
//        var id = $('.id').val();
//        id = parseInt(id);
//        alert(id);
//        $.post('jsp/tablaEdicionEmpleados.jsp', {'id': id}, function (tabla) {
//            $('#EditarCliente').html(tabla).show('slow');
//            $('#ocultarlistarEmpleados').hide('slow');
//        });
//    });

//    $('#verEmpleados').click(function(){
//       $( function() {
//    $( "#dialog" ).dialog();
//  } ); 
//    });



});
//


