


<script src="script/myLogin.js"></script>
<div class="wrapper">
    <form class="form-signin" action="Loguin" method="POST">       
        <h2 class="form-signin-heading textologuin">Iniciar Sesion</h2>
        <input type="text" class="form-control spaceinput" id="usuario" name="usuario" placeholder="Correo" required="" autofocus="" />
        <input type="password" class="form-control spaceinput" id="contrasena" name="contrasena" placeholder="Clave" required=""/>      

        <button class="btn btn-lg btn-primary btn-block" id="aceptar" type="submit">Entrar</button>   
        <label class="checkbox">
            <a href="#" value="remember-me" id="rememberMe" name="rememberMe" id="busco"> No tienes cuenta?</a>
            <a href="#" value="remember-me"  data-toggle="modal" data-target="#myModal"  id="reponerContrasena" name="rememberMe"> Olvidaste tu contraseña?</a>
        </label>
    </form>
 
    
    <!-- Modal -->
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="exampleModalLabel">Recuparar contraseña</h5>
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                </div>
                <div class="modal-body">
                    <p>Ingrese a su correo electrónico para realizar el cambio de contrasena</p>
                    <input class="form form-control" type="email"  placeholder="Correo Personal" id="correo_personal">
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal" id="enviarCorreo">Enviar</button>
                </div>
            </div>
        </div>
    </div>

</div>






