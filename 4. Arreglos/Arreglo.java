import java.util.Scanner;

public class Arreglo {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        //Crear arreglo vacio
        int [] arreglo_1 = new int [10];

        //llenar arreglo con numeros pares
        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=(i+1)*2;
        }

        for (int i=0; i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}