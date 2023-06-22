import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTERO IMPAR");
        int numero = entrada.nextInt();

        int a = (numero+1)/2;

        for (int i=1; i<=a; i++){
            for (int b=1; b<=a -i; b++){
                System.out.print(" ");
            }
            for (int c=1; c<=(i*2)-1; c++){
                System.out.print("X");
            }
            System.out.println();
        }
        a=a-1;
        for (int j=a; j>=1; j--){
            for (int b=numero/2+1; b <= numero-j; b++){
                System.out.print(" ");
            }
            for (int c=1; c<=(j*2)-1; c++){
                System.out.print("X");
            }
            System.out.println();
        }

    }
}