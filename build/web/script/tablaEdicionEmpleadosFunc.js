$(document).ready(function(){
    
 
    $('#aceptarEdicion').click(function(){
       alertify.success("acepto");
       
       $.post({
           
           url:"AceptarEdicionEmpleado",
           type:"POST",
           data:data,
           success: function(data){
               alertify.success("llego al servlet");
               
           }
           
           
       });
       
//       $('#tablaEdicionEmpleados').load('ListarEmpleados',function(){
//           alerttify.success("hoho");
//       });
        
        
    });
    
    
});

