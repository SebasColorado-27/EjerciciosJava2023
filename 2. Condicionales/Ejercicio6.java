import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String [] args){

        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO DE 6 DIGITOS");
        int numero=entrada.nextInt();

        System.out.println("EL CODIGO ES " + numero);

        System.out.println("SENOR USUARIO,INGRESE EL LA OPCION QUE SEA EL DIGITO A MOSTRAR");
        System.out.println("//-----------------------------------------------//");
        System.out.println("MENU");
        System.out.println("1. Primer Digito  2. Segundo Digito  3. Tercer Digito");
        System.out.println("4. Cuarto Digito  5. Quinto Digito  6. Sexto Digito");
        System.out.println("//-----------------------------------------------//");

        Scanner entrada2 = new Scanner(System.in);
        int seleccion = entrada2.nextInt();

        if (seleccion==1){
            int dig_1=(numero%10);
            System.out.println("EL PRIMER DIGITO ES " + dig_1 );
        }

        if (seleccion==2){
            int dig_2=(numero/10)%10;
            System.out.println("EL SEGUNDO DIGITO ES " + dig_2 );
        }

        if (seleccion==3){
            int dig_3=(numero/100)%10;
            System.out.println("EL TERCER DIGITO ES " + dig_3 );
        }

        if (seleccion==4){
            int dig_4=(numero/1000)%10;
            System.out.println("EL CUARTO DIGITO ES " + dig_4 );
        }

        if (seleccion==5){
            int dig_5=(numero/10000)%10;
            System.out.println("EL QUINTO DIGITO ES " + dig_5 );
        }

        if (seleccion==6){
            int dig_6=(numero/100000)%10;
            System.out.println("EL SEXTO DIGITO ES " + dig_6 );
        }
        
    }
}