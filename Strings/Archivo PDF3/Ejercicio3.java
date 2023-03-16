import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor usuario, ingrese el tamaño del arreglo");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];

        for(int i=0; i<arreglo.length; i++){
            arreglo[i]=(int)(Math.random()*100);

            System.out.println("["+arreglo[i]+"]");
        }
    }
}