import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){
        
        int i=0, cont =0;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor usuario, ingrese el tamaño del arreglo");
        int n = entrada.nextInt();

        int[] arreglo = new int[n];

        do{
            cont++;
            if (cont%2 !=0){
                arreglo[i] = cont;
                System.out.print("["+arreglo[i]+"]");
                i++;
            }
        } while (i !=n);
    }
}