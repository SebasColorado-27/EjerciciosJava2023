import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO PARA DEFINIR LAS FILAS");
        int n = entrada.nextInt();

        System.out.println("INGRESE UN NUMERO ENTERO PARA DEFINIR LAS COLUMNAS");
        int m = entrada.nextInt();

        int matriz[][] = new int[n][m];
        int arreglo[][] = new int[n][n];

        for (int i=0; i < matriz.length; i++) {
            for (int k=0; k<matriz[i].length; k++) {
                matriz[i][k] = (int) (Math.random()*9+1);
            }
        }
        System.out.println(" ");
        System.out.println("IMPRIMIR ARREGLO");
        for (int i=0; i<matriz.length; i++){
            for (int k=0; k<matriz[i].length; k++){
                System.out.print("["+matriz[i][k]+"]");
            }
            System.out.println(" ");
        }

        for (int i=0; i<matriz.length; i++){
            for (int k=0; k<matriz[i].length; k++){
                arreglo[n/2][k]=matriz[i][k];
            }
        }

        System.out.println(" ");
        System.out.println("PRIMER MITAD DE LA MATRIZ");
        for (int i=0; i<matriz.length; i++){
            for (int k=0; k<matriz[i].length; k++){
                System.out.print("["+arreglo[n/2][k]+"]");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
        System.out.println("SEGUNDA MITAD DE LA MATRIZ");
        for (int i=0; i<matriz.length; i++){
            for (int k=0; k<matriz[i].length; k++){
                System.out.print("["+arreglo[n/2][k]+"]");
            }
            System.out.println(" ");
        }
    }
}