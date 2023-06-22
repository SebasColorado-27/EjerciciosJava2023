import java.util.Scanner;

public class Ejercicio3{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        int arreglo [][] = new int [3][3];

        int jugando = 0;
        int cont1 = 0;
        int cont2 = 0;

        while (jugando<2){
            System.out.println("|_____T R E S  E N  L I N E A_____|");
            System.out.println("|---------------------------------|");
            System.out.println("|--- 1. INICIAR JUEGO 2. SALIR ---|");
            System.out.println("|---------------------------------|");
            System.out.println("|Seleccione una opcion------------|");
            jugando = entrada.nextInt();

            if (jugando == 1){
                System.out.println("JUEGO INICIADO");
                System.out.println("TABLERO");
                for (int i=0; i<3; i++){
                    for (int k=0; k<3; k++){
                        System.out.print("["+arreglo[i][k]+"]");
                    }
                    System.out.println(" ");
                }

                //PRIMERA RONDA
                System.out.println("JUGADOR 1, INGRESE LA POSICION (1 al 9):");
                int pocision1 = entrada.nextInt();
                if (pocision1==1){
                    arreglo[0][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==2){
                    arreglo[0][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==3){
                    arreglo[0][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==4){
                    arreglo[1][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==5){
                    arreglo[1][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==6){
                    arreglo[1][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==7){
                    arreglo[2][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==8){
                    arreglo[2][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==9){
                    arreglo[2][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //SIGUIENTE TURNO
                System.out.println("JUGADOR 2, INGRESE LA POSICION (1 al 9):");
                int pocision2 = entrada.nextInt();
                if (pocision2==1){
                    arreglo[0][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==2){
                    arreglo[0][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==3){
                    arreglo[0][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==4){
                    arreglo[1][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==5){
                    arreglo[1][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==6){
                    arreglo[1][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==7){
                    arreglo[2][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==8){
                    arreglo[2][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==9){
                    arreglo[2][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                

                //SEGUNDA RONDA
                System.out.println("JUGADOR 1, INGRESE LA POSICION (1 al 9):");
                pocision1 = entrada.nextInt();
                if (pocision1==1){
                    arreglo[0][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==2){
                    arreglo[0][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==3){
                    arreglo[0][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==4){
                    arreglo[1][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==5){
                    arreglo[1][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==6){
                    arreglo[1][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==7){
                    arreglo[2][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==8){
                    arreglo[2][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==9){
                    arreglo[2][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //SIGUIENTE TURNO
                System.out.println("JUGADOR 2, INGRESE LA POSICION (1 al 9):");
                pocision2 = entrada.nextInt();
                if (pocision2==1){
                    arreglo[0][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==2){
                    arreglo[0][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==3){
                    arreglo[0][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==4){
                    arreglo[1][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==5){
                    arreglo[1][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==6){
                    arreglo[1][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==7){
                    arreglo[2][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==8){
                    arreglo[2][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==9){
                    arreglo[2][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }


                //TERCERA RONDA
                System.out.println("JUGADOR 1, INGRESE LA POSICION (1 al 9):");
                pocision1 = entrada.nextInt();
                if (pocision1==1){
                    arreglo[0][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==2){
                    arreglo[0][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==3){
                    arreglo[0][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==4){
                    arreglo[1][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==5){
                    arreglo[1][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==6){
                    arreglo[1][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==7){
                    arreglo[2][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==8){
                    arreglo[2][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==9){
                    arreglo[2][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //SIGUIENTE TURNO
                System.out.println("JUGADOR 2, INGRESE LA POSICION (1 al 9):");
                pocision2 = entrada.nextInt();
                if (pocision2==1){
                    arreglo[0][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==2){
                    arreglo[0][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==3){
                    arreglo[0][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==4){
                    arreglo[1][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==5){
                    arreglo[1][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==6){
                    arreglo[1][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==7){
                    arreglo[2][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==8){
                    arreglo[2][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==9){
                    arreglo[2][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }


                //CUARTA RONDA
                System.out.println("JUGADOR 1, INGRESE LA POSICION (1 al 9):");
                pocision1 = entrada.nextInt();
                if (pocision1==1){
                    arreglo[0][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==2){
                    arreglo[0][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==3){
                    arreglo[0][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==4){
                    arreglo[1][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==5){
                    arreglo[1][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==6){
                    arreglo[1][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==7){
                    arreglo[2][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==8){
                    arreglo[2][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==9){
                    arreglo[2][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //SIGUIENTE TURNO
                System.out.println("JUGADOR 2, INGRESE LA POSICION (1 al 9):");
                pocision2 = entrada.nextInt();
                if (pocision2==1){
                    arreglo[0][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==2){
                    arreglo[0][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==3){
                    arreglo[0][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==4){
                    arreglo[1][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==5){
                    arreglo[1][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==6){
                    arreglo[1][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==7){
                    arreglo[2][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==8){
                    arreglo[2][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==9){
                    arreglo[2][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //QUINTA RONDA
                System.out.println("JUGADOR 1, INGRESE LA POSICION (1 al 9):");
                pocision1 = entrada.nextInt();
                if (pocision1==1){
                    arreglo[0][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==2){
                    arreglo[0][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==3){
                    arreglo[0][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==4){
                    arreglo[1][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==5){
                    arreglo[1][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==6){
                    arreglo[1][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==7){
                    arreglo[2][0]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==8){
                    arreglo[2][1]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision1==9){
                    arreglo[2][2]=7;
                    cont1 = cont1 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                //SIGUIENTE TURNO
                System.out.println("JUGADOR 2, INGRESE LA POSICION (1 al 9):");
                pocision2 = entrada.nextInt();
                if (pocision2==1){
                    arreglo[0][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==2){
                    arreglo[0][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==3){
                    arreglo[0][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==4){
                    arreglo[1][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==5){
                    arreglo[1][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==6){
                    arreglo[1][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==7){
                    arreglo[2][0]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==8){
                    arreglo[2][1]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }
                if (pocision2==9){
                    arreglo[2][2]=3;
                    cont2 = cont2 + 1;
                    for (int i=0; i<arreglo.length; i++){
                        for (int k=0; k<arreglo.length; k++){
                            System.out.print("["+arreglo[i][k]+"]");
                        }
                        System.out.println(" ");
                    }
                }

                System.out.println("EL J1 HIZO " +cont1+" MOVIMIENTOS");
                System.out.println("EL J2 HIZO " +cont2+" MOVIMIENTOS");

                if (cont1 == 5 && cont2 == 4){
                    System.out.println("-----------PARTIDA TERMINADA---------");
                    System.out.println("-------------¡¡¡EMPATE!!!------------");
                }
                System.out.println(" ");
                System.out.println(" ");
                if (cont1 == 5 && cont2 == 5){
                    System.out.println("-----------PARTIDA TERMINADA---------");
                    System.out.println("-------------¡¡¡EMPATE!!!------------");
                }
                System.out.println(" ");
                System.out.println(" ");
                if (cont1 == 3 && cont2 == 2){
                    System.out.println("-----------PARTIDA TERMINADA---------");
                    System.out.println("----¡¡¡JUGADOR 1 ES EL GANADOR!!!----");
                }
                System.out.println(" ");
                System.out.println(" ");
                if (cont1 == 2 && cont2 == 3){
                    System.out.println("-----------PARTIDA TERMINADA---------");
                    System.out.println("----¡¡¡JUGADOR 2 ES EL GANADOR!!!----");
                }
                System.out.println(" ");
                System.out.println(" ");
            }
            if (jugando == 2){
                System.out.println("FIN JUEGO");
            }
        }

    }
}