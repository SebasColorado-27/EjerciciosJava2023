import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor usuario, ingrese una Frase");
        String cadena = entrada.nextLine();

        System.out.println ("Número de desplazamientos:");
        int desplazamiento;
        Scanner entradaDesplazamiento1 =new Scanner (System.in);
        desplazamiento=entradaDesplazamiento1.nextInt ();
        int ultimoNumero=cadena.length ();
        String cadena1=cadena.substring (0,desplazamiento);
        String cadena2=cadena.substring (desplazamiento++,ultimoNumero++);
        System.out.println (cadena2 + cadena1);
    }
}