import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){

        Scanner entrada=new Scanner (System.in);

        for(int i=1;i<=5;i++){
            System.out.print("SENOR USUARIO, INGRESE LA CANTIDAD FINANCIADA");
            int cantidad=entrada.nextInt();

            System.out.print("INGRESE EL VALOR DE LAS CUOTAS");
            int valor=entrada.nextInt();

            System.out.print("INGRESE LA CANTIDAD DE CUOTAS PAGAS");
            int pagadas=entrada.nextInt();

            float interes=(cantidad*valor)/pagadas;
            System.out.println("EL INTERES PAGO ES:"+interes+"%");
        }
    }
}