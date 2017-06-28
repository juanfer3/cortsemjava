$(document).ready(function (){
    
   $('.borrar').off('click');
   $('.borrar').on('click',function (){
//      alertify.success("yo elimino"); 

    var id=$(this).parents("tr").find(".id").text();
//    alertify.success(id);
    
    $.ajax({
        
        url:'EliminarPedidosDetallados',
            type: 'POST',
            data: {id:id},
            success: function (data) {
                var id=$('#pedido_id').text();
//                alertify.success(data);
                $("#tablaPedidosDetallados").load('jsp/tablaPedidosDetalladosPorID.jsp',{id:id},function (){
                               alertify.success("Registro Eliminado"); 

                    });
            }
        
    })
    


   });
    
});





