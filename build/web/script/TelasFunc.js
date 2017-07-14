$(document).ready(function () {

    $('#aceptartelas').click(function () {
        var ref_tela = $(this).parents("tr").find(".ref_tela").val();
        var descripcion = $(this).parents("tr").find(".descripcion_tela").val();
        
        $(this).parents("tr").find(".ref_tela").val(" ");
        $(this).parents("tr").find(".descripcion_tela").val(" ");
        
        var eliminar = "<a href='#'class='eliminar'><span class='glyphicon glyphicon-remove borrar'></a>";

        var fila = "<tr class='fila padre'><td><input type='text' class='form-control hijo' value=" + ref_tela + "></td><td><input type='text' class='form-control newdecrip' value=" + descripcion + "></td><td>" + eliminar + "</td></tr>"

        

        var data = {

            ref_tela: ref_tela,
            descripcion: descripcion


        };
        
        

        $.ajax({

            url: 'insertarTelas',
            type: "POST",
            data: data,
            success: function (data) {

                if (data != 0) {

                    $('.Listedetelas').append(fila);
                    $('eliminar').off("click");
                    $('.eliminar').on("click",function () {
                        var eliminarRef = $(this).parents(".padre").find(".hijo").val();
                        var eliminarDes = $(this).parents(".padre").find(".newdecrip").val();


                        var filaEliminar=$(this).parents('.padre');
                        var deleteData = {

                            ref_tela: eliminarRef,
                            descripcion: eliminarDes

                        };
                        alertify.confirm("<p>Realmente desea borrar este Registro?</p>", function (e) {
                            if (e) {

                                $.ajax({

                                    url: 'eliminarTelas',
                                    type: "POST",
                                    data: deleteData,
                                    success: function (data) {


                                        if (data != 0) {
                                            
                                            
                                            filaEliminar.remove();
                                            alertify.success("Registro Eliminado '" + alertify.labels.ok + "'");
                                        } else {

                                            alert("no se pudo eliminar");

                                            alertify.error("no se a podido eliminar el registro'" + alertify.labels.cancel + "'")
                                        }


                                    }

                                });



                                
                            } else {

                                alertify.error("Peticion Cancelada'" + alertify.labels.cancel + "'")

                            }

                        });









                    });
                } else {

                    alert("Hay un problema con la insercion");

                }
            }
        });






    });






});



