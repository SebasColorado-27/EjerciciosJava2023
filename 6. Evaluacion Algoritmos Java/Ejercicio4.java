import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args){
        int auxiliar, numeroprueba;
        int numeroinvertido= 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO PARA DETERMINAR SI ES PALINDROMO (max 6 digitos");                                                 
        int numero = entrada.nextInt();
        auxiliar = numero;

        while (auxiliar!=0){
            numeroprueba = auxiliar % 10;
            numeroinvertido = numeroinvertido * 10 + numeroprueba;
            auxiliar = auxiliar / 10;
        }
        
        if(numero == numeroinvertido){
            System.out.println("EL NUMERO SI ES PALINDROMO");
        }else{
            System.out.println("EL NUMERO NO ES PALINDROMO");
        }
    }
}