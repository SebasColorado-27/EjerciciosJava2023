import java.util.Scanner;

public class Ejercicio13{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE EL TAMANO DEL ARREGLO");
        int n = entrada.nextInt();
        int [] arreglo = new int [n];

        System.out.println("Ingrese los datos del arreglo.");
        for(int i=0; i<arreglo.length;i++){
            arreglo[i]=entrada.nextInt();
        }
        System.out.println(" ");
        for(int i=0; i<arreglo.length;i++){
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println(" ");
        System.out.print("Ingrese La posicion: ");
        int posicion = entrada.nextInt();

        int tamano = arreglo.length;
        int valor = tamano-posicion;
        
        System.out.println("El valor es: "+valor);
        
        int valornegativo = tamano+posicion;
        System.out.println("El valor es: "+valornegativo);

        for (int i=0; i<arreglo.length; i++){
            for (int k=0; k<1; k++){
            System.out.println(" ");
            }
            System.out.print("["+arreglo[i]+"]");
        }
    }
}