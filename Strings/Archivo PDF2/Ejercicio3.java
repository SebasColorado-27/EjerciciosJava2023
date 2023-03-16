import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor usuario, ingrese la palabra 1");
        String palabra1 = entrada.nextLine();
        System.out.println("Senor usuario, ingrese la palabra 2");
        String palabra2 = entrada.nextLine();

        int limite = palabra1.length();
        int tamano = limite+palabra2.length();
        char [] cadena3 = new char [tamano];

        for (int i=0; i<palabra1.length(); i++){
            cadena3[(i*2)]=palabra1.charAt(i);
            cadena3[(i*2+1)]=palabra2.charAt(i);
        }
        System.out.println(cadena3);
    }
}