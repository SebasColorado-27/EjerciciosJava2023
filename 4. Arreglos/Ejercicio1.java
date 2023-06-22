import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL NUMERO FINAL DEL VECTOR");
        int limite = entrada.nextInt();

        int [] arreglo_1 = new int [limite];

        
        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=(i+1)*2-1;
        }

        for (int i=0; i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}