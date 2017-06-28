$(document).ready(function(){
   $(".hijo").click(function (){
       var nombre=$(this).parents(".padre").find(".nombre").val();
       var fila="<tr><td>"+nombre+"</td><td><button class='icon-cargando btn btn-success hijo'></button></td></tr>";
       $(".colocar").append(fila);
       alert(nombre);
       console.log(nombre);
   }) ;
    
    
});


