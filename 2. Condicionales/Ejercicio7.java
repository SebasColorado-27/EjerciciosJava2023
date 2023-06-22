import java.util.Scanner;
import java.text.NumberFormat;

public class Ejercicio7 {
    public static void main(String [] args){

        //ENTRADA
        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO DE 10 DIGITOS");
        int numero=entrada.nextInt();

        System.out.println("//---------------FORMATO DE MONEDA--------------//");
        int dig_1=(numero%10);
        int dig_2=(numero/10)%10;
        int dig_3=(numero/100)%10;
        int dig_4=(numero/1000)%10;
        int dig_5=(numero/10000)%10;
        int dig_6=(numero/100000)%10;
        int dig_7=(numero/1000000)%10;
        int dig_8=(numero/10000000)%10;
        int dig_9=(numero/100000000)%10;
        int dig_10=(numero/1000000000)%10;

        if (numero>1 && numero<9999){
            System.out.println("Moneda:"+dig_4+"."+dig_3+dig_2+dig_1);
        }

        if (numero>9999 && numero<99999){
            System.out.println("Moneda:"+dig_5+dig_4+"."+dig_3+dig_2+dig_1);
        }

        if (numero>99999 && numero<999999){
            System.out.println("Moneda:"+dig_6+dig_5+dig_4+"."+dig_3+dig_2+dig_1);
        }

        if (numero>999999 && numero<9999999){
            System.out.println("Moneda:"+dig_7+"."+dig_6+dig_5+dig_4+"."+dig_3+dig_2+dig_1);
        }

        if (numero>9999999 && numero<999999999){
            System.out.println("Moneda:"+dig_9+dig_8+dig_7+"."+dig_6+dig_5+dig_4+"."+dig_3+dig_2+dig_1);
        }

        if (numero>99999999 && numero<9999999999){
            System.out.println("Moneda:"+ dig_10+"."+dig_9+dig_8+dig_7+"."+dig_6+dig_5+dig_4+"."+dig_3+dig_2+dig_1);
        }
    }
}