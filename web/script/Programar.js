var app = angular.module('myPrograment', []);



app.controller('CrearProgramacion', function ($scope, $http, $timeout) {



   

    
    $scope.valor;

    $scope.nombre="";
    
    $scope.Lista;

    $scope.Produccion ;
    
    $scope.myModal;
    
    $scope.posts;
    
    $scope.datas;

    $scope.CurrentDate = Date();
    
    getPedidos();
    
    function getPedidos() {

        $http({
            method: 'GET',
            url: 'PedidosNuevos'
        }).then(function (response, $timeout) {
            
            console.log(response.data);
            
            
            $scope.Lista = response.data;
            
            


          

            
        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }

    function getPedidosEnProduccion() {

        $http({
            method: 'GET',
            url: 'PedidosEnProduccion'
        }).then(function (response) {
            
            $scope.Produccion = response.data;
            


        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }


    $scope.programar = function (lista) {
        
      this.fecha=$('#fecha').val();
     
       
        $scope.datos = {
            'id': lista.pedidoId.id,
            'fecha':this.fecha
        };
        $http({
            method: 'POST',
            data: this.datos,
            url: 'ProgramarPedido'
        }).then(function (response) {

            
            console.log(response.data);
            getPedidos();
            
            
        }, function (error) {
           
            alertify.alert("Tenemos Problemas con el servidor");
            
        });

    }
    
    $scope.DeshacerProgramacion= function(lista){
        
        $scope.datas = {
            'id': lista.id

        };
        $http({
           
           method:"POST",
           data: this.datas,
           url:'DeshacerPedido'
           
        }).then(function(response){
           
            console.log(response.data);
            getPedidos();
            
            
        }, function(error){
            
           
            alertify.alert("Tenemo Problemas con el servidor");
        });
        
    }
    
    $scope.Modal=function(lista){
     
        $scope.valor=lista.id;
       
         $scope.datos = {
            'id': lista.id

        };
       
        $http({
            method: 'POST',
            data: this.datos,
            url: 'ModalProgramacion'
        }).then(function (response) {

            
            console.log(response.data);
            $scope.myModal=response.data;
            
           
        }, function (error) {
           
            alertify.alert("Tenemos Problemas con el servidor");
            
        });
        
    }
    




});




