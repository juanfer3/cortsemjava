$(document).ready(function () {
    var total = $("#total").text();
    var iva = $('#iva').val();
    $("#total_final").text();

    total = parseFloat(total);
    iva = parseFloat(iva);


    var total_final = total + iva
    total_final = parseFloat(total_final);
    $("#total_final").text(total_final);

    $('#iva').focusout(function () {


        var total = $("#total").text();
        var iva = $('#iva').val();
        var descuento = $('#descuento').val();
        $("#total_final").text();


        total = parseFloat(total);
        iva = parseFloat(iva);

        var total_final = total + iva - descuento;
        total_final = parseFloat(total_final);
        $("#total_final").text(total_final);

    });

    $('#descuento').focusout(function () {


        var total = $("#total").text();
        var iva = $('#iva').val();
        var descuento = $('#descuento').val();
        $("#total_final").text();

        total = parseFloat(total);
        iva = parseFloat(iva);

        var total_final = total + iva - descuento;
        total_final = parseFloat(total_final);
        $("#total_final").text(total_final);
    });

    $('.aceptarFactura').click(function () {

        var total = $("#total").text();
        var iva = $('#iva').val();
        var descuento = $('#descuento').val();
        var total = $("#total_final").text();
        var pedido_id=$("#pedido_id").text();
        var valor_total=$("#total_final").text();
        var data={
            total:total,
            iva:iva,
            descuento:descuento,
            valor_total:total_final,
            pedido_id:pedido_id
            
        }

        $.ajax({

            url: "RegistrarFactura",
            type: 'POST',
            data: data,
                    success: function (data) {
               alertify.alert(data);
               var id=$("#pedido_id").text();
                alertify.success(id); 
               $.get('JasperReport',{id:id},function () {
                   alertify.success("hola"); 
                });
               
            }
        });

    });

});

