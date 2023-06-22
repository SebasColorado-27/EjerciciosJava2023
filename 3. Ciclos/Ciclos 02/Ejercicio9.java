import java.util.Scanner;

public class Ejercicio9 {
    public static void main (String[]args){

        Scanner entrada = new Scanner (System.in);
        System.out.println(" ");
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTERO (9 DIGITOS)");
        int numero = entrada.nextInt();
        
        int dig_10=(numero/100000000)%10;
        int dig_9=(numero/100000000)%10;
        int dig_8=(numero/10000000)%10;
        int dig_7=(numero/1000000)%10;
        int dig_6=(numero/100000)%10;
        int dig_5=(numero/10000)%10;
        int dig_4=(numero/1000)%10;
        int dig_3=(numero/100)%10;
        int dig_2=(numero/10)%10;
        int dig_1=(numero%10);

        int primeraraiz = dig_9+dig_8+dig_7+dig_6+dig_5+dig_4+dig_3+dig_2+dig_1;
        int raizDig1=(primeraraiz%10);
        int raizDig2=(primeraraiz/10)%10;
        int segundaraiz = raizDig2+raizDig1;
        

        System.out.println("RAIZ DIGITAL: ");
        System.out.println(+dig_9+" + "+dig_8+" + "+dig_7+" + "+dig_6+" + "+dig_5+" + "+dig_4+" + "+dig_3+" + "+dig_2+" + "+dig_1+" = "+primeraraiz);
        System.out.println(+raizDig2+" + "+raizDig1+" = "+segundaraiz);
        System.out.println("LA RAIZ DIGITAL DE "+numero+" ES: "+segundaraiz);
    }
}
