import java.util.Scanner;

public class Ejercicio5{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        int numero = entrada.nextInt();

        int factorial = 1;

        for(int i=1; i<=numero; i++){
            factorial=factorial*i;
        }

        System.out.println("FACTORIAL:");
        for(int i=1; i<=numero-1; i++){
            System.out.print(i+"x"); 
        }
        System.out.println(numero+"="+factorial);
    }
}