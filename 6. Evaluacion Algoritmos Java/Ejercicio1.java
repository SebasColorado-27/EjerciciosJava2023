import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("SENOR USUARIO, INGRESE UN NUMERO N PARA DETERMINAR LAS FILAS");
        int n = entrada.nextInt();

        System.out.println("SENOR USUARIO, INGRESE UN NUMERO M PARA DETERMINAR LAS COLUMNAS");
        int m = entrada.nextInt();

        int matriz[][] = new int[n][m];
        int sumatoria = 1;
        
        //matriz1[i][k]=entrada.nextInt();

        for(int i=0; i<matriz.length; i++){
            for(int k=0; k<m; k++){
                System.out.print("["+matriz[i][k]+1"]");
            }
            System.out.println(" ");
        }
    }
}