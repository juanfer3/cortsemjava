angular.module('myApp', [])
.controller('AppController', function  InvoiceController($scope, $http) {
  $scope.prenda;
  $scope.tela;
  $scope.talla;
  $scope.cantidad ;
  $scope.InsertProgramacion;
  $scope.validar;

  $scope.myprenda;
  $scope.mytela;
  $scope.mytalla;
  $scope.mycantidad ;

  $scope.programar=[];
  this.users =[];
  this.pro=[];
  this.submit = function addNote() {
    var data ={
      prenda: $scope.prenda,
      tela: $scope.tela,
      talla: $scope.talla,
      cantidad: $scope.cantidad

    };
    this.users.push(data);

    $scope.programar.push(data);
    /*$scope.prenda = " ";
    $scope.tela = " ";
    $scope.talla = " ";
    $scope.cantidad = " ";*/

  };
  this.count=function(){ return this.users.length;}
  this.delete=function(index){
    if (index > -1) {
      this.users.splice(index, 1);
    }
  }

  $scope.InsertProgramacion = function(){

      //alertify.alert("hola");


  }

  $scope.validarPrenda = function(){


      if ($scope.prenda==null||$scope.prenda=="") {
          alertify.error("El campo Prenda no puede esta vacio");
          console.log($scope.prenda);
          $scope.myprenda={
            valido:false,
            invalido:true

          }
          $scope.habilitado=true;
      } else {

        console.log($scope.prenda);
        $scope.myprenda={
          valido:true,
          invalido:false
        }
        $scope.habilitado=false;
      }

  }


$scope.validarTela = function(){
if($scope.tela==null||$scope.tela==""){
    alertify.error("El campo tela no puede estar vacio");
    $scope.mytela={

      valido:false,
      invalido:true

    }
    $scope.habilitado=true;
    }else{
      $scope.mytela={

        valido:true,
        invalido:false

      }
      $scope.habilitado=false;
    }

  }

  $scope.validarTalla = function(){
  if($scope.talla==null||$scope.talla==""){
      alertify.error("El campo talla no puede estar vacio");
      $scope.mytalla={

        valido:false,
        invalido:true

      }
      $scope.habilitado=true;
      }else{
        $scope.mytalla={

          valido:true,
          invalido:false

        }
        $scope.habilitado=false;
      }

    }


    $scope.validarCantidad = function(){
    if($scope.cantidad==null||$scope.cantidad==""){
        alertify.error("El campo cantidad no puede estar vacio");
        $scope.mycantidad={

          valido:false,
          invalido:true

        }
        $scope.habilitado=true;
        }else{
          $scope.mycantidad={

            valido:true,
            invalido:false

          }
          $scope.habilitado=false;
        }

      }


      $scope.registrarPedido = function(){


        this.pro= {
          prenda: $scope.prenda,
          tela: $scope.tela,
          talla: $scope.talla,
          cantidad: $scope.cantidad
        };

        alertify.success(this.pro);
        console.log($scope.prenda)
        $http({
          method: 'POST',
          data: this.pro,
          url:'RegistrarProgramacion'
        }).then(function(respuesta){
          console.log(this.respuesta);
          alert(this.respuesta);
        }, function(error){
          alert("tenemos problemas :(")
        });

      }

});
