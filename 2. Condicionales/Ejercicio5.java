import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String [] args){
    
        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE TRES NUMEROS ");

        int n1, n2, n3;

        System.out.println("PRIMER NUMERO");
        n1 = entrada.nextInt();
        System.out.println("SEGUNDO NUMERO");
        n2 = entrada.nextInt();
        System.out.println("TERCER NUMERO");
        n3 = entrada.nextInt();

        if (n1==n2 && n1==n3) {
            System.out.println("LOS NUMERO SON IGUALES");
        } else if (n1<n2 && n1<n3){
            System.out.println("LOS NUMEROS ESTAN EN ORDEN ASCENDENTE");
        } else if (n1>n3 && n2>n3){
            System.out.println("LOS NUMEROS ESTAN DESCENDENTE");
        }
    }
}