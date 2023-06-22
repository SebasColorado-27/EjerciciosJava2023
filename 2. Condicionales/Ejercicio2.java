import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String [] args){

        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print(" SEÑOR USUARIO, DIGITE UN NUMERO DE 3 DIGITOS ");
        int numero = entrada.nextInt();

        //SALIDA
        if (numero%2==0)
        System.out.println("El numero es par");
        else
        System.out.println("El numero es impar");
    }
}