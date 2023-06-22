import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTRE 1 Y 6");
        int numero = entrada.nextInt();

        int construido=0;

        for (int i=1; i<=numero; i++){
            int nAleatorio = (int) (Math.random()*10);
            construido=construido*10+nAleatorio;
        }
        System.out.println("EL NUMERO CONSTRUIDO ES: "+ construido);
        System.out.println("EL RESULTADO ES: "+construido*2);
    }
}