var app = angular.module('myPrograment', ['ionic']);

app.controller('CrearProgramacion', function ($scope, $http, $timeout, $ionicLoading) {

    $ionicLoading.show({
        content: 'cargando...',
        animation: 'fade-in',
        showBackdrop: true,
        maxWidth: 200,
        showDelay: 0
    });
    // $scope.t=$('.tomo').val();
    // alertify.alert($scope.t);
    //$scope.result = document.getElementsByClassName("tomo");
    //console.log($scope.result);
    //alertify.success($scope.result);





    $scope.Lista;

    $scope.Produccion ;

    $scope.posts;


    getPedidos();
    //getPedidosEnProduccion();
    function getPedidos() {

        $http({
            method: 'GET',
            url: 'PedidosNuevos'
        }).then(function (response, $timeout) {
            
            console.log(response.data);
            
            
            $scope.Lista = response.data;
            
            


            //console.log(this.tamano);

            $ionicLoading.hide();
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
            console.log($scope.Produccion);



            //console.log(this.tamano);


        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }


    $scope.programar = function (lista) {
        $ionicLoading.show({
            content: 'cargando...',
            animation: 'fade-in',
            showBackdrop: true,
            maxWidth: 200,
            showDelay: 0
        });

        $scope.datos = {
            'id': lista.id

        };
        $http({
            method: 'POST',
            data: this.datos,
            url: 'ProgramarPedido'
        }).then(function (response) {

            alertify.success(response.data);
            console.log(response.data);
            getPedidos();
            getPedidosEnProduccion();
            $ionicLoading.hide();
        }, function (error) {
            $ionicLoading.hide();
            alertify.alert("Tenemo Problemas con el servidor");
            
        });

    }


});


