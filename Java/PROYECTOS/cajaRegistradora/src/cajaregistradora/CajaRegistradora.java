package cajaregistradora;

import javax.swing.JOptionPane;

public class CajaRegistradora {
    //atributos
    static Usuario user1 = new Usuario(
            "sebastian","pabon lopez"
            ,"Avenida Patricio 26 NORTE #31-62K SUR ESTE",
            "3223142488",
            "sebastian.pabon@pi.edu.co",
            "1000366173",
            "tendero1",
            "12345678",
            "ADMIN");
    
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
                String mensajeOpciones = "Ingrese una opción \n"
                        +  "1. Registrar Venta \n"
                        + " 2. Registrar Usuario \n"
                        + " 3. Registrar Producto \n"
                        + " 4. Ver productos \n"
                        + " 5. Ver Ventas \n"
                        + " 6. Ver Usuarios \n"
                        + " 7. Salir del Programa \n";
                String opcion = JOptionPane.showInputDialog(null, mensajeOpciones, "Pepitos S.A.S", 1);
                switch(Integer.parseInt(opcion)){
                    case 1:
                        //TODO: realizar el registro de venta
                        break;
                    case 2:
                        //TODO: realizar el registro de Usuario
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
                        //TODO: mostrar todos los usuarios sin incluir las claves
                        break;
                    case 7:
                        //TODO: salir del programa
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
