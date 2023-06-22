import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE LA LONGITUD DEL ARREGLO");
        int n = entrada.nextInt();

        System.out.println("INGRESE LOS NUMEROS DEL ARREGLO");

        int [] arreglo_1 = new int [n];

        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=entrada.nextInt();
        }

        System.out.println("ESTOS SON LOS NUMEROS DEL ARREGLO");

        for (int i=0; i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
        System.out.println(" ");
        System.out.println("ARREGLO EN FORMA DESCENDENTE");
        int j=n-1;
        while (j>=0){
            System.out.println("["+arreglo_1[j]+"]");
            j--;
        }
    }
}