import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Senor usuario, ingrese su nombre: ");
        String cadena = entrada.nextLine();

        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--){
            cadenaInvertida = cadenaInvertida + cadena.charAt(i);
        }
        System.out.println(cadenaInvertida);
    }
}