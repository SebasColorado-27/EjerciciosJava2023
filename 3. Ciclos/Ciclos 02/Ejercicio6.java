import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args){

        Scanner entrada = new Scanner (System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO N ENTERO");
        int n = entrada.nextInt();

        System.out.println("SENOR USUARIO, INGRESE UN NUMERO M ENTERO");
        int m = entrada.nextInt();

        int factorial = 1;

        for(int j=n; j<=m; j++){

            int contador = 1;
            int resultado = 0;

            System.out.println("FACTORIAL DE "+j+"("+j+"!): ");
            System.out.print(" ");
            
            for(int i=1; i<=j; i++){
                resultado=contador*i;
                contador=resultado;
                if (i==j){
                    System.out.print(i+"="+resultado);
                } else {
                    System.out.print(i+"x");
                }
            }
            System.out.println();
        }
    }
}