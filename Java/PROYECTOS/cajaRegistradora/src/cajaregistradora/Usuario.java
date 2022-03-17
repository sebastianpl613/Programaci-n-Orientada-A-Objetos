package cajaregistradora;

import javax.swing.JOptionPane;

public class Usuario extends Persona{
    //atributos
    private String usuario;
    private String clave;
    private String tipoUsuario;
    private boolean ingreso;        
    
    public Usuario(String nombres, String apellidos, String direccion, String telefono, String email, String identificacion, String usuario, String clave, String tipoUsuario){
        setNombres(nombres);
        setApellidos(apellidos);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
        setIdentificacion(identificacion);
        setUsuario(usuario);
        setClave(clave);
        setTipoUsuario(tipoUsuario);
    }

    //Obtener nombre de usuario
    public String getUsuario() {
        return usuario;
    }

    //ObtenerClave
    public String getClave() {
        return clave;
    }

    //ObtenerTipoUsuario
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    
    //Obtener información de inicio de sesion
    public boolean isIngreso() {
        return ingreso;
    }

    //Modificar Usuario
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    //Modificar Clave
    public void setClave(String clave) {
        this.clave = clave;
    }

    //Modificar tipo de usuario
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public void setIngreso(boolean ingreso) {
        this.ingreso = ingreso;
    }
    
    public void iniciarSesion(String usuario, String clave){
        if(usuario.equals(getUsuario()) && clave.equals(getClave())){
            JOptionPane.showMessageDialog(null, "Ha iniciado Sesion correctamente", "Inicio Sesión", 1);
            setIngreso(true);
        }else{
            JOptionPane.showMessageDialog(null, "Clave Incorrecta", "Inicio Sesión", 2);
            setIngreso(false);
        }
    }
    
    public void cerrarSesion(){
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea Cerrar Sesión?", "Cerrar Sesión",JOptionPane.YES_NO_OPTION);
        if(opcion == 0){
            setIngreso(false);
        }else{
            setIngreso(true);
        }
    }
}
