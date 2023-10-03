package principal;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        
        ConsumoAPI ejemplo = new ConsumoAPI();
        Gson gson = new Gson();
        
        // GET sin datos
        System.out.println("Consumo GET: " + ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php"));
        
        // GET con Datos
        Map<String, String> getData = new HashMap<>();
        getData.put("cedula", "108805");
        System.out.println("Consumo SELECT: " + ejemplo.consumoGET("http://localhost/APIenPHP/getPersona.php", getData));
        
        // POST con Datos
        Map<String, String> insertData = new HashMap<>();
        insertData.put("cedula", "102200");
        insertData.put("nombres", "Oscar JAVA");
        insertData.put("apellidos", "Loaiza JAVA");
        insertData.put("telefono", "333333333");
        insertData.put("direccion", "Calle 20");
        insertData.put("email", "oscar@mail.com");
        System.out.println("Consumo INSERT: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Insert.php", insertData));
        
        // POST con Datos
        Map<String, String> updateData = new HashMap<>();
        updateData.put("cedula", "102200");
        updateData.put("nombres", "Oscar JAVA UPDATE");
        updateData.put("apellidos", "Loaiza JAVA UPDATE");
        updateData.put("telefono", "333333");
        updateData.put("direccion", "Calle 20");
        updateData.put("email", "oscar@mail.com");
        System.out.println("Consumo UPDATE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Update.php", updateData));
        
        // POST con Datos
        Map<String, String> deleteData = new HashMap<>();
        deleteData.put("cedula", "102200");
        System.out.println("Consumo DELETE: " + ejemplo.consumoPOST("http://localhost/APIenPHP/Delete.php", deleteData));
        
       
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("------PRUEBA DE IMPRESION CON LA CONSULTA GENERAL----------");
        System.out.println("-----------------------------------------------------------");
        System.out.println("-----------------------------------------------------------");
        
        String select = ejemplo.consumoGET("http://localhost/APIenPHP/Obtener.php"); 
        //System.out.println("RESULTADO DE LA CONSULTA GENERAL: "+select);
        JsonObject jsonObject = JsonParser.parseString(select).getAsJsonObject();

        // Obtener el arreglo de registros
        JsonArray registros = jsonObject.getAsJsonArray("registros");

        // Crear una lista de objetos Persona para almacenar los registros
        List<Persona> personas = new ArrayList<>();

        // Iterar a través de los registros y crear objetos Persona
        for (JsonElement elemento : registros) {
            JsonObject registro = elemento.getAsJsonObject();

            String cedula = registro.get("cedula").getAsString();
            String nombres = registro.get("nombres").getAsString();
            String apellidos = registro.get("apellidos").getAsString();
            String telefono = registro.get("telefono").getAsString();;
            String direccion = registro.get("direccion").getAsString();
            String email = registro.get("email").getAsString();

            // Crear un objeto Persona y agregarlo a la lista
            Persona persona = new Persona(cedula, nombres, apellidos, telefono, direccion, email);
            personas.add(persona);
        }

        // Ahora puedes trabajar con la lista de objetos Persona
        for (Persona persona : personas) {
            System.out.println("Cedula: " + persona.getCedula());
            System.out.println("Nombres: " + persona.getNombres());
            System.out.println("Apellidos: " + persona.getApellidos());
            System.out.println("Telefono: " + persona.getTelefono());
            System.out.println("Direccion: " + persona.getDireccion());
            System.out.println("Email: " + persona.getEmail());
            System.out.println("----------");
        }

        System.out.println("----------------------------------------");

        
    }    
}
