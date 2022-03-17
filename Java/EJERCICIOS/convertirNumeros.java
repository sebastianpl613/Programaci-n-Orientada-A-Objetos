package politecnico;
import java.util.Scanner;

public class convertirNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero, unidades, decenas, centenas, residuo1;
        String textoUnidades, textoDecenas, textoCentenas, textoNumeroUnico;
        System.out.print("Este es un ejemplo: ");
        numero = sc.nextInt();
        
        centenas = numero/100;
        residuo1 = numero - (centenas*100);
        decenas = residuo1/10;
        unidades = residuo1-(decenas*10);
                
        System.out.println("centenas: "+centenas);
        System.out.println("decenas: "+decenas);
        System.out.println("unidades: "+unidades);
        
        switch(numero){
            case 0:
                textoNumeroUnico = "cero";
                break;
            case 11:
                textoNumeroUnico = "Once";
                break;
            case 12:
                textoNumeroUnico = "Doce";
                break;
            case 13:
                textoNumeroUnico = "Trece";
                break;
            case 14:
                textoNumeroUnico = "Catorce";
                break;
            case 15:
                textoNumeroUnico = "quince";
                break;
            case 16:
                textoNumeroUnico = "dieciséis";
                break;
            case 17:
                textoNumeroUnico = "diecisiete";
                break;
            case 18:
                textoNumeroUnico = "dieciocho";
                break;
            case 19:
                textoNumeroUnico = "diecinueve";
                break;
            case 20:
                textoNumeroUnico = "veinte";
                break;
            case 100:
                textoNumeroUnico = "cien";
                break;
            default:
                textoNumeroUnico = "";
                
        }
        
        switch(unidades){
            case 1:
                textoUnidades = "uno";
                break;
            case 2:
                textoUnidades = "dos";
                break;
            case 3:
                textoUnidades = "tres";
                break;
            case 4:
                textoUnidades = "cuatro";
                break;
            case 5:
                textoUnidades = "cinco";
                break;
            case 6:
                textoUnidades = "seis";
                break;
            case 7:
                textoUnidades = "siete";
                break;
            case 8:
                textoUnidades = "ocho";
                break;
            case 9:
                textoUnidades = "nueve";
                break;
            default:
                textoUnidades = "";
                break;
        }
        
        switch(decenas){
            case 1:
                textoDecenas = "diez";
                break;
            case 2:
                textoDecenas = "veinti";
                break;
            case 3:
                textoDecenas = "treinta";
                break;
            case 4:
                textoDecenas = "cuarenta";
                break;
            case 5:
                textoDecenas = "cincuenta";
                break;
            case 6:
                textoDecenas = "sesenta";
                break;
            case 7:
                textoDecenas = "setenta";
                break;
            case 8:
                textoDecenas = "ochenta";
                break;
            case 9:
                textoDecenas = "noventa";
                break;
            default:
                textoDecenas = "";
                break;
        }
        
        switch(centenas){
            case 1:
                textoCentenas = "ciento ";
                break;
            case 2:
                textoCentenas = "docientos ";
                break;
            case 3:
                textoCentenas = "trecientos ";
                break;
            case 4:
                textoCentenas = "cuatrocientos ";
                break;
            case 5:
                textoCentenas = "quinientos ";
                break;
            case 6:
                textoCentenas = "seicientos ";
                break;
            case 7:
                textoCentenas = "setecientos ";
                break;
            case 8:
                textoCentenas = "ochosientos ";
                break;
            case 9:
                textoCentenas = "novecientos ";
                break;
            default:
                textoCentenas = "";
                break;
        }
        
        if(textoNumeroUnico != ""){
            System.out.println(textoNumeroUnico);
        }else{
            if(decenas == 2){
                System.out.println(textoCentenas+textoDecenas+textoUnidades);
            }else if(textoDecenas != "" && textoUnidades != ""){
                System.out.println(textoCentenas+textoDecenas+" y "+textoUnidades);
            }else{
                System.out.println(textoCentenas+textoDecenas+textoUnidades);
            }
        }
        
        
    }
}
