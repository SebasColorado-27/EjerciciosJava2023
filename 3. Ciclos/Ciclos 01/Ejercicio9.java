import java.util.Scanner;

public class Ejercicio9{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        int contador;
        int I;
        int numero;
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO PARA DETERMINAR SI ES PRIMO O NO.");
        numero = entrada.nextInt();
 
        contador = 0;
 
        for(I = 1; I <= numero; I++){
            if((numero % I) == 0){
                contador++;
            }
        }
 
        if(contador <= 2){
            System.out.println("EL NUMERO ES PRIMO");
        }else{
            System.out.println("EL NUMERO NO ES PRIMO");
        }
    }
}