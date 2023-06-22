import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio11{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE EL LIMITE DEL PRIMER ARREGLO");
        int n1 = entrada.nextInt();
        int [] arreglo_1 = new int [n1];
        System.out.println("SENOR USUARIO, INGRESE EL LIMITE DEL SEGUNDO ARREGLO");
        int n2 = entrada.nextInt();
        int [] arreglo_2 = new int [n2];

        System.out.println("Ingrese los numeros del arreglo 1:");
        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=entrada.nextInt();
        }
        System.out.println("Ingrese los numeros del arreglo 2:");
        for (int j=0; j<arreglo_2.length; j++){
            arreglo_2[j]=entrada.nextInt();
        }

        System.out.println(Arrays.equals(arreglo_1, arreglo_2));

        System.out.println();

        Arrays.sort(arreglo_2);

        System.out.println(Arrays.equals(arreglo_1, arreglo_2));
        if (true){
            System.out.println("Los Arreglos son EQUIVALENTES.");
        } else{
            System.out.println("Los Arreglos NO son equivalentes.");
        }
    }
}