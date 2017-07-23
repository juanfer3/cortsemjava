$(document).ready(function () {

    $('#valor_unitario').focusout(function () {



        var x = $('#cantidad').val();
        var y = $('#valor_unitario').val();
        if (x == "" || y == "") {



        } else {


            x = parseInt(x);
            y = parseInt(y);

            var resultado = x * y;

            $('#valor_total').text(resultado);

            var a = $('#valor_total').text();
//        alertify.success(x);
//        alertify.success(y);
//        alertify.success(a);

        }
    });

    $('#cantidad').focusout(function () {
        var x = $('#cantidad').val();
        var y = $('#valor_unitario').val();
        if (x == "" || y == "") {



        } else {


            x = parseInt(x);
            y = parseInt(y);

            var resultado = x * y;

            $('#valor_total').text(resultado);

            var a = $('#valor_total').text();
//        alertify.success(x);
//        alertify.success(y);
//        alertify.success(a);

        }


    });



    $('#RegistroDetallado').click(function () {
        var pedido_id = $("#pedido_id").text();
        var prenda = $(this).parents("tr").find(".prenda").val();
        var tela = $(this).parents("tr").find("#tela").val();
        var nombreTela = $(this).parents("tr").find("#nombretela").text();
        var talla = $(this).parents("tr").find("#talla").val();
        var cantidad = $(this).parents("tr").find("#cantidad").val();
        var valor_unitario = $(this).parents("tr").find("#valor_unitario").val();
        var valor_total = $(this).parents("tr").find("#valor_total").text();

//        alertify.success(valor_total);
        var validarPedido = true;

        if (prenda == "") {

            alertify.error("El campo Prenda no puede esta vacio");
            validarPedido = false;


        } else {

            validarPedido = true;

        }

        if (talla == "") {

            alertify.error("El campo talla no puede esta vacio");
            validarPedido = false;

        } else {

            validarPedido = true;

        }


        if (cantidad == "") {

            alertify.error("El campo Cantidad no puede esta vacio");
            validarPedido = false;


        } else {

            validarPedido = true;

        }


        if (valor_unitario == "") {


            alertify.error("El Valor unitario no puede estar vacio");
            validarPedido = false;
        } else {

            validarPedido = true;

        }

        if (valor_total == "0") {


            validarPedido = false;
        } else {

            validarPedido = true;

        }

        if (validarPedido == true) {


            var eliminar = "<a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a>";

            var fila = "<tr><td><p class='prenda' id='prenda_pe'>" + prenda + "</p></td> <td><p class='tela_pe' id='tela_pe'>" + nombreTela + "</p> </td><td><p class='talla_pe' id='talla_pe'>talla</p> </td><td><p class='cantidad_ped' id='cantidad_pe'>" + cantidad + "</p> </td> <td><p class='v_total_pe' id='v_total_pedido'>" + valor_total + "</p></td><td><p style='visibility=hidden;' class='tela_id'>" + tela + "</p></td><td>" + eliminar + "</td></tr>";
//        var texto=$('#textoa').text();



            var data = {

                pedido_id: pedido_id,
                prenda: prenda,
                tela_id: tela,
                talla: talla,
                cantidad: cantidad,
                valor_unitario: valor_unitario,
                valor_total: valor_total



            }
            $(this).parents("tr").find(".prenda").val("");

            $(this).parents("tr").find("#talla").val("");
            $(this).parents("tr").find("#cantidad").val("");
            $(this).parents("tr").find("#valor_unitario").val("");
            $("#valor_total").text("0");





            $.ajax({

                url: 'InsertarPedidoDatallado',
                type: "POST",
                data: data,
                success: function (data) {

                    if (data != 0) {
                        var id=$('#pedido_id').text();
                        alertify.success(id);
                        alertify.success("Insercion Correcta");
                        $.get('jsp/tablaPedidosDetalladosPorID.jsp',{id:id},function (tabla) {
//                             $("#tablaPedidosDetallados").load('jsp/tablaPedidosDetalladosPorID.jsp',{id:id},function (){
//                               alert("refresco"); 
//                            });
//                            $("#tablaPedidosDetallados").html(tabla).show('slow');
                           
                                    
                        });
//                       $('.ListedePedidos').append(fila);
//                       $('.eliminar').off('click');
//                       $('.eliminar').on('click',function(){
//                           
////                          var fila=$(this).parents("tr"); 
////                           
////                           fila.remove();
//
//                            var prenda=$(this).parents("tr").find(".prenda").text();
//                            var talla=$(this).parents("tr").find(".talla_pe").text();
//                            var tela=$(this).parents("tr").find(".tela")
//                            var cantidad=$(this).parents("tr").find(".cantidad_pe").text();
//                            var valor_total=$(this).parents("tr").find("v_total_pe").text();
//                            
//                            $.ajax({
//                               
//                               url:'EliminarPedidoDetallado',
//                               type:"POST",
//                               data:data,
//                               success: function (data) {
//                                    
//                                    alertify.success("Coneccion Corecta");
//                                    
//                                }
//                                
//                            });
//
//
//                       });




                    }




//                   
                }

            });


//            alertify.success(nombreTela);
//            alertify.success(cantidad);
//            alertify.success(valor_unitario);
//            alertify.success(valor_total);
        }


    });


});

