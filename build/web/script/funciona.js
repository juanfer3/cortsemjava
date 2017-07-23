

var boton=document.getElementById("boton");
var menu=document.getElementById("menu");

boton.addEventListener('click', function(){
    
    menu.classList.toggle("cambio");
    
    
});


function solonumeros(e){
    
    key=e.keysCode || e.which;
    teclado= String.fromCharCode(key);
    numeros="1234567890-.";
    
    if(numeros.indexOf(teclado)== -1){
        
        return false
        
    }
    
}


