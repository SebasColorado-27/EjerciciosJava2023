import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO DE 6 DIGITOS");
        int numero=entrada.nextInt();

            int dig_1=(numero/100000)%10;
            int dig_2=(numero/10000)%10;
            int dig_3=(numero/1000)%10;
            int dig_4=(numero/100)%10;
            int dig_5=(numero/10)%10;
            int dig_6=(numero%10);

        for (int i=1; i<=1; i++){
            System.out.println("--------------------------------------------");
            System.out.println("EL NUMERO INGRESADO FUE: " + numero);
            System.out.println("--------------------------------------------");
            System.out.println("EL DIGITO 01 ES: " + dig_1);
            System.out.println("EL DIGITO 02 ES: " + dig_2);
            System.out.println("EL DIGITO 03 ES: " + dig_3);
            System.out.println("EL DIGITO 04 ES: " + dig_4);
            System.out.println("EL DIGITO 05 ES: " + dig_5);
            System.out.println("EL DIGITO 06 ES: " + dig_6);
            System.out.println("--------------------------------------------");
        }
    }
}