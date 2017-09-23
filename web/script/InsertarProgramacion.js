/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var app= angular.module('Produccion',[]);

app.controller('myController', function($scope, $http){
   
    $scope.tomo=0;
    $scope.Lista;
    $scope.Lista2;
    $scope.Lista3;
    $scope.myModal;
    $scope.CurrentDate = new Date();
    getPedidosEnProduccion();
    getPedidosEnProceso();
    function getPedidosEnProduccion() {

        $http({
            method: 'GET',
            url: 'PedidosEnProduccion'
        }).then(function (response) {
            
            $scope.Lista = response.data;
           


        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }
    
    function getPedidosEnProceso() {

        $http({
            method: 'GET',
            url: 'ProcesarProduccion'
        }).then(function (response) {
            
            $scope.Lista2 = response.data;
            console.log(response.data);

        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }
    
    function getPedidosTerminados() {

        $http({
            method: 'GET',
            url: 'PedidoTerminado'
        }).then(function (response) {
            
            $scope.Lista3 = response.data;
           


        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

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
           
            alertify.error("Tenemos Problemas con el servidor");
            
        });
        
    }
    
$scope.registros= function(lista) {
        
        $scope.datos={
            'id':lista.id,
            'cantidad':lista.cantidadProducida
            
        }
        
        $http({
           url:'RegistrarPieza',
           method:"POST",
           data:this.datos
           
        
        }).then(function (response){
//            alertify.success(response.data);
//            console.log(response.data);
            getPedidosEnProduccion();
        getPedidosEnProceso();
        },function(){
            alertify.error("Tenemos Problemas con el servidor");
        });
       
        
    }
    
    
    $scope.ProducirPedidos = function (lista) {
        
        
        this.fecha=$('#fecha').val();
        alertify.error(lista.pedidoId.id);
        alertify.error(this.fecha);
        $scope.datos = {
            'id': lista.pedidoId.id,
            'fecha':this.fecha
        };
        $http({
            method: 'POST',
            data: this.datos,
            url: 'ProducirPedidos'
        }).then(function (response) {

            
            console.log(response.data);
            getPedidosEnProduccion();
            getPedidosEnProceso();
            
            
        }, function (error) {
           
            alertify.alert("Tenemos Problemas con el servidor");
            
        });

    }
    
});



