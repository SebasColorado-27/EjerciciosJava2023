import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String [] args){

        //ENTRADA
        Scanner entrada1 = new Scanner(System.in);
        System.out.print(" SEÑOR USUARIO, INGRESE EL NUMERO DE EL EJE X ");
        int eje_x = entrada1.nextInt();

        Scanner entrada2 = new Scanner(System.in);
        System.out.print(" SEÑOR USUARIO, INGRESE EL NUMERO DE EL EJE Y ");
        int eje_y = entrada2.nextInt();
                
        if (eje_x >= 1) {
            if (eje_y >=1) {
                System.out.println("SE ENCUENTRA EN CUADRANTE 1");
            } else {
                System.out.println("SE ENCUENTRA EN CUADRANTE 4");
            }
        } else if (eje_x < -1) {
            if (eje_y > 1) {
                System.out.println("SE ENCUENTRA EN CUADRANTE 2");
            }
        } else {
            System.out.println("SE ENCUENTRA EN CUADRANTE 3");
        }
        if (eje_x<0){
            if(eje_y<0){
                System.out.println("SE ENCUENTRA EN CUADRANTE 4");
            }
        }
    }
}