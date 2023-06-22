
package principal;


import java.sql.*;



public class Principal {
   public static void main (String[] args){
       
       Connection conexion;
       Statement manipularDB;
       
       String hostname ="localhost";
       String puerto = "3306";
       String database_name="app_java";
       String database_user="root";
       String database_password="";
       
       String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
       
       try{
            conexion = DriverManager.getConnection(url, database_user, database_password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a Base de Datos "+database_name);
       } catch(SQLException e){
            System.out.println("Error en: " + e.getMessage());
	    conexion = null;
	    manipularDB = null;
       }
       
        if(conexion!=null){
           //Extrayendo datos de la base de datos
            try{
                String consulta = "SELECT * FROM personas";
                ResultSet registros = manipularDB.executeQuery(consulta);
                registros.next();
                if(registros.getRow()==1){
                    do{
                        System.out.println("--------------------------------------------------------");
                        System.out.println("| => Fila: "+registros.getRow());
                        System.out.println("| Cedula: "+registros.getString("cedula"));
                        System.out.println("| Nombres: "+registros.getString("nombres"));
                        System.out.println("| Apellidos: "+registros.getString("apellidos"));
                        System.out.println("| Telefono: "+registros.getString("telefono"));
                        System.out.println("| Direccion: "+registros.getString("direccion"));
                        System.out.println("| Correo: "+registros.getString("email"));
                        System.out.println("--------------------------------------------------------");

                    }while(registros.next());
                }else{
                    System.out.println("No hay Personas registradas");
                }
            }catch(SQLException e){
                System.out.println("Error en SELECT: " + e.getMessage());
            }
            
            //Insertando una persona
            String cedula = "108807";
            String nombres = "Juan";
            String apellidos = "Sebastian";
            String telefono = "321227";
            String direccion = "Calle 07";
            String email = "SebasC27@gmail.com";
            
            String consulta = "INSERT INTO personas(cedula, nombres, apellidos, telefono, direccion, email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"')";
            
            try{
                int respuesta = manipularDB.executeUpdate(consulta);
                if(respuesta>0){
                    System.out.println("Registro insertado con EXITO!");
                }
            }catch(SQLException e){
                System.out.println("Error al insertar: "+e.getMessage());
            }
            
        }
    }
}
