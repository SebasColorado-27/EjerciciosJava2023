import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[]args){

        //Declaramos Variable de entrada
        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE EL NUMERO DE CEDULAS A REGISTRAR");
        int cantidad = entrada.nextInt();
        
        //Crear Arreglo
        long [] arreglo = new long [cantidad];

        System.out.println("------------------------------");
        System.out.println("     REGISTRO DE CEDULAS      ");
        System.out.println("------------------------------");

        //Definir Ciclo
        for (int i=0; i<cantidad; i++){

            //Solicitar Cedula
            System.out.println(" ");
            System.out.println("INGRESE LA CEDULA NUMERO "+i);
            long cedula = entrada.nextLong();

            //validar cedula
            boolean valido = true;

            for (int j=0; j<arreglo.length; j++){
                if (cedula == arreglo[j]){
                    valido = false;
                }
            }

            if(valido){
                arreglo[i]=cedula;
            }else{
                System.out.println("LA CEDULA INGRESADA YA ESTA REPETIDA!");
                i--;
            }
        }

        //Imprimir arreglo
        for (int i=0; i<arreglo.length; i++){
            for (int k=0; k<1; k++){
            System.out.println(" ");
            }
            System.out.print("["+arreglo[i]+"]");
        }
    }
}