import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Senor usuario, ingrese una oracion: ");
        String cadena = entrada.nextLine();
        int longitud = cadena.length();
        String vocales = "aeiou";
        String vocalesUP = "AEIOU";
        int cont = 0;

        for (int i=0; i<longitud; i++){
            if (cadena.charAt(i)==vocales.charAt(0) || cadena.charAt(i)==vocales.charAt(1) || cadena.charAt(i)==vocales.charAt(2) || cadena.charAt(i)==vocales.charAt(3) || cadena.charAt(i)==vocales.charAt(4)){
                cont=cont+1;
            }
        }
        for (int i=0; i<longitud; i++){
            if (cadena.charAt(i)==vocalesUP.charAt(0) || cadena.charAt(i)==vocalesUP.charAt(1) || cadena.charAt(i)==vocalesUP.charAt(2) || cadena.charAt(i)==vocalesUP.charAt(3) || cadena.charAt(i)==vocalesUP.charAt(4)){
                cont=cont+1;
            }
        }
        System.out.println("HAY UN TOTAL DE: "+cont+" VOCALES.");
    }
}