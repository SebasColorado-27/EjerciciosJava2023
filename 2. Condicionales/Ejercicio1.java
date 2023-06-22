import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String [] args){

        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.print("SENOR USUARIO, INGRESE SU EDAD");
        int edad = entrada.nextInt();

        //CONDICION
        if (edad < 18) {
        System.out.println("USTED ES MENOR DE EDAD, RECIBE UN AUXILIO DE 800.000");
        }

        if (edad > 18 && edad <= 120) {
        System.out.println("USTED ES MAYOR DE EDAD, PAGA UN IMPUESTO DE 200.000");
        }

        if (edad < 0) {
        System.out.println("ERROR - NUMERO INVALIDO");
        }

        if (edad > 120) {
        System.out.println("ERROR - NUMERO INVALIDO");
        }
    }
}