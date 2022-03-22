package cajaregistradora;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Usuario extends Persona{
    //atributos
    private String usuario;
    private String clave;
    private String tipoUsuario;
    private boolean ingreso;    
    private List<Usuario>userList;    
    
    public Usuario(String nombres, String apellidos, String direccion, String telefono, String email, String identificacion, String fechaDeNacimiento, String usuario, String clave, String tipoUsuario){
        setNombres(nombres);
        setApellidos(apellidos);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
        setIdentificacion(identificacion);
        setFechaNacimiento(fechaDeNacimiento);
        setUsuario(usuario);
        setClave(clave);
        setTipoUsuario(tipoUsuario);
        this.userList = new ArrayList();
    }
    
    public Usuario(String nombres, String apellidos, String direccion, String telefono, String email, String identificacion, String fechaDeNacimiento){
        setNombres(nombres);
        setApellidos(apellidos);
        setDireccion(direccion);
        setTelefono(telefono);
        setEmail(email);
        setIdentificacion(identificacion);
        setFechaNacimiento(fechaDeNacimiento);
        this.userList = new ArrayList();
    }

    public Usuario() {
        this.userList = new ArrayList();
    }

    //Obtener Lista de usuarios
    public List<Usuario> getUserList() {
        return userList;
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

    public void setUserList(List<Usuario> userList) {
        this.userList = userList;
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
    
    public void registrarCliente(String nombres, String apellidos, String direccion, String telefono, String email, String identificacion, String fechaDeNacimiento){
        userList.add(new Usuario(
            nombres,
            apellidos,
            direccion,
            telefono,
            email,
            identificacion,
            fechaDeNacimiento)
        );
        
        JOptionPane.showMessageDialog(null, "El Usuario Se registro correctamente", "Pepitos S.A.S", 1);
    }
    
    public void obtenerTodosLosClientes(){
        for (int i = 0; i < userList.size(); i++) {
            String textoUsuarios = "\n nombre: "+userList.get(i).getNombres()
                    +"\n apellidos: "+userList.get(i).getApellidos()
                    +"\n dirección: "+userList.get(i).getDireccion()
                    +"\n telefono: "+userList.get(i).getTelefono()
                    +"\n email: "+userList.get(i).getEmail()
                    +"\n identificacion: "+userList.get(i).getIdentificacion()
                    +"\n añoDeNacimiento: "+userList.get(i).getUsuario();
            JOptionPane.showMessageDialog(null, textoUsuarios, "Pepitos S.A.S", 1);
        }
    }
}
