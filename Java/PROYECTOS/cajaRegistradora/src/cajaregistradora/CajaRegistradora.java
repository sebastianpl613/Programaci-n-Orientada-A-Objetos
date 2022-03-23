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
        String mensajeProductos="";
        int valorTotal=0;
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
                        boolean siSalirCategoria=false; 
                        while(!siSalirCategoria){
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
                                            int cantidadLeche = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalLeche=cantidadLeche*2500;
                                            valorTotal+=totalLeche;
                                            mensajeProductos+=cantidadLeche+"  Leche  "+totalLeche+" \n";
                                            break; 
                                        case "Queso":
                                            System.out.println("Entre a queso");
                                            int cantidadQueso = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalQueso=cantidadQueso*4000;
                                            valorTotal+=totalQueso;
                                            mensajeProductos+=cantidadQueso+"  Queso  "+totalQueso+" \n";
                                            break;
                                        case "Kumis":
                                            System.out.println("Entre a Kumis");
                                            int cantidadKumis = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalKumis=cantidadKumis*2000;
                                            valorTotal+=totalKumis;
                                            mensajeProductos+=cantidadKumis+"  Kumis  "+totalKumis+" \n";
                                            break;
                                        case "Crema de Leche":
                                            System.out.println("Entre a Crema de Leche");
                                            int cantidadCrema = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalCrema=cantidadCrema*3600;
                                            valorTotal+=totalCrema;
                                            mensajeProductos+=cantidadCrema+"  Crema de Leche  "+totalCrema+" \n";
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
                                            int cantidadBanano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalBanano=cantidadBanano*1000;
                                            valorTotal+=totalBanano;
                                            mensajeProductos+=cantidadBanano+"  Banano  "+totalBanano+" \n";
                                            break; 
                                        case "Manzana":
                                            System.out.println("Entre a Manzana");
                                            int cantidadManzana = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalManzana=cantidadManzana*1500;
                                            valorTotal+=totalManzana;
                                            mensajeProductos+=cantidadManzana+"  Manzana  "+totalManzana+" \n";
                                            break;
                                        case "Pera":
                                            System.out.println("Entre a Pera");
                                            int cantidadPera = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalPera=cantidadPera*900;
                                            valorTotal+=totalPera;
                                            mensajeProductos+=cantidadPera+"  Pera  "+totalPera+" \n";
                                            break;
                                        case "Papaya":
                                            System.out.println("Entre a Crema de Papaya");
                                            int cantidadPapaya = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalPapaya=cantidadPapaya*2000;
                                            valorTotal+=totalPapaya;
                                            mensajeProductos+=cantidadPapaya+"  Papaya  "+totalPapaya+" \n";
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
                                            int cantidadLechuga = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalLechuga=cantidadLechuga*2000;
                                            valorTotal+=totalLechuga;
                                            mensajeProductos+=cantidadLechuga+"  Lechuga  "+totalLechuga+" \n";
                                            break; 
                                        case "Tomate":
                                            System.out.println("Entre a Tomate");
                                            int cantidadTomate = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalTomate=cantidadTomate*500;
                                            valorTotal+=totalTomate;
                                            mensajeProductos+=cantidadTomate+"  Tomate  "+totalTomate+" \n";
                                            break;
                                        case "Cebolla":
                                            System.out.println("Entre a Cebolla");
                                            int cantidadCebolla = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalCebolla=cantidadCebolla*400;
                                            valorTotal+=totalCebolla;
                                            mensajeProductos+=cantidadCebolla+"  Cebolla  "+totalCebolla+" \n";
                                            break;
                                        case "Arveja":
                                            System.out.println("Entre a Arveja");
                                            int cantidadArveja = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalArveja=cantidadArveja*1000;
                                            valorTotal+=totalArveja;
                                            mensajeProductos+=cantidadArveja+"  Arveja  "+totalArveja+" \n";
                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "No se encontro el producto", "Pepitos S.A.S", 1);
                                            break;
                                        }
                                    break;

                                case "Abarrotes":
                                    System.out.println("Entre a abarrotes");
                                    String mensajeAbarrotes= "Ingrese una opción \n"
                                        +  "1. Arroz  $2,000 \n"
                                        + " 2. Lentejas  $1500\n"
                                        + " 3. Frijol  $2400\n"
                                        + " 4. Aceite  $10,000\n";
                                    String productoAbarrotes = JOptionPane.showInputDialog(null, mensajeAbarrotes);                      
                                    switch(productoAbarrotes){
                                        case "Arroz":
                                            System.out.println("Entre a Arroz");
                                            int cantidadArroz = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalArroz=cantidadArroz*2000;
                                            valorTotal+=totalArroz;
                                            mensajeProductos+=cantidadArroz+"  Arroz  "+totalArroz+" \n";
                                            break; 
                                        case "Lenteja":
                                            System.out.println("Entre a Lenteja");
                                            int cantidadLenteja = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalLenteja=cantidadLenteja*1500;
                                            valorTotal+=totalLenteja;
                                            mensajeProductos+=cantidadLenteja+"  Lenteja  "+totalLenteja+" \n";
                                            break;
                                        case "Frijol":
                                            System.out.println("Entre a Frijol");
                                            int cantidadFrijol = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalFrijol=cantidadFrijol*2400;
                                            valorTotal+=totalFrijol;
                                            mensajeProductos+=cantidadFrijol+"  Frijol  "+totalFrijol+" \n";
                                            break;
                                        case "Aceite":
                                            System.out.println("Entre a Aceite");
                                            int cantidadAceite = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite La Cantidad"));
                                            int totalAceite=cantidadAceite*10000;
                                            valorTotal+=totalAceite;
                                            mensajeProductos+=cantidadAceite+"  Aceite  "+totalAceite+" \n";
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
                            int opcionSalirCategoria = JOptionPane.showConfirmDialog(null, "¿Desea Seguir Comprando?", "Pepitos S.A.S",JOptionPane.YES_NO_OPTION);
                            if(opcionSalirCategoria == 0){
                                siSalirCategoria=false;
                            }else{
                                siSalirCategoria=true;
                            }
                        }
                        String mensajeNuevaVenta=" Pepito S.A.S \n\n"
                                +"Datos Cliente \n"
                                +clientes.obtenerCliente(0)+"\n"
                                +"Productos \n"
                                +mensajeProductos+"\n"
                                +"  Total  "+valorTotal;
                        JOptionPane.showMessageDialog(null, mensajeNuevaVenta, "Pepitos S.A.S", 1);
                        String mensajeMetodoDePago= "Ingrese una opción \n"
                                        +  "1. Efectivo \n"
                                        + " 2. Tarjeta de Credito \n";                  
                        int metodoDePago= Integer.parseInt(JOptionPane.showInputDialog(null, mensajeMetodoDePago, "Pepitos S.A.S", 3));
                        switch (metodoDePago) {
                            case 1:
                                int efectivo= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el efectivo recibido: ", "Pepitos S.A.S", 3));
                                int vueltas= valorTotal-efectivo;
                                JOptionPane.showMessageDialog(null,"total vueltas: "+vueltas);
                               
                                break;
                            case 2:
                                int tarjetaDeCredito= Integer.parseInt(JOptionPane.showInputDialog(null, "número de la tarjeta: ", "Pepitos S.A.S", 3));
                                int fechaDeVencimiento= Integer.parseInt(JOptionPane.showInputDialog(null, "fecha de vencimiento: ", "Pepitos S.A.S", 3));
                                int codigo= Integer.parseInt(JOptionPane.showInputDialog(null, "codigo: ", "Pepitos S.A.S", 3));
                                JOptionPane.showMessageDialog(null,"Pago procesado...");
                                break;
                            default:
                                throw new AssertionError();
                        }
                         valorTotal=0;
                         mensajeProductos=" ";
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
                        JOptionPane.showMessageDialog(null, "Gracias por comprar con nosotros", "Pepitos S.A.S", 1);
                        break;
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "Su usuario no esta habilitado", "Pepitos S.A.S", 0);
        }
    }
    
}
