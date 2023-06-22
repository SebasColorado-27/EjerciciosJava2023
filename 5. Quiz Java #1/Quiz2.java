import java.util.Scanner;

public class Quiz2{
    public static void main (String[]args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE EL TAMANO DEL VECTOR PARA IMPRIMIR NUMEROS PRIMOS");
        int limite = entrada.nextInt();
        int i=0;
        int [] arreglo = new int [limite];

        while (i<limite){
            int aleatorio=(int)(Math.random()*999);
            int acum = 0;
            int a=1;

            while(a<=aleatorio){
                if (aleatorio%a==0){
                    acum++;
                }
                a++;
            }

            if (acum==2){
                boolean valido =true;
                for (int j=0; j<limite; j++){
                    if (arreglo[j]==aleatorio){
                        valido = false;
                    }
                }
                if (valido){
                    arreglo[i]=aleatorio;
                    i++;
                }
            }
        }
        for(i=0; i<limite; i++){
            System.out.print("["+arreglo[i]+"]");
        }
    }
}