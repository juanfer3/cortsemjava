$(document).ready(function(){
    var nombre = $('#nombre').val();
     var documento = $('#documento').val();
     var cargo = $('#cargo').val();
     var correo_personal=$('correo_personal').val();
     var telefono = $('#telefono').val();
     var celular = $('#celular').val();
     var direccion = $('#direccion').val();
     var fecha_nacimiento = $('#fecha_nacimiento').val();
     var usuario = $('#usuario').val();
     var contrasena = $('#contrasena').val();
//     if(nombre==""||documento==""||cargo==""||telefono==""||celular==""||fecha_nacimiento==""||usuario==""||contrasena==""||direccion==""){
//         $('#aceptar').attr("disabled", true);
//     }
   $('#nombre').focusout(function (e) {
        
        $('#aceptar').attr("disabled", true);
        var nombre = $('#nombre').val();
        if(nombre==""){
        $('#nombre').css("border", "1px solid #a94442");
        alertify.error("El campo nombre no puede estar vacio");
        return false;
        }else{
            
           $('#nombre').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#documento').focusout(function (event) {
        $('#aceptar').attr("disabled", true);
        var documento = $('#documento').val();
        if(documento==""){
        $('#documento').css("border", "1px solid #a94442");
        alertify.error("El campo nombre no puede estar vacio");
        }else{
            
           $('#documento').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#cargo').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var cargo = $('#cargo').val();
        if(cargo==""){
        $('#cargo').css("border", "1px solid #a94442");
        alertify.error("El campo cargo no puede estar vacio");
        }else{
            
           $('#cargo').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#correo_personal').focusout(function (event) {
        $('#correo_personal').attr("disabled", true);
        var correo_personal = $('#correo_personal').val();
        if(correo_personal==""){
        $('#correo_personal').css("border", "1px solid #a94442");
        alertify.error("El campo Correo Personal no puede estar vacio");
        }else{
            
           $('#correo_personal').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    
    $('#telefono').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var telefono = $('#telefono').val();
        if(telefono==""){
        $('#telefono').css("border", "1px solid #a94442");
        alertify.error("El campo telefono no puede estar vacio");
        }else{
            
           $('#telefono').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#celular').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var celular = $('#celular').val();
        if(celular==""){
        $('#celular').css("border", "1px solid #a94442");
        alertify.error("El campo celular no puede estar vacio");
        }else{
            
           $('#celular').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    $('#direccion').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var direccion = $('#direccion').val();
        if(direccion==""){
        $('#direccion').css("border", "1px solid #a94442");
        alertify.error("El campo direccion no puede estar vacio");
        }else{
            
           $('#direccion').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    
    $('#fecha_nacimiento').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var fecha_nacimiento = $('#fecha_nacimiento').val();
        if(fecha_nacimiento==""){
        $('#fecha_nacimiento').css("border", "1px solid #a94442");
        alertify.error("El campo fecha de nacimiento no puede estar vacio");
        }else{
            
           $('#fecha_nacimiento').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    
    $('#usuario').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var usuario = $('#usuario').val();
        if(usuario==""){
        $('#usuario').css("border", "1px solid #a94442");
        alertify.error("El campo usuario no puede estar vacio");
        }else{
            
           $('#usuario').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
    
    $('#contrasena').focusout(function () {
        $('#aceptar').attr("disabled", true);
        var contrasena = $('#contrasena').val();
        if(contrasena==""){
        $('#contrasena').css("border", "1px solid #a94442");
        alertify.error("El campo contraseña no puede estar vacio");
        }else{
            
           $('#contrasena').css("border", "1px solid #3c763d");
           $('#aceptar').attr("disabled", false);
        }
    });
    
});



