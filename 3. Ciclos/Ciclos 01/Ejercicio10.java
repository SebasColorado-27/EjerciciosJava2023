import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){

        Scanner entrada=new Scanner(System.in);
        System.out.println("SENOR USUARIO, INGRESE UN NUMERO ENTERO N");
        System.out.println("EL VALOR MAXIMO DE N DEBE SER 11");
        int numero=entrada.nextInt();
        int cont=1;
        System.out.println("LOS NUMEROS PRIMOS ENCONTRADOS SON:");

        if (numero <= 11){
            for(int i=1;i<=numero;i++){
                for(int j=1;j<=numero;j++){
                    if(cont%2==0){
                        int m=0;
                        while(m<1){
                            int aleatorio=(int)(Math.random()*999);
                            int acumulador=0;
                            int a =1;

                            while(a<=aleatorio){
                                if (aleatorio%a==0){
                                    acumulador++;
                                }
                                a++;
                            }
                            if (acumulador>2){
                                System.out.print(" "+((aleatorio<10)?"00":((aleatorio<100)?"0":""))+aleatorio+" ");
                                m++;
                            }
                        }
                    }else {
                        int m=0;
                        while(m<1){
                            int aleatorio=(int)(Math.random()*999);
                            int acumulador=0;
                            int a =1;

                            while(a<=aleatorio){
                                if (aleatorio%a==0){
                                    acumulador++;
                                }
                                a++;
                            }
                            if (acumulador==2){
                                System.out.print(" "+((aleatorio<10)?"00":((aleatorio<100)?"0":""))+aleatorio+" ");
                                m++;
                            }
                        }
                    }
                    cont++;
                }
                System.out.println(" ");
            }  
        }
        if (numero > 11){
            System.out.println("EL NUMERO ESTA FUERA DE RANGO");
        }
    }  
}
