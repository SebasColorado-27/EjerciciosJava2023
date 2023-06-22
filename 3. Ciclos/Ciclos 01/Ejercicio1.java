import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        //VARIABLE DE ENTRADA
        Scanner entrada = new Scanner(System.in);

        //PEDIR AL DATOS USUARIO
        System.out.println("SENOR USUARIO, INGRESE LAS CANTIDAD DE NOTAS");
        int cantidad = entrada.nextInt();

        float sumatoria = 0;
        for (int i=1; i<=cantidad; i++){
            System.out.print("INGRESE LA NOTA " +i+": ");
            float nota = entrada.nextFloat();

            sumatoria = sumatoria + nota;
        }
         float promedio = sumatoria / cantidad;
         System.out.println("EL PROMEDIO ES "+ promedio);
    }
}