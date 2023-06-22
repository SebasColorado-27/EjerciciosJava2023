import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int iterador=1;
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTERO");
        int numero = entrada.nextInt();

        while (iterador<=numero){
            int contador=0;
            int j=1;
            int aleatorio = (int)(Math.random()*999);
            while(j<=aleatorio){
                if (aleatorio%j==0){
                    contador++;
                }
                j++;
            }
            if (contador==2){
                System.out.println("EL PRIMO "+iterador+" GENERADO ES: "+aleatorio);
                iterador++;
            }
        }
    }
}