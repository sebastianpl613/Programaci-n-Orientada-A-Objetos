package cajaregistradora;


import javax.swing.JOptionPane;

public class CajaRegistradora {
    //atributos
    static Usuario user1 = new Usuario(
            "sebastian",
            "pabon lopez",
            "Avenida Patricio 26 NORTE #31-62K SUR ESTE",
            "3223142488",
            "sebastian.pabon@pi.edu.co",
            "1000366173",
            "2001",
            "tendero1",
            "123",
            "ADMIN");
    static Usuario clientes = new Usuario();
    
    public static void main(String[] args) {
        //Genera un Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido ala tienda Pepitos S.A.S", "Pepitos S.A.S", 1);
        
        //Genera un ciclo que permite repetir el inicio de sesion hasta que este sea correcto
        do{
            String textoUsuario = JOptionPane.showInputDialog(null, "Ingrese Usuario: ", "Pepitos S.A.S", 3);
            String textoClave = JOptionPane.showInputDialog(null, "Ingrese Clave: ", "Pepitos S.A.S", 3);

            user1.iniciarSesion(textoUsuario, textoClave);
        }while(!user1.isIngreso());
        
        //Verifica que el inicio de sesión sea correcto y el tipo de usuario
        //Si el tipo de usuario es ADMIN muestra un menu de opciones de lo contrario muestra un mensaje de error
        if(user1.isIngreso() && user1.getTipoUsuario().equals("ADMIN")){
            //Se ejecuta multiples veces hasta que ingresar sea false
            while(user1.isIngreso()){
                //Mensaje del menu de opciones
                String mensajeOpciones = "Ingrese una opción \n"
                        +  "1. Registrar Venta \n"
                        + " 2. Registrar Clientes \n"
                        + " 3. Registrar Producto \n"
                        + " 4. Ver productos \n"
                        + " 5. Ver Ventas \n"
                        + " 6. Ver Clientes \n"
                        + " 7. Salir del Programa \n";
                //Petición de la opción a seleccionar
                String opcion = JOptionPane.showInputDialog(null, mensajeOpciones, "Pepitos S.A.S", 1);
                switch(Integer.parseInt(opcion)){
                    case 1:
                        //TODO: realizar el registro de venta
                        break;
                    case 2:
                        //Solicitar datos para la creeación del nuevo cliente
                        String nombres = JOptionPane.showInputDialog(null, "Ingrese nombres: ", "Pepitos S.A.S", 3);
                        String apellidos = JOptionPane.showInputDialog(null, "Ingrese apellidos: ", "Pepitos S.A.S", 3);
                        String direccion = JOptionPane.showInputDialog(null, "Ingrese dirección: ", "Pepitos S.A.S", 3);
                        String telefono = JOptionPane.showInputDialog(null, "Ingrese telefono: ", "Pepitos S.A.S", 3);
                        String correo = JOptionPane.showInputDialog(null, "Ingrese correo: ", "Pepitos S.A.S", 3);
                        String identificacion = JOptionPane.showInputDialog(null, "Ingrese identidicacion: ", "Pepitos S.A.S", 3);
                        boolean esAnoValido = false;
                        String fechaDeNacimiento = JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento: ", "Pepitos S.A.S", 3);
                        while (!esAnoValido) {
                            if (Integer.parseInt(fechaDeNacimiento) > 2004) {
                                JOptionPane.showMessageDialog(null, "¡La persona no tiene edad suficiente para ingresar al sistema!", "Pepitos S.A.S", 0);
                                fechaDeNacimiento = JOptionPane.showInputDialog(null, "Ingrese el año de nacimiento: ", "Pepitos S.A.S", 3);
                            }else{
                                esAnoValido = true;
                            }
                        }
                        
                        //Crear la nueva persona e invocar el metodo que se encarga de añadirlo
                        clientes = new Usuario(nombres, apellidos, direccion, telefono, correo, identificacion, fechaDeNacimiento);
                        clientes.registrarCliente();
                        break;
                    case 3:
                        //TODO: realizar el registro de producto
                        break;
                    case 4:
                        //TODO: mostrar todos los productos registrados con su cantidad
                        break;
                    case 5:
                        //TODO: mostrar todas las ventas realizadas
                        break;
                    case 6:
                        //Se invoca el metodo para llamar a los clientes que se encuentran registrados
                        clientes.obtenerTodosLosClientes();
                        break;
                    case 7:
                        //Permite invocar el metodo que cierra la sesión
                        user1.cerrarSesion();
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción Invalida", "Pepitos S.A.S", 0);
                        break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Su usuario no esta habilitado", "Pepitos S.A.S", 0);
        }
    }
}
