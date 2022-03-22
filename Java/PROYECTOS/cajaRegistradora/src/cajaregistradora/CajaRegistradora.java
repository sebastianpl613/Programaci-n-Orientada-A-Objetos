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
            "12345",
            "ADMIN");
    static Usuario clientes = new Usuario();
    
    public static void main(String[] args) {
        //Genera un Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenido a la tienda Pepitos S.A.S", "Pepitos S.A.S", 1);
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
                        + " 3. Ver Clientes \n"
                        + " 4. Salir del Programa \n";
                //Petición de la opción a seleccionar
                String opcion = JOptionPane.showInputDialog(null, mensajeOpciones, "Pepitos S.A.S", 1);
                switch(Integer.parseInt(opcion)){
                    case 1:
                        //TODO: realizar el registro de venta
                        String mensajeCategorias = "Ingrese una opción \n"
                        +  "1. Lacteos \n"
                        + " 2. Frutas \n"
                        + " 3. Verduras \n"
                        + " 4. Abarrotes \n";
                        String categorias = JOptionPane.showInputDialog(null, mensajeCategorias);                      
                        switch(categorias){
                            case "Lacteos":
                                System.out.println("Entre a lacteos");
                                    String mensajeLacteos= "Ingrese una opción \n"
                                    +  "1. Leche  $2,500 \n"
                                    + " 2. Queso  $4,000\n"
                                    + " 3. Kumis  $2,000\n"
                                    + " 4. Crema de Leche  $3,600\n";
                                String productoLacteos = JOptionPane.showInputDialog(null, mensajeLacteos);                      
                                switch(productoLacteos){
                                    case "Leche":
                                        System.out.println("Entre a leche");
                                        break; 
                                    case "Queso":
                                        System.out.println("Entre a queso");
                                        break;
                                    case "Kumis":
                                        System.out.println("Entre a Kumis");
                                        break;
                                    case "Crema de Leche":
                                        System.out.println("Entre a Crema de Leche");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "No se encontro el producto", "Pepitos S.A.S", 1);
                                        break;
                                }
                                break; 
                                
                            case "Frutas":
                                System.out.println("Entre a Frutas");
                                String mensajeFrutas= "Ingrese una opción \n"
                                    +  "1. Banano  $1,000 \n"
                                    + " 2. Manzana  $1,500\n"
                                    + " 3. Pera  $900\n"
                                    + " 4. Papaya  $2,000\n";
                                String productoFrutas = JOptionPane.showInputDialog(null, mensajeFrutas);                      
                                switch(productoFrutas){
                                    case "Banano":
                                        System.out.println("Entre a banano");
                                        break; 
                                    case "Manzana":
                                        System.out.println("Entre a Manzana");
                                        break;
                                    case "Pera":
                                        System.out.println("Entre a Pera");
                                        break;
                                    case "Papaya":
                                        System.out.println("Entre a Crema de Papaya");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "No se encontro el producto", "Pepitos S.A.S", 1);
                                        break;
                                    }
                                break;
                                
                            case "Verduras":
                                System.out.println("Entre a verduras");
                                String mensajeVerduras= "Ingrese una opción \n"
                                    +  "1. Lechuga  $2,000 \n"
                                    + " 2. Tomate  $500\n"
                                    + " 3. Cebolla  $400\n"
                                    + " 4. Arveja  $1,000\n";
                                String productoVerduras = JOptionPane.showInputDialog(null, mensajeVerduras);                      
                                switch(productoVerduras){
                                    case "Lechuga":
                                        System.out.println("Entre a Lechuga");
                                        break; 
                                    case "Tomate":
                                        System.out.println("Entre a Tomate");
                                        break;
                                    case "Cebolla":
                                        System.out.println("Entre a Cebolla");
                                        break;
                                    case "Arveja":
                                        System.out.println("Entre a Crema de Arveja");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "No se encontro el producto", "Pepitos S.A.S", 1);
                                        break;
                                    }
                                break;
                                
                            case "Abarrotes":
                                System.out.println("Entre a abarrotes");
                                String mensajeAbarrotes= "Ingrese una opción \n"
                                    +  "1. Lechuga  $2,000 \n"
                                    + " 2. Tomate  $500\n"
                                    + " 3. Cebolla  $400\n"
                                    + " 4. Arveja  $1,000\n";
                                String productoAbarrotes = JOptionPane.showInputDialog(null, mensajeAbarrotes);                      
                                switch(productoAbarrotes){
                                    case "Lechuga":
                                        System.out.println("Entre a Lechuga");
                                        break; 
                                    case "Tomate":
                                        System.out.println("Entre a Tomate");
                                        break;
                                    case "Cebolla":
                                        System.out.println("Entre a Cebolla");
                                        break;
                                    case "Arveja":
                                        System.out.println("Entre a Crema de Arveja");
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "No se encontro el producto", "Pepitos S.A.S", 1);
                                        break;
                                }
                                break; 
                            default:
                                System.out.println("Entre a default");
                                break;
                        }
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
                        clientes.registrarCliente(nombres, apellidos, direccion, telefono, correo, identificacion, fechaDeNacimiento);
                        break;
                    case 3:
                        //Se invoca el metodo para llamar a los clientes que se encuentran registrados
                        clientes.obtenerTodosLosClientes();
                        break;
                    case 4:
                        //Permite invocar el metodo que cierra la sesión
                        user1.cerrarSesion();
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
