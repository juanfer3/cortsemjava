/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

var app= angular.module('Produccion',[]);

app.controller('myController', function($scope, $http){
   
   
    $scope.Lista;
    getPedidosEnProduccion();
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
    
    
    
});



