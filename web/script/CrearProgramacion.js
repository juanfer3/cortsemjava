var app= angular.module('myPrograment',[]);
app.controller('CrearProgramacion',function($scope,$http){
    
    $scope.t=$('.tomo').val();
    alertify.alert($scope.t);
    //$scope.result = document.getElementsByClassName("tomo");
    //console.log($scope.result);
    alertify.success($scope.result);
    $scope.Lista;
    $scope.posts;
    $scope.getPedidos= function (){
        
        $http({
           method:'GET',
           url:'PedidosNuevos'
           }).then(function (response){
               $scope.Lista=response.data;
               console.log(response.data);
               $scope.tamano=$scope.Lista.length;
               
               
               console.log(this.tamano);

 
           }),function(error){
               alertify.error("Hay Un fallo en la conexion");
           }
        
    }
    
});


