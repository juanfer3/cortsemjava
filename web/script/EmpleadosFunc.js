$(document).ready(function (){
   
    $('.verEmpleado').off('click');
    $('.verEmpleado').on('click',function(){
        
        var id= $(this).parents("tr").find('.id').text();
        $.ajax({
            
            url:"Empleadomodal",
            type:"POST",
            data:{id:id},
            success: function(data){
                
                dialog(data);
                
            }
            
        });
    });
    
    $('.editarEmpleado').off('click');
    $('.editarEmpleado').on('click',function(){
        var id= $(this).parents("tr").find('.id').text();
        
            
            $("#listarEmpleados").load('jsp/tablaEdicionEmpleados.jsp', {id: id}, function () {
                
            });
                       
            
        
        
    });
    
    $('.eliminarEmpleado').off('click');
    $('.eliminarEmpleado').on('click',function(){
        var id= $(this).parents("tr").find('.id').text();
        alertify.confirm("Eliminar Empleaado?", function (e){
           if(e){
               alertify.success("Ok");
           } else{
               
               alertify.error("Cancel");
           }
        });
    });
});


