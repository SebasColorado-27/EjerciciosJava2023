import java.util.Scanner;

public class Ejercicio10{
    public static void main(String[]args){

        //VARIABLE ENTRADA
        Scanner entrada= new Scanner(System.in);

        float promedio=0;
        System.out.println("|------------------------------------------------|");
        System.out.println("|              CALIFICADOR DE NOTAS              |");
        System.out.println("|------------------------------------------------|");

        System.out.println("SENOR USUARIO, INGRESE LA NOTA DE MATEMATICAS");
        float notaMatematica=entrada.nextFloat();
        System.out.println("SENOR USUARIO, INGRESE LA NOTA DE ESPAÑOL");
        float notaEspanol=entrada.nextFloat();
        System.out.println("SENOR USUARIO, INGRESE LA NOTA DE INGLES");
        float notaIngles=entrada.nextFloat();
        System.out.println("SENOR USUARIO, INGRESE LA NOTA DE DEPORTES");
        float notaDeportes=entrada.nextFloat();
        System.out.println("SENOR USUARIO, INGRESE LA NOTA DE CIENCIAS NATURALES");
        float notaCiencias=entrada.nextFloat();

        promedio=(notaMatematica+notaEspanol+notaIngles+notaDeportes+notaCiencias)/5;

        if(notaMatematica>notaEspanol && notaMatematica>notaIngles && notaMatematica>notaDeportes && notaMatematica>notaCiencias){
            System.out.println("LA NOTA MAYOR ES MATEMATICAS "+notaMatematica);
        }else if(notaEspanol>notaMatematica && notaEspanol>notaIngles &&notaEspanol>notaDeportes && notaEspanol>notaCiencias){
            System.out.println("LA NOTA MAYOR ES ESPAÑOL "+notaEspanol);
        }else if(notaIngles>notaMatematica && notaIngles>notaEspanol && notaIngles>notaDeportes && notaIngles>notaCiencias){
            System.out.println("LA NOTA MAYOR ES INGLES "+notaIngles);
        }else if(notaDeportes>notaMatematica && notaDeportes>notaEspanol && notaDeportes>notaIngles && notaDeportes>notaCiencias){
            System.out.println("LA NOTA MAYOR ES DEPORTES "+notaDeportes);
        }else if(notaCiencias>notaMatematica && notaCiencias>notaEspanol && notaCiencias>notaIngles && notaCiencias>notaDeportes){
            System.out.println("LA NOTA MAYOR ES CIENCIAS "+notaCiencias);
            
        }


        if(notaMatematica<notaEspanol && notaMatematica<notaIngles && notaMatematica<notaDeportes && notaMatematica<notaCiencias){
            System.out.println("LA NOTA MENOR ES MATEMATICAS "+notaMatematica);
            if(promedio<3){
                int multiplicacion=5*3;
                notaMatematica=multiplicacion-notaEspanol-notaIngles-notaDeportes-notaCiencias;
                System.out.println("USTED DEBIO SACAR UN PORCENTAJE DE "+notaMatematica +" EN MATEMATICAS PARA APROVAR LA ASIGNATURA");
            }
        }else if(notaEspanol<notaMatematica &&  notaEspanol<notaIngles &&  notaEspanol<notaDeportes && notaEspanol<notaCiencias){
            System.out.println("LA NOTA MENOR ES ESPAÑOL"+notaEspanol);
              if(promedio<3){
                int multiplicacion=5*3;
                notaEspanol=multiplicacion-notaMatematica-notaIngles-notaDeportes-notaCiencias;
                System.out.println("USTED DEBIO SACAR UN PORCENTAJE DE "+notaEspanol+" EN ESPAÑOL PARA APROVAR LA ASIGNATURA");
            }
            
        }else if(notaIngles<notaMatematica &&  notaIngles<notaEspanol && notaIngles<notaDeportes && notaIngles<notaCiencias){
            System.out.println("LA NOTA MENOR ES INGLES "+notaIngles);
            if(promedio<3){
                int multiplicacion=5*3;
                notaIngles=multiplicacion-notaMatematica-notaEspanol-notaDeportes-notaCiencias;
                System.out.println("USTED DEBIO SACAR UN PORCENTAJE DE "+notaIngles +" EN INGLES PARA APROVAR LA ASIGNATURA");
            }
            
        }else if(notaDeportes<notaMatematica &&  notaDeportes<notaEspanol && notaDeportes<notaIngles && notaDeportes<notaCiencias){
             System.out.println("LA NOTA MENOR ES DEPORTES "+notaDeportes);
            if(promedio<3){
                int multiplicacion=5*3;
                notaDeportes=multiplicacion-notaMatematica-notaIngles-notaEspanol-notaCiencias;
                System.out.println("USTED DEBIO SACAR UN PORCENTAJE DE "+notaDeportes +" EN DEPORTES PARA APROVAR LA ASIGNATURA");
            }
           
        }else if(notaCiencias<notaMatematica &&  notaCiencias<notaEspanol && notaCiencias<notaIngles && notaCiencias<notaDeportes){
            System.out.println("LA NOTA MENOR ES CIENCIAS"+notaCiencias);
            if(promedio<3){
                int multiplicacion=5*3;
                notaCiencias=multiplicacion-notaMatematica-notaIngles-notaDeportes-notaEspanol;
                System.out.println("USTED DEBIO SACAR UN PORCENTAJE DE "+notaCiencias +" EN CIENCIAS PARA APROVAR LA ASIGNATURA");
            }
        }
        System.out.println("ESTE ES EL PROMEDIO TOTAL DE SUS NOTAS :"+promedio);
    }
}