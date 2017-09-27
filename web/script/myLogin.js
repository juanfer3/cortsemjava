$(document).ready(function(){
   
  $('#usuario').focusout(function () {
        
        $('#aceptar').attr("disabled", true);
        var usuario = $('#usuario').val();
        
        if(usuario=="" || usuario==null){
            
        $('#usuario').css("border", "1px solid #a94442");
        alertify.error("El campo usuario no puede estar vacio");
        
        }else{
          
           $.ajax({
           url:'ConsultarUsuario',
           type:"POST",
           data:{usuario:usuario},
           success: function (data) {
               var validar=data
               
               
                if(data==0){
                    
                    $('#usuario').css("border", "1px solid #a94442");
                    alertify.error("este usuario no esta registrado");
                    
                }else if(data==1){
                    
                    $('#usuario').css("border", "1px solid #3c763d");
                    $('#aceptar').attr("disabled", false);
                }
              
                
           }
           });
       }
    });
  
  
  $('#contrasena').focusout(function(){
     $('#aceptar').attr("disabled", true);
        var contrasena = $('#contrasena').val();
        var usuario = $('#usuario').val();
        if(contrasena=="" || contrasena==null){
            
        $('#contrasena').css("border", "1px solid #a94442");
        alertify.error("El campo usuario no puede estar vacio");
        
        }else{
            var data={
                usuario:usuario,
                contrasena:contrasena
                
            }
           $.ajax({
           url:'ConsultarContrasena',
           type:"POST",
           data:data,
           success: function (data) {
               var validar=data
               
               
                if(data==0){
                    
                    $('#contrasena').css("border", "1px solid #a94442");
                    alertify.error("este usuario no esta registrado");
                    
                }else if(data==1){
                    
                    $('#contrasena').css("border", "1px solid #3c763d");
                    $('#aceptar').attr("disabled", false);
                }
              
                
           }
           });
       }
  });
  
  
    $('#enviarCorreo').click(function(){
       
        var correo_personal= $('#correo_personal').val();
        $.ajax({
            url:'Envio',
            type:'POST',
            data:{correo_personal:correo_personal},
            success: function(data){
                alert(data);
                $('#correo_personal').val("");
                
            }
        });
    });
});


