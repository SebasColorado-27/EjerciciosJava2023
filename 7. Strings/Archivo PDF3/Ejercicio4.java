import java.util.Scanner;

public class Ejercicio4{
    public static void main(String[]args){
    
        Scanner entrada = new Scanner(System.in);
        String nombres [];

        System.out.println("Digite la cantidad de nombres a almaenar");
        int nElementos = entrada.nextInt();
        nombres = new String[nElementos];

        for (int i=0; i<nElementos; i++){
            System.out.println("Digite el nombre "+i);
            nombres[i] = entrada.next();
        }
        System.out.println(" ");
        System.out.println("---ARREGLO---");
        for (int i=0; i<nElementos; i++){
            System.out.println(nombres[i]);
        }

        String auxiliar;
        for (int i=0; i<nElementos-1; i++){
            for (int j=0; j<nElementos-1; j++){
                if (nombres[j].compareTo(nombres[j+1])>0){
                    auxiliar=nombres[j];
                    nombres[j]=nombres[j+1];
                    nombres[j+1]=auxiliar;
                }
            }
        }
        System.out.println("---ARREGLO ORDENADO ALFABETICAMENTE---");
        for (int i=0; i<nElementos; i++){
            System.out.println("["+nombres[i]+"]");
        }
    }
}


