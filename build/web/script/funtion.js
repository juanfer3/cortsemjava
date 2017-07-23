$(document).ready(function () {
   
    $(".hijo").click(function () {

        alert("hoho");
      
        
        
        
    });


});





function solonumeros(e) {

    key = e.keysCode || e.which;
    teclado = String.fromCharCode(key);
    numeros = "1234567890-.";

    if (numeros.indexOf(teclado) == -1) {

        return false

    }

}






//        var prenda = $(this).parents(".padre").find(".prenda").val();
//        var pieza = $(this).parents(".padre").find(".pieza").val();
//        var talla = $(this).parents(".padre").find(".talla").val();
//        var cantidad = $(this).parents(".padre").find(".cantidad").val();
//        var fila = "<tr><td>" + prenda + "</td><td>" + pieza + "</td><td>" + talla + "</td><td>" + cantidad + "</td><td><button class='icon-cargando btn btn-success hijo'></button></td></tr>";
//        $(".colocar").append(fila);
//        contador = contador + 1;

//        var mensaje="";
//        document.getElementsByClassName(".borrar").value = mensaje;
//        console.log(nombre);
//        location.href="PaginaPedido.jsp?objeto="+pedido+"";
        
//        $(this).parents(".padre").find(".prenda").val(" ");
//        $(this).parents(".padre").find(".pieza").val(" ");
//        $(this).parents(".padre").find(".talla").val(" ");
//        $(this).parents(".padre").find(".cantidad").val(" ");



//var boton=document.getElementById("boton");
//var menu=document.getElementById("menu");
//
//boton.addEventListener('click', function(){
//    
//    menu.classList.toggle("cambio");
//    
//    
//});