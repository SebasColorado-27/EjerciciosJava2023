import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("SENOR USUARIO INGRESE EL VALOR TOTAL DEL SUELDO");
        int sueldo=entrada.nextInt();

        System.out.println("SENOR USUARIO INGRESE LA CANTIDAD DE PAGOS");
        int cantidad=entrada.nextInt();

        System.out.println("|-------------FORMAS DE PAGO------------|");
        System.out.println("| 1. PAGO DE IGUAL VALOR                |");
        System.out.println("| 2. PRIMER PAGO DIFERENTE              |");
        System.out.println("| 3. ULTIMO PAGO DIFERENTE              |");
        System.out.println("| 4. PRIMER Y ULTIMO PAGO DIFERENTE     |");
        System.out.println("|---------------------------------------|")

        System.out.println("INGRESE LA FORMA DE PAGO");
        int opcion=entrada.nextInt();

        if(opcion==1){
            System.out.println("---------SUS PAGOS SERAN---------");
            for(int i=1;i<=cantidad;i++){
                int dividir=sueldo/cantidad;
                System.out.println("Mes "+i+ "$ "+dividir);
            }

        }else if(opcion==2 ){
            System.out.println("Ingrese el primer pago:");
            int primer=entrada.nextInt();
            int resta=sueldo-primer;
            int n=sueldo-resta;
            int menor=cantidad-1;
            System.out.println("Mes 1:$"+n);
            for(int j=1;j<=menor;j++){
               int pago_1=resta/menor;
                System.out.println("Mes "+(j+1)+"$"+pago_1);
            }
    
        }else if(opcion==3){
            System.out.println("Ingrese el ultimo pago");
            int ultimo=entrada.nextInt();
            int resta_d=sueldo-ultimo;
            int menor_t=cantidad-1;
            for(int m=1;m<=menor_t;m++){
               int pago_1=resta_d/menor_t;
                System.out.println("Mes "+m+"$"+pago_1);
            }
            System.out.print("MES $"+ultimo);
        
        }else if(opcion==4){
            System.out.println("Ingrese el primer pago:");
            int primer=entrada.nextInt();
            System.out.println("Ingrese el ultimo pago:");
            int ultimo=entrada.nextInt();
            int restar=sueldo-primer-ultimo;
            int menos=cantidad-2;
            System.out.println("Mes 1 $"+primer);
            for(int k=1;k<=menos;k++){
               int pago_2=restar/menos;
                System.out.println("Mes "+k+"$"+pago_2);
            }
            System.out.println("mes pago final "+ultimo);
        }
    }
}