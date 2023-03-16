public class Persona{

    //atributos
    public int documento;
    public String nombres;
    public String apellidos;
    public String direccion;
    public String telefono;
    public String email;
    private String password;

    //metodos ---> Constructor del valor inicial
    public Persona(int documento, String nombres, String apellidos, String direccion, String telefono, String email){
        this.documento=documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.password = String.valueOf(documento);
    }


    public int getDocumento(){
        return this.documento;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getEmail(){
        return this.email;
    }


    public void setDcumento(int documento){
        this.documento=documento;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setDireccion(String direccion){
        this.direccion=direccion;
    }
    public void setTelefono(String telefono){
        this.telefono=telefono;
    }
    public void setEmail(String email){
        this.email=email;
    }


    public boolean setPassword(String old_pass, String new_pass){
        if (old_pass.equals(this.password)){
            this.password = new_pass;
            return true;
        }else{
            System.out.println(" -> Constraseña incorrecta.");
            return false;
        }
    }


    public void mostrarDatosPersonales(){
        // System.out.println("-----------------------------");
        System.out.print("  | Documento: "+this.documento);
        System.out.print("  | Nombres: "+this.nombres);
        System.out.print("  | Apellidos: "+this.apellidos);
        System.out.print("  | Direccion: "+this.direccion);
        System.out.print("  | Telefono: "+this.telefono);
        System.out.print("  | Email: "+this.email);
        System.out.println(" ");
    }
    

    public void mostrarResumenDatos(){
        System.out.println("   "+this.documento);
    }
}