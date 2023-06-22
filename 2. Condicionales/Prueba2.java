import java.util.Scanner;

public class Prueba2 {
    public static void main(String [] args){

        //Creacion de variable de entrada
        Scanner entrada = new Scanner(System.in);

        //creacion de variables
        int cant_poblacion_col = 0;
        int cant_poblacion_usa = 350000000;

        //instruccion salida
        System.out.println("la poblacion de COL es: " + cant_poblacion_col);
        System.out.println("La poblacion de USA es: " + cant_poblacion_usa);

        //lectura de datos
        System.out.println("ingrese la poblacion de colombia: ");
        cant_poblacion_col = entrada.nextInt();

        System.out.println("la nueva poblacion de colombia es: " + cant_poblacion_col);
    }
}    