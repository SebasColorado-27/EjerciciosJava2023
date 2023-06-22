public class PersonaEJ3{

    //atributos
    public int documento;
    public String nombres;
    public String apellidos;
    public String email;

    // public int newdocumento;
    // public String newnombres;
    // public String newapellidos;
    // public String newemail;

    //metodos ---> Constructor del valor inicial
    public PersonaEJ3(int documento, String nombres, String apellidos, String email){
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.email = email;

        // this.documento = newdocumento;
        // this.nombres = newnombres;
        // this.apellidos = newapellidos;
        // this.email = newemail;
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
    public String getEmail(){
        return this.email;
    }

    public void setDocumento(int documento){
        this.documento=documento;
    }
    public void setNombres(String nombres){
        this.nombres=nombres;
    }
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    }
    public void setEmail(String email){
        this.email=email;
    }


    // public void setNuevodocumento(int documento){
    //     this.documento=newdocumento;
    // }
    // public void setNuevonombre(String nombres){
    //     this.nombres=newnombres;
    // }
    // public void setNuevoapellido(String apellidos){
    //     this.apellidos=newapellidos;
    // }
    // public void setNuevoemail(String email){
    //     this.email=newemail;
    // }

    public void mostrarDatosPersonales(){
        System.out.print(" => "+this.documento+" -> "+this.nombres+" "+this.apellidos);
        System.out.println(" ");
    }

}