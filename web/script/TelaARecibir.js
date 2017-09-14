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
      url
       
       
   });
   
   
   
   
    
});

