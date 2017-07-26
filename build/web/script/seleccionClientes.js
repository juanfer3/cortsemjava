
$(document).ready(function(){
    
  $('#f_pedido').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var f_pedido = $('#f_pedido').val();
        if(f_pedido==""){
        $('#f_pedido').css("border", "1px solid #a94442");
        alertify.error("El campo fecha de pedido no puede estar vacio");
        }else{
            
           $('#f_pedido').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#f_entrega').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var f_entrega = $('#f_entrega').val();
        if(f_entrega==""){
        $('#f_entrega').css("border", "1px solid #a94442");
        alertify.error("El campo fecha de nacimiento no puede estar vacio");
        }else{
            
           $('#f_entrega').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
});

