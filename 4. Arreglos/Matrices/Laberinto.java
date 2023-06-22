import java.util.Scanner;

public class Laberinto{
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        
        //Varable De Entrada Por Teclado
        int [][] matriz1 = {
                            {1,1,1,1,1,1,1,},
                            {1,0,0,0,1,0,3,},
                            {1,0,1,0,1,0,1,},
                            {1,0,1,0,1,0,1,},
                            {2,0,1,0,0,0,1,},
                            {1,1,1,1,1,1,1,}
                        };

        //Ciclo Del Juego
        boolean jugando = true;
        int pos_f = 4;
        int pos_c = 0;

        while(jugando){

            //Imprimir El Laberinto
            for (int i=0; i<matriz1.length; i++){
                for (int j=0; j<matriz1[i].length; j++){
                    System.out.print("["+matriz1[i][j]+"]");
                }
                System.out.println(" ");
            }

            //Imprimir El Menu
            System.out.println(" ");
            System.out.println("1. Arriba.  2. Abajo  3. Derecha  4. Izquiero  ");

            System.out.println("INGRESE EL MOVIMIENTO");
            int opcion = entrada.nextInt();

            //Condiciones segun la seleccion del usuario

            //Codigo para mover arriba
            if (opcion==1){
                if(matriz1[pos_f-1][pos_c]==0){
                    matriz1[pos_f-1][pos_c]=2;
                    matriz1[pos_f][pos_c]=0;
                    pos_f = pos_f-1;
                    pos_c = pos_c;
                } else if(matriz1[pos_f][pos_c+1]==3){
                    jugando=false;
                    System.out.println("|------------------------------------------------------------|");
                    System.out.println("|                      JUEGO FINALIZADO                      |");
                    System.out.println("|C - O - N - G - R - A - T - U - L - A - T - I - O - N - S  !|");
                    System.out.println("|------------------------------------------------------------|");
                }
            }
            //Codigo para mover abajo
            if (opcion==2){
                if(matriz1[pos_f+1][pos_c]==0){
                    matriz1[pos_f+1][pos_c]=2;
                    matriz1[pos_f][pos_c]=0;
                    pos_f = pos_f+1;
                    pos_c = pos_c;
                } else if(matriz1[pos_f][pos_c+1]==3){
                    jugando=false;
                    System.out.println("|------------------------------------------------------------|");
                    System.out.println("|                      JUEGO FINALIZADO                      |");
                    System.out.println("|C - O - N - G - R - A - T - U - L - A - T - I - O - N - S  !|");
                    System.out.println("|------------------------------------------------------------|");
                }
            }
            //Codigo para mover derecha
            if (opcion==3){
                //Prguntar si el movimiento es valido
                if(matriz1[pos_f][pos_c+1]==0){
                    matriz1[pos_f][pos_c+1]=2;
                    matriz1[pos_f][pos_c]=0;
                    pos_f = pos_f;
                    pos_c = pos_c+1;
                } else if(matriz1[pos_f][pos_c+1]==3){
                    jugando=false;
                    System.out.println("|------------------------------------------------------------|");
                    System.out.println("|                      JUEGO FINALIZADO                      |");
                    System.out.println("|C - O - N - G - R - A - T - U - L - A - T - I - O - N - S  !|");
                    System.out.println("|------------------------------------------------------------|");
                }
            }
            //Codigo para mover izquierda
            if (opcion==4){
               if(matriz1[pos_f][pos_c-1]==0){
                    matriz1[pos_f][pos_c-1]=2;
                    matriz1[pos_f][pos_c]=0;
                    pos_f = pos_f;
                    pos_c = pos_c-1;
                } else if(matriz1[pos_f][pos_c+1]==3){
                    jugando=false;
                    System.out.println("|------------------------------------------------------------|");
                    System.out.println("|                      JUEGO FINALIZADO                      |");
                    System.out.println("|C - O - N - G - R - A - T - U - L - A - T - I - O - N - S  !|");
                    System.out.println("|------------------------------------------------------------|");
                }
            }
            //Condicion para movimiento incorrecto
            if (opcion<1 || opcion>4){
                System.out.println("MOVIMIENTO INCORRECTO");
            }
        }
    }
}