import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL TAMANO DEL VECTOR PARA IMPRIMIR NUMEROS PRIMOS");
        int limite = entrada.nextInt();

        int contador = 0;

        int [] arreglo_1 = new int [limite];

        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i] = (int)(Math.random()*999);
            if (arreglo_1[i] % (i+1)==0){
                contador=contador+1;
            }
        }

        for (int i=0; i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}
