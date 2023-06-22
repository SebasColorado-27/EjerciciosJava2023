import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTERO");
        int n = entrada.nextInt();

        int [] arreglo_1 = new int [n];

        int ultimo;

        for (int i=0; i<arreglo_1.length; i++){
            arreglo_1[i]=(i+1);
        }

        for (int i=0; i<arreglo_1.length; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
        System.out.println(" ");
        System.out.println("INGRESE EL NUMERO PARA LA POSICION ANTI-HORARIO");
        int antihorario = entrada.nextInt();


        for (int i=0; i>=antihorario; i++){
            arreglo_1[i+antihorario]=arreglo_1[i];
        }

        ultimo = arreglo_1[antihorario-1];

        System.out.println(" ");
        System.out.println("POSICION ANTIHORARIO");
        for (int i=antihorario; i>=0; i--){
            System.out.print("["+arreglo_1[i]+"]");
        }
        for (int i=0; i<ultimo; i++){
            System.out.print("["+arreglo_1[i]+"]");
        }
    }
}