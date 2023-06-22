import java.util.Scanner;

public class Ejercicio12{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE EL TAMAÑO PARA LOS DOS ARREGLOS");
        int tamano = entrada.nextInt();
        int nuevolimite = tamano+tamano;

        int [] arreglo_1 = new int [tamano];
        int [] arreglo_2 = new int [tamano];
        int [] arreglo_3 = new int [nuevolimite];

        System.out.println("Ingrese los numeros del arreglo 1:");
        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=entrada.nextInt();
        }
        System.out.println("Ingrese los numeros del arreglo 2:");
        for (int j=0; j<arreglo_2.length; j++){
            arreglo_2[j]=entrada.nextInt();
        }

        System.out.println("-------------------------------");
        System.out.print("Arreglo 1: ");
        for(int i=0; i<arreglo_1.length; i++){
            System.out.print("{"+arreglo_1[i]+"}");
        }
        System.out.println("-------------------------------");
        System.out.print("Arreglo 2: ");
        for(int i=0; i<arreglo_2.length; i++){
            System.out.print("{"+arreglo_2[i]+"}");
        }

        
        for(int i=0; i<tamano; i++){
            arreglo_3[(i*2)]=arreglo_1[i];
            arreglo_3[(i*2+1)]=arreglo_2[i];
            
        }
        System.out.println("-------------------------------");
        System.out.print("Arreglo 3: ");
        for(int i=0; i<arreglo_3.length; i++){
            System.out.print("{"+arreglo_3[i]+"}");
        }
    }
}
