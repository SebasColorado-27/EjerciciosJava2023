import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Senor usuario, ingrese una oracion: ");
        String cadena = entrada.nextLine();

        for (int i=0; i<cadena.length(); i++){
            int pos = (int) cadena.charAt(i);

            if (cadena.charAt(i)>=97){
                char nuevoA = (char) (pos-32);
                System.out.print(nuevoA);
            } else if (cadena.charAt(i)>=65){
                char nuevoB = (char) (pos+32);
                System.out.print(nuevoB);
            }

            if (cadena.charAt(i)==32){
                System.out.println(' ');
            }
        } 
    }
}