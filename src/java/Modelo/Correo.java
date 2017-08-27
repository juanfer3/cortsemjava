/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author USUARIO
 */
public class Correo {
    
    public boolean EnviarEmail(String para){
        
        boolean enviado= false;
        String nombre="camilovilladiego731";
        String clave="camiseta56";
        String asunto="Reponer Contraseña";
        String mensaje="para reponer su contrasena por favor de click en el siguiente Link: http://localhost:8080/Cortsem/CambioDeContrasena.jsp"; 
        
        try{
        
            String host="smtp.gmail.com";
            
            Properties prop= System.getProperties();
            
            prop.put("mail.smtp.starttls.enable","true");
            prop.put("mail.smtp.host", host);
            prop.put("mail.stmp.user", nombre);
            prop.put("mail.smtp.password",clave);
            prop.put("mail.smtp.port", 587);
            prop.put("mail.smtp.auth", "true");
            
             Session sesion= Session.getDefaultInstance(prop,null);
            
            MimeMessage message= new MimeMessage(sesion);
            
            message.setFrom(new InternetAddress(nombre));
            
            message.setRecipient(Message.RecipientType.TO,new InternetAddress(para));
            
            message.setSubject(asunto);
            message.setText(mensaje);
            
            Transport transport= sesion.getTransport("smtp");
            
            transport.connect(host,nombre,clave);
            
            transport.sendMessage(message, message.getAllRecipients());
            
            transport.close();
            enviado=true;
            
            /*
            NOTA: Enviar un correo masivo:
            
            InternetAddress[] direcciones = new InternetAddress[para.lengt];
            for(int i=0;i<para.length;i++){
                direcciones[i] = new InternetAddress(para[i]);
            
            }
            
            for(int i=0;i< direcciones.length;i++){
                message.addRecipient(Message.RecipientType.To, direcciones[i]);
            }
            
            */
        
            
            
        }catch(Exception e){
        
            e.printStackTrace();
        }
return enviado;
}
    
    
}
