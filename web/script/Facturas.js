$(document).ready(function(){
   var total=$("#total").text();
   var iva=19;
   $("#total_final").text();
   
   total= parseFloat(total);
   iva=parseFloat(iva);
   
   
   var total_final=total+iva
   
   $("#total_final").text(total_final);
});

