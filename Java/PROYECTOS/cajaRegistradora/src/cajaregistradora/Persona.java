package cajaregistradora;
public class Persona {
    //atributos
    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String email;
    private String identificacion;
    
    //Obtener nombres de la persona
    public String getNombres() {
        return nombres;
    }
    
    //Obtener apellidos de la persona
    public String getApellidos() {
        return apellidos;
    }

    //Obtener direccion de la persona
    public String getDireccion() {
        return direccion;
    }

    //Obtener email de la persona
    public String getEmail() {
        return email;
    }

    //Obtener identificacion de la persona
    public String getIdentificacion() {
        return identificacion;
    }

    //Obtener telefono de la persona
    public String getTelefono() {
        return telefono;
    }
    
    //Cambiar nombre de la persona
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    //Cambiar apellidos de la persona
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Cambiar dirección de la persona
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    //cambiar telefono de la persona
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    //cambiar email de la persona
    public void setEmail(String email) {
        this.email = email;
    }

    //cambiar identificación de la persona
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
}
