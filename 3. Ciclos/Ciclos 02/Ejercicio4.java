import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        int numero;
        int aux;
        int inverso = 0;
        int cifra;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO DE 6 DIGITOS PARA DETERMINAR SI ES PALINDROMO");                                                 
        numero = entrada.nextInt();
    
        aux = numero;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
        if(numero == inverso){
            System.out.println("EL NUMERO ES PALINDROMO");
        }else{
            System.out.println("EL NUMERO NO ES PALINDROMO");
        }
    }
}