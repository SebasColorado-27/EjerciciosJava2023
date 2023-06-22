import java.util.Scanner;

public class Ejercicio7{
    public static void main(String[]args){

        int num1,num2,num3;
        int valorMaximo;
        int i;

        Scanner entrada=new Scanner (System.in);
        System.out.println("SENOR USUARIO, INGRESE EL PRIMER NUMERO ");
        num1=entrada.nextInt();
        System.out.println("SENOR USUARIO, INGRESE EL SEGUNDO NUMERO "); 
        num2=entrada.nextInt();
        System.out.println("SENOR USUARIO, INGRESE EL TERCER NUMERO "); 
        num3=entrada.nextInt();

        valorMaximo=num1;
        if (num2>valorMaximo){
            valorMaximo=num2;
        }
        if (num3>valorMaximo){
            valorMaximo=num3;
        }
        i=valorMaximo;

        while ((i%num1!=0)||(i%num2!=0)||(i%num3!=0)){
            i++;
        }
        System.out.println("EL MINIMO COMUN MULTIPLO DE "+num1+" ,"+num2+" ,"+num3+" ES: "+ i);
    }
}
