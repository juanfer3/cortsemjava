$(document).ready(function(){
    
 
    $('#aceptarEdicion').click(function(){
       alertify.success("acepto");
       var nombre=$('#nombre').val();
       var documento=$('#documento').text();
       var cargo=$('#cargo').val();
       var telefono=$('#telefono').val();
       var celular=$('#celular').val();
       var direccion=$('#direccion').val();
       var rh=$('#rh').text();
       var f_nacimiento=$('#f_nacimiento').val();
       var contacto_familiar=$('#contacto_familiar').val();
       var telefono_contacto=$('#telefono_contacto').val();
       var celular_contacto=$('#celular_contacto').val();
       var usuario=$('#usuario').val();
       var id=$('#id').val();
        var data={
          
           nombre:nombre,
           documento:documento,
           cargo:cargo,
           telefono:telefono,
           celular:celular,           
           direccion:direccion,
           rh:rh,
           f_nacimiento:f_nacimiento,
           contacto_familiar:contacto_familiar,
           telefono_contacto:telefono_contacto,
           celular_contacto:celular_contacto,
           usuario:usuario,
           id:id
           
       }
       $.post({
           
           url:"AceptarEdicionEmpleado",
           type:"POST",
           data:data,
           success: function(data){
               $('#tablaEdicionEmpleados').load('jsp/ListarEmpleadosJSP.jsp', function(){
                   
               });
               
           }
           
           
       });
       
//       $('#tablaEdicionEmpleados').load('ListarEmpleados',function(){
//           alerttify.success("hoho");
//       });
        
        
    });
    
    
});



