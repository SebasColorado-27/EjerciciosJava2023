import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO PARA DEFINIR LAS FILAS");
        int n = entrada.nextInt();

        System.out.println("INGRESE UN NUMERO ENTERO PARA DEFINIR LAS COLUMNAS");
        int m = entrada.nextInt();

        int [][] matriz1 = new int [n][m];

        System.out.println(" ");
        for (int i=0; i<n; i++){
            for (int k=0; k<m; k++){
                System.out.println("INGRESE EL NUMERO PARA LA FILA "+i+" EN LA COLUMNA "+k);
                matriz1[i][k]=entrada.nextInt();
            }
        }

        for (int i=0; i<matriz1.length; i++){
            for (int k=0; k<matriz1.length; k++){
                System.out.print("["+matriz1[i][k]+"]");
            }
            System.out.println(" ");
        }
    }
}