import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO LIMITE PARA MOSTRAR LA SECUENCIA DE FIBBONACCI");
        int num = entrada.nextInt();
        int serie = num, num1 = 0, num2 = 1, suma = 1;
        System.out.println(num1);
       
        for (int i = 1; i < num; i++) {
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }
    }
}