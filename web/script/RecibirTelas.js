$(document).ready(function (){
    
    var tela=$('.tela').val();
     
        $.ajax({
           url:"BuscarDescripcionTela",
           type: 'POST',
            data: {id:tela},
            success: function (data) {
                $("#descripcion").val(data);
            }
            
        });
 
    
   
    
   $('.tela').change(function(){
     
     var tela=$('.tela').val();
     
        $.ajax({
           url:"BuscarDescripcionTela",
           type: 'POST',
            data: {id:tela},
            success: function (data) {
                $("#descripcion").val(data);
            }
            
        });
     
     
       
       
   });
   
   var tipo_de_unidad = $('#tipo_de_unidad').val();
   var cantidad = $('#cantidad').val();
   var cliente = $('#cliente').val();
   
   $("#tipo_de_unidad").focusout(function(){
      var tipo_de_unidad = $('#tipo_de_unidad').val();
       if(tipo_de_unidad=="" ){
       alertify.error("Todos los campos deben estar llenos");
       $('#tipo_de_unidad').css("border", "1px solid #a94442");
       
   }else{
       
       $('#tipo_de_unidad').css("border", "1px solid #3c763d");
       
   }
       
   });
       
     $("#cantidad").focusout(function(){
      var cantidad = $('#cantidad').val();
       if( cantidad==""){
       alertify.error("Todos los campos deben estar llenos");
       $('#cantidad').css("border", "1px solid #a94442");
   }else{
       
      
       $('#cantidad').css("border", "1px solid #3c763d");
   }
       
   });  
       
   
   $('#aceptar').click(function(){
      
       var seleccion=$('#tela option:selected').text();
       var cliente=$('#cliente option:selected').text();
      
       var tela_id=$('#tela').val();
       var descripcion=$('#descripcion').val();
       var tipo_de_unidad=$('#tipo_de_unidad').val();
       var cantidad=$('#cantidad').val();
       var cliente_id=$('#cliente').val();
       var eliminar="<a href='#'><span class='glyphicon glyphicon-ok' id='eliminar'></span></a>";
       var fila='<tr><td>'+seleccion+'</td><td>'+descripcion+'</td><td>'+tipo_de_unidad+'</td><td>'+cantidad+'</td><td>'+cliente+'</td><td>'+eliminar+'</td></tr>';
       
       var data={
          tela_id:tela_id,
          cliente_id:cliente_id,
          tipo_de_unidad:tipo_de_unidad,
          cantidad:cantidad   
       }
       
       $('#TelaRecibida').append(fila);
       $.ajax({
           url:'RecibirTela',
           type: 'POST',
           data:data,
            success: function (data, textStatus, jqXHR) {
                alertify.success(data);
                
            }
                   
       })
       
       
       
   });
   
   
   
   
    
});

