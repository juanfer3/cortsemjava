var app = angular.module('myApp',['ngRoute']);

app.config(function($routeProvider){
    
   $routeProvider.when('/',{
       
      templateUrl:'jsp/ListaPerdida.jsp'
//       ,
//       controller:'PerdidasController'
   })
       .when('/RegistarPerdida',{
       templateUrl: 'jsp/RegistarPerdida.jsp'
//       ,
//       controller:'PerdidasController'
      
   })
       .when('/EditarPerdida',{
       templateUrl: 'jsp/EditarPerdida.jsp'
//       ,
//       controller:'PerdidasController'
      
   });
        
    
});
    
    



