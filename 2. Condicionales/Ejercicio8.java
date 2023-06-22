import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String [] args){
        //CREANDO VARIABLE DE ENTRADA
        Scanner entrada = new Scanner(System.in);

        //SOLICITAR INGRESAR UN NUMERO
        System.out.println("INGRESE EL NUMERO:");
        int numero = entrada.nextInt();

        int dig_1=(numero%10);
        int dig_2=(numero/10)%10;
        int dig_3=(numero/100)%10;
        int dig_4=(numero/1000)%10;
        int dig_5=(numero/10000)%10;
        int dig_6=(numero/100000);

        //ALGORITMO PARA IMPRIMIR CON TEXTO

        if (dig_6==9) {
            System.out.println("NOVECIENTOS");
        } else if (dig_6==8) {
            System.out.print("OCHOCIENTOS");
        } else if (dig_6==7) {
            System.out.print("SETECIENTOS");
        } else if (dig_6==6) {
            System.out.print("SEISCIENTOS");
        } else if (dig_6==5) {
            System.out.print("QUINIENTOS");
        } else if (dig_6==4) {
            System.out.print("CUATRTOCIENTOS");
        } else if (dig_6==3) {
            System.out.print("TRESCIENTOS");
        } else if (dig_6==2) {
            System.out.print("DOSCIENTOS");
        } else if (dig_6==1) {
            
        }
    }
}