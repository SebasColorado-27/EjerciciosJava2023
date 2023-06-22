import java.util.Scanner;

public class Quiz3{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO ENTERO N (valor maximo 11)");
        int n = entrada.nextInt();

        int [] arreglo1 = new int [n];
        int iterador=1;
        int contador=0;
        int m=1;

        if (n<=11){
            System.out.println("LOS NUMEROS PRIMOS ENCONTRADOS SON:");
            for (int i=0; i<n; i++){
                for (int k=0; k<n; k++){
                    for (int j=0; j==0; j++){
                        int aleatorio = (int)(Math.random()*999);
                        if (aleatorio%m==0){
                            contador++;
                            }
                            m++;
                        if (contador==2){
        
                        }
                        System.out.print("["+aleatorio+"]");
                    }
                }
                for (int j=0; j<1; j++){
                    System.out.println(" ");
                }
            }
        } else {
            System.out.println("NUMERO FUERA DE RANGO");
        }
    }
}