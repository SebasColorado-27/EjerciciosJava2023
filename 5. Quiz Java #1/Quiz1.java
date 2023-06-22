import java.util.Scanner;

public class Quiz1{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);

        int resultado1X = 0;
        int resultado1Y = 0;
        int resultado2X = 0;
        int resultado2Y = 0;

        System.out.println("-----INGRESANDO LA COORDENADAS DEL PUNTO A-----");
        System.out.println("INGRESE EL VALOR DE X:");
        int valorX_a = entrada.nextInt();
        System.out.println("INGRESE EL VALOR DE Y:");
        int valorY_a = entrada.nextInt();

        System.out.println(" ");

        System.out.println("-----INGRESANDO LA COORDENADAS DEL PUNTO B-----");
        System.out.println("INGRESE EL VALOR DE X:");
        int valorX_b = entrada.nextInt();
        System.out.println("INGRESE EL VALOR DE Y:");
        int valorY_b = entrada.nextInt();

        //CALCULO//

        resultado1Y=valorY_b-valorY_a;
        resultado1X=valorX_b-valorX_a;
        int pendiente1 = resultado1Y/resultado1X;

        System.out.println("EL VALOR DE LA PENDIENTE ES: "+pendiente1);
        if (pendiente1>0){
            System.out.println("LA RECTA TIENE PENDIENTE POSITIVA");
        } else if (pendiente1<0){
            System.out.println("LA RECTA TIENE PENDIENTE NEGATIVA");
        }
    }
}