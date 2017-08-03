$(document).ready(function (){
    
  $(".ver").off("click");
  $(".ver").on('click', function(){
     
      var id=$(this).parents("tr").find(".id").text();
      $.ajax({
          
          url:'ModalInsumos',
          type:"POST",
          data:{id:id},
          success: function(data) {
              
              $("#VerModal").html(data);
              
          }
          
      });
      
  });
  
  $(".editar").off("click");
  $(".editar").on('click', function(){
     
      var id=$(this).parents("tr").find(".id").text();
      $.get('jsp/tablaEdicionInsumos.jsp',{id:id},function(){
              
              $('#tablaInsumos').load('jsp/tablaEdicionInsumos.jsp',{id:id},function(){
                  
                  
              });
              
      });
      
  }); 
  
  $(".eliminar").off("click");
  $(".eliminar").on('click', function(){
     
      alertify.success("eliminar");
      
  });
  
  
  
  

  
    
});