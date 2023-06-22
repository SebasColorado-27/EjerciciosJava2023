import java.util.Scanner;

public class Ejercicio2{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("|---------------------------------|");
        System.out.println("|        LABERINTO DE JAVA        |");
        System.out.println("|---------------------------------|");
        System.out.println("INSTRUCCIONES");
        System.out.println(" ");
        System.out.println("Debe llevar el numero 2 hasta la META(3) atravez del laberinto con un solo movimiento por turno.");
        System.out.println("Las teclas para jugar son 1=Izquierda / 2=Abajo / 5=Arriba / 3=Derecha.");
        System.out.println(" ");
        System.out.println("---------------CONTROLES--------------");
        System.out.println(" ");
        System.out.println("               ARRIBA = 5         ");
        System.out.println(" ");
        System.out.println("IZQUIERDA=1    ABAJO=2     DERECHA:3");
        System.out.println(" ");
        System.out.println("___________________________________________________________________________");

        int [][] matriz1 = {
                            {1,1,1,1,1,1,1,},
                            {1,0,0,0,1,0,3,},
                            {1,0,1,0,1,0,1,},
                            {1,0,1,0,1,0,1,},
                            {2,0,1,0,0,0,1,},
                            {1,1,1,1,1,1,1,}
                          };
        System.out.println(" ");

        for (int i=0; i<6; i++){
            for (int k=0; k<7; k++){
                System.out.print("["+matriz1[i][k]+"]");
            }
            System.out.println(" ");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL MOVIMIENTO");
        int posicion2 = entrada.nextInt();

        if (posicion2 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[4][0] = 0;
                    matriz1[4][1] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion = entrada.nextInt();

        if (posicion == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[4][1] = 0;
                    matriz1[3][1] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion3 = entrada.nextInt();

        if (posicion3 == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[3][1] = 0;
                    matriz1[2][1] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion4 = entrada.nextInt();

        if (posicion4 == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[2][1] = 0;
                    matriz1[1][1] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion5 = entrada.nextInt();

        if (posicion5 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[1][1] = 0;
                    matriz1[1][2] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion6 = entrada.nextInt();

        if (posicion6 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[1][2] = 0;
                    matriz1[1][3] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion7 = entrada.nextInt();

        if (posicion7 == 2){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ABAJO");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[1][3] = 0;
                    matriz1[2][3] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion8 = entrada.nextInt();

        if (posicion8 == 2){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ABAJO");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[2][3] = 0;
                    matriz1[3][3] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }


        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion9 = entrada.nextInt();

        if (posicion9 == 2){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ABAJO");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[3][3] = 0;
                    matriz1[4][3] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion10 = entrada.nextInt();

        if (posicion10 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[4][3] = 0;
                    matriz1[4][4] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion11 = entrada.nextInt();

        if (posicion11 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[4][4] = 0;
                    matriz1[4][5] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion12 = entrada.nextInt();

        if (posicion12 == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[4][5] = 0;
                    matriz1[3][5] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion13 = entrada.nextInt();

        if (posicion13 == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[3][5] = 0;
                    matriz1[2][5] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion14 = entrada.nextInt();

        if (posicion14 == 5){
            System.out.println("SE HA MOVIDO UNA CASILLA HACIA ARRIBA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[2][5] = 0;
                    matriz1[1][5] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }

        System.out.println(" ");
        System.out.println("INGRESE EL SIGUIENTE MOVIMIENTO");
        int posicion15 = entrada.nextInt();

        if (posicion15 == 3){
            System.out.println("SE HA MOVIDO UNA CASILLA A LA DERECHA");
            System.out.println(" ");
            for (int i=0; i<6; i++){
                for (int k=0; k<7; k++){
                    matriz1[1][5] = 0;
                    matriz1[1][6] = 2;
                    System.out.print("["+matriz1[i][k]+"]");
                }
                System.out.println(" ");
            }
            
        } else {
            System.out.println("Movimiento Fallido !!!, El 2 Choca con las paredes del laberinto");
        }
        System.out.println(" ");
        System.out.println("FELICIDADES !!!");
        System.out.println("ERES EL GANADOR, HAS COMPLETADO EL LABERINTO, TE GANASTE UN VIAJE A MARACAIBO!!!");
    }
}