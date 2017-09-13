/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.json.stream.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

/**
 *
 * @author Juan
 */
public class JsonUtil {
    
    private static ObjectMapper mapper;
    static{
    
        mapper=new ObjectMapper();
        
    }
    
    public static String JavaToJson(Object object){
        String jsonResult="";
        try {           
            jsonResult=mapper.writeValueAsString(object);
                    
                    } catch (JsonGenerationException ex) {
                        System.out.println("Error generate json");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }catch (JsonMappingException ex) {
            System.out.println("Error while converting java object in json");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            System.out.println("Error occured while other reason");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return jsonResult;
    }
    
    public static <T> T JsonToJava(String jsonString, Class<T>cls){
    
                T result=null;
                
        try {
            result=mapper.readValue(jsonString, cls);
        }catch (JsonParseException ex) {
            System.out.println("Exception occured while converting the Json into java");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }catch (JsonMappingException ex) {
            System.out.println("Exception occured while converting the Json to java");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }catch (IOException ex) {
            System.out.println("Exception occured while converting the Json to java");
            Logger.getLogger(JsonUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        
             
                return result;
    }
    
}
