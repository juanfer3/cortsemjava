$(document).ready(function(){
   
    
    
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


