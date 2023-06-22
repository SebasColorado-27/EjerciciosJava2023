import java.util.Scanner;

public class Prueba1 {
    public static void main(String [] args){

        //ELEMENTO PARA ENTRADA POR TECLADO
        Scanner entrada = new Scanner(System.in);

        System.out.print(" INGRESE LA BASE: ");
        int base = entrada.nextInt();      

        System.out.print(" INGRESE LA ALTURA ");
        int altura = entrada.nextInt(); 

        int area_rectangulo = base * altura;
        System.out.println(" EL AREA ES: " + area_rectangulo);     

        
    }
}