$(document).ready(function () {



    var contador = $('.lista').length;
    contador = contador + 1;

    $('.cantidad').focusout(function(){
      var x=$(this).parents("tr").find(".cantidad").val();
      var y=$(this).parents("tr").find(".valor_unitario").val();
      x=parseInt(x);
      valor_unitario=parseInt(y);
      var r=x * y;
      $(this).parents("tr").find(".mytotal").val(r);
      alertify.success(r);
      console.log(r);
    });

    $('.valor_unitario').focusout(function(){
      var x=$(this).parents("tr").find(".cantidad").val();
      var y=$(this).parents("tr").find(".valor_unitario").val();
      x=parseInt(x);
      valor_unitario=parseInt(y);
      var r=x * y;
      $(this).parents("tr").find(".mytotal").val(r);
      alertify.success(r);
      console.log(r);
    });

    $.ajax({
        url: 'ListarTelas',
        type: 'POST',

        success: function (data, textStatus, jqXHR) {
            var json = JSON.parse(data);

            for (var i in json) {
                var opt = '<option value="' + json[i].id + '" id="nombretela" class="nombretela">' + json[i].refTela + '</option>';
                $('#mytela').append(opt);

            }

        }
    });


    $('.ver').off('click');
    $('.ver').on('click', function () {

        var id = $(this).parents("tr").find('.id').text();



        $('#listarPedidos').load('jsp/pedidosPorClientedetalle.jsp', {id: id}, function () {



        });



    });

    $('.editar').click(function () {
        var id = $(this).parents("tr").find('.id').text();



        $('#listarPedidos').load('jsp/EditarPedidoDetallado.jsp', {id: id}, function () {



        });
    });

    $('#plus').click(function () {

        var mydata=[];
        contador = contador + 1;


        $.ajax({
            url: 'ListarTelas',
            type: 'POST',
            success: function (data, textStatus, jqXHR) {
                var json = JSON.parse(data);

                for (var i in json) {
                    var opt = '<option value="' + json[i].id + '" id="nombretela" class="nombretela">' + json[i].refTela + '</option>';
                    var cont = $(".mytela" + contador).append(opt);

                }

            }
        });
        var eliminar = "<a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a>";

        var fila = '<tr class="contenido"><td><input value=""type="text"class="form-control prenda"></td><td><select class="form-control telas mytela' + contador + '" id="mytela"></select></td> <td><input value=""type="text"class="form-control talla"></td><td><input value="0"type="text"class="form-control cantidad"></td><td><input value="0"type="text"class="form-control valor_unitario"></td><td><input value="0"type="hidden"class="form-control id" ></td><td><input value="0"type="text"class="form-control mytotal" disabled></td><td>'+eliminar+'</td></tr>';

        $('.lista').append(fila);

        $('.cantidad').focusout(function(){
          var x=$(this).parents("tr").find(".cantidad").val();
          var y=$(this).parents("tr").find(".valor_unitario").val();
          x=parseInt(x);
          valor_unitario=parseInt(y);
          var r=x * y;
          $(this).parents("tr").find(".mytotal").val(r);
          alertify.success(r);
          console.log(r);
        });

        $('.valor_unitario').focusout(function(){
          var x=$(this).parents("tr").find(".cantidad").val();
          var y=$(this).parents("tr").find(".valor_unitario").val();
          x=parseInt(x);
          valor_unitario=parseInt(y);
          var r=x * y;
          $(this).parents("tr").find(".mytotal").val(r);
          alertify.success(r);
          console.log(r);
        });

    });






    $('#guardarCambios').click(function (){
       var contar=$('.contenido').length;

       $('.contenido').each(function(){
          var prenda=$(this).find('.prenda').val();
          var tela=$(this).find('.telas').val();
          var talla=$(this).find('.talla').val();
          var cantidad=$(this).find('.cantidad').val();
          var valor_unitario=$(this).find('.valor_unitario').val();
          var total=$(this).find('.total').val();
          var id=$(this).find('.id').val();
          var pedido_id=$('#pedido_id').text();

//          $.ajax({
//            url:'',
//            type:'POST',
//            data:data,
//            success: function(data){
//              alertify.success();
//            }
//          });
          alertify.success(pedido_id);

       });
    });


    $('.volverPedidos').off('click');
    $('.volverPedidos').on('click', function () {





        $('#pedidoDetalleCliente').load('jsp/tablaPedidosDetallados.jsp', function () {



        });



    });


});
