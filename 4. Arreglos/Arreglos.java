import java.util.Scanner;

public class Arreglos {
    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);

        //Crear arreglo vacio
        int [] arreglo_1 = new int [10];

        //crear arreglo lleno
        int [] arreglo_2 = {1, 2, 30, 20, 79};

        //acceder al contenido del arreglo
        arreglo_1[0]=25;
        arreglo_1[3]=55;
        arreglo_1[9]=99;
        for(int i=0; i<=4; i++){
            arreglo_2[i]=5;
        }

        //imprimir el contenido del arreglo
        for (int i=0; i<=4; i++){
            System.out.print("["+arreglo_2[i]+"]");
        }
    }
}