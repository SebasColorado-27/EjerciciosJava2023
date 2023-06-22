import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String cadena = entrada.nextLine();
        
        int Cantidad = cadena.length();
        int cont = 0;
        int j = 0;

        for (int i=Cantidad-1; i>=0; i--){
            if (cadena.charAt(j)==cadena.charAt(i)){
                cont++;
            }
            j++;    
        }
        
        if(cont==Cantidad){
            System.out.println("La palabra es palindroma");
        }else {
            System.out.println("La palabra no es palindroma");
        }
    }
}