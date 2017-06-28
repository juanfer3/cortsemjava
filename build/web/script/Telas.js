$(document).ready(function() {
    $('#aceptartelas').click(function(){
          var ref_tela = $(this).parents("tr").find(".ref_tela").val();
          var descripcion = $(this).parents("tr").find(".descripcion_tela").val();
          var eliminar="<a href='#'><span class='glyphicon glyphicon-remove borrar'></a>";
            var fila= "<tr class='fila'><td>"+ref_tela+"</td><td>"+descripcion+"</td><td>"+eliminar+"</td></tr>"
        
       
         $(".borrar").click(function () {
            alert("sjjsj");
            
        });
        
        $('.Listedetelas').append(fila);
    });
    
    
    
    
    
});


