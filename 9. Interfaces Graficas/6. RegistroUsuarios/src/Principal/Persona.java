package Principal;

public class Persona {

    private String cedula;
    private String nombres;
    private String apellidos;
    private String telefono;
    private String dirreccion;
    private String email;

    public Persona(String cedula, String nombres, String apellidos, String telefono, String dirreccion, String email) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.dirreccion = dirreccion;
        this.email = email;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDirreccion(String dirreccion) {
        this.dirreccion = dirreccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDirreccion() {
        return dirreccion;
    }

    public String getEmail() {
        return email;
    }
}
