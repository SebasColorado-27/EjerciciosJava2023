import java.util.Scanner;

public class CadenaTexto{
    public static void main(String[]args){

        //Variable para leer datos
        Scanner entrada = new Scanner(System.in);

        //Pedir texto al usuario.
        System.out.print("Ingrese su nombre: ");
        String cadena = entrada.nextLine();

        //Pruebas
        //STRING
        System.out.println(" Valor Almacenado => "+ cadena);

        //STRING.LENGTH
        System.out.println(" Cantidad letras => "+ cadena.length());
        
        //CHARAT
        System.out.println(" Letra en pos 0 => "+ cadena.charAt(0));
        System.out.println(" Letra en pos 1 => "+ cadena.charAt(1));
        System.out.println(" Letra en pos 2 => "+ cadena.charAt(2));
        System.out.println(" Letra en pos 3 => "+ cadena.charAt(3));
        System.out.println(" Letra en pos 4 => "+ cadena.charAt(4));
        
        //COMPARETO
        String palabra_1 = "Hola Mundo";
        String palabra_2 = "hOLA mUNDO";
        System.out.println("CompareTo P1 a P2 "+palabra_1.compareTo(palabra_2));
        System.out.println("CompareTo P2 a P1 "+palabra_2.compareTo(palabra_1));

        //EQUALS
        System.out.println("Equals P1 A P2: "+ palabra_1.equals(palabra_2));
        System.out.println("Equals P2 A P1: "+ palabra_2.equals(palabra_1));

        //EQUALSIGNORESCASE
        System.out.println("EqualsIgnoreCase P1 A P2: "+ palabra_1.equalsIgnoreCase(palabra_2));
        System.out.println("EqualsIgnoreCase P2 A P1: "+ palabra_2.equalsIgnoreCase(palabra_1));
    } 
}