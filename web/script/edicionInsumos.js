$(document).ready(function () {
    $('#aceptar').off('click');
    $('#aceptar').on('click', function () {

    

        var nombre = $('#nombre').val();
        var t_unidad = $('#t_unidad').val();
        var cantidad = $('#cantidad').val();
        var v_unitario = $("#v_unitario").val();
        var v_total = $('#v_total').val();
        var id= $('#id').val();
        
        var data={
            
            nombre:nombre,
            t_unidad:t_unidad,
            cantidad:cantidad,
            v_unitario:v_unitario,
            v_total:v_total,
            id:id
            
            
        }
        $.ajax({
            
            url:'EdicionInsumos',
            type:'POST',
            data:data,
            success: function () {
                
                
                $("#tablaInsumos").show('slow');

                $('#EditarPedido').hide('slow');
                
//                $('#tablaInsumos').load('jsp/tablaInsumos.jsp',function(){
//                    
//                    
//                });
            }
            
        });
        
    });
    
    $('#cancelar').click(function () {
       
        $('#tablaInsumos').show('slow');

        $("#EditarPedido").hide('slow');

    });
});