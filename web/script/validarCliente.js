$(document).ready(function () {

    var Nombre = $('#name').val();
    var Documento = $('.documento').val();
    var Telefono = $('#fijo').val();
    var Celular = $('#mobile').val();
    var Correo = $('#email').val();
    var Direccion = $('#city').val();
    var Usuario = $('#usua').val();
    var Contraseña = $('#clave').val();



    $('#name').focusout(function (e) {

        $('#grabar').attr("disabled", true);
        var Nombre = $('#name').val();
        if (Nombre == "") {
            $('#name').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
            return false;
        } else {

            $('#name').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });

    $('.documento').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('.documento').val();
        if (documento == "") {
            $('.documento').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('.documento').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });
    $('#fijo').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#fijo').val();
        if (documento == "") {
            $('#fijo').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#fijo').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });

    $('#mobile').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#mobile').val();
        if (documento == "") {
            $('#mobile').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#mobile').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });

    $('#email').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#email').val();
        if (documento == "") {
            $('#email').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#email').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });

    $('#city').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#city').val();
        if (documento == "") {
            $('#city').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#city').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });
    $('#usua').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#usua').val();
        if (documento == "") {
            $('#usua').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#usua').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });
    $('#clave').focusout(function (event) {
        $('#grabar').attr("disabled", true);
        var documento = $('#clave').val();
        if (documento == "") {
            $('#clave').css("border", "1px solid #a94442");
            alertify.error("El campo nombre no puede estar vacio");
        } else {

            $('#clave').css("border", "1px solid #3c763d");
            $('#grabar').attr("disabled", false);
        }
    });

});