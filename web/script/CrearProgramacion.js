var app = angular.module('myPrograment', []);



app.controller('CrearProgramacion', function ($scope, $http, $timeout) {



//    $ionicLoading.show({
//        content: 'cargando...',
//        animation: 'fade-in',
//        showBackdrop: true,
//        maxWidth: 200,
//        showDelay: 0
//    });
    // $scope.t=$('.tomo').val();
    // alertify.alert($scope.t);
    //$scope.result = document.getElementsByClassName("tomo");
    //console.log($scope.result);
    //alertify.success($scope.result);
   

    
    $scope.valor;

    $scope.nombre="";
    
    $scope.Lista;

    $scope.Produccion ;
    
    $scope.myModal;
    
    $scope.posts;
    
    $scope.datas;

    $scope.CurrentDate ;
    
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
            //console.log($scope.Produccion);



            //console.log(this.tamano);


        }), function (error) {
            alertify.error("Hay Un fallo en la conexion");
        }

    }


    $scope.programar = function () {
        
 
       
        $scope.datos = {
            'id': this.myId,
            'fecha':$scope.fProgramada
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
            
            
        }, function(eror){
            
           
            alertify.alert("Tenemo Problemas con el servidor");
        });
        
    }
    
    $scope.Modal=function(lista){
       
        this.myId=lista.id;
       
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




