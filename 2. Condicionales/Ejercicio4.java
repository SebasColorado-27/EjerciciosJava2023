import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String [] args){
    
        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE DOS NUMEROS ");

        int n1, n2;

        System.out.println("PRIMER NUMERO");
        n1 = entrada.nextInt();
        System.out.println("SEGUNDO NUMERO");
        n2 = entrada.nextInt();

        if (n1==n2) {
            System.out.println("LOS DOS NUMEROS SON IGUALES");
        } else if (n1>n2) {
            System.out.println("EL NUMERO MAYOR ES " + n1);
        } else if (n2>n1) {
            System.out.println("EL NUMERO MAYOR ES " + n2);
        }
    }
}