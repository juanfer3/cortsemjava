$(document).ready(function (){
    
    
   var cont=0;
    $('.hijo').click(function (){
        
        cont=cont+=1;
        alert(cont);
        var f_pedido = $('#f_pedido').val();        
        var f_entrega=$("#f_entrega").val();  
        var documento=$("#documento").val();
        var descripcion_pedido=$("#nombre").val();
        var prenda= $("#prenda").val();
        var pieza= $("#pieza").val();
        var cantidad= $("#cantidad").val();
        var talla= $("#talla").val();
        
        var ref_tela=$("#ref_tela").val();
        var descripcion_tela=$("#descripcion_tela").val();
        var diseno_tela=$("#diseno_tela").val();
        var valor_unitario=$("#valor_unitario").val();
        var valor_total=$("#valor_total").val();
        var iva=$("#iva").val();
        
       $.post('tablaPedido.jsp',{
           'prenda':prenda,'pieza':pieza,'cantidad':cantidad,'talla':talla,
           'descripcion_pedido':descripcion_pedido,'f_pedido':f_pedido,
           'f_entrega':f_entrega,'documento':documento,'contador':cont,'ref_tela':ref_tela,
           'descripcion_tela':descripcion_tela,'diseno_tela':diseno_tela,'valor_unitario':valor_unitario,
           'valor_total':valor_total,'iva':iva
        
        },function(tabla){
          
           $('#tabla').html(tabla);
           
       });
//        
             });
             
             
             $('#eliminar').click(function(){
                alert("jojo"); 
             });
    
});



    
    
   






