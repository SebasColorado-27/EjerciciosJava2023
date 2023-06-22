import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO A SENALAR EN LA SUCESION DE FIBONACCI");
        int numero = entrada.nextInt();

        int variable = 0;
        int numero1 = 1;
        int numero2;
        int sumatoria = 0;

        for (int i=1; i<=numero; i++){
            numero2 = variable;
            variable = numero1 + variable;
            numero1 = numero2;
            sumatoria = numero1;
        }
        System.out.println("EL N-ESIMO NUMERO DE FIBONACCI ES: " + sumatoria);
    }
}