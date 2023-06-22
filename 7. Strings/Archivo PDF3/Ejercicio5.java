import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[]args){
    
        String nombres [];
        String sexo [];
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite la cantidad de personas a almaenar");
        int nElementos = entrada.nextInt();

        nombres = new String[nElementos];
        sexo = new String[nElementos];

        for (int i=0; i<nElementos; i++){
            System.out.println(" ");
            System.out.println("Ingrese el nombre de la persona "+i);
            nombres[i] = entrada.next();
            System.out.println("Ingrese el sexo de la persona "+i);
            sexo[i] = entrada.next();
        }

        for (int i=0; i<nElementos; i++){
            System.out.println("["+nombres[i]+" -> "+sexo[i]+"]");
        }
    }
}