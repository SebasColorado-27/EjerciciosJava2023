import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Senor Usuario, Ingrese Su NameTAG.");
        String nombre = entrada.nextLine();

        System.out.println("Bienvenido "+nombre+" al Juego de el AHORCADO.");
        String palabraoculta = ("JavaScript");
        palabraoculta.length();
        

        System.out.println("|------------------------------------------------|");
        System.out.println("|Seleccione una opcion:                          |");
        System.out.println("|1=INICIAR JUEGO           2=SALIR               |");
        System.out.println("|------------------------------------------------|");
        int opcion = entrada.nextInt();


        if (opcion==1){
            System.out.println("------------------------------------------------");
            System.out.println(nombre+ " ha iniciado una nueva partida en el ahorcado.");
            System.out.println("La palabra oculta se compone de 10 caracteres");
            System.out.println(" ");
            System.out.println(" ");
            System.out.println("--------");
            System.out.println("|      |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("       |");
            System.out.println("--------");

            int intentos = 0;
            System.out.println("Adivina la palabra!");
            for (int i=0; i<=palabraoculta.length();i++){
                System.out.println("Introduce una letra: ");
                String letra = entrada.nextLine();

                if(letra.charAt(0) == palabraoculta.charAt(0)){
                    System.out.println("Letra correcta");
                }else{
                    System.out.println("Letra incorrecta");
                }
            }
        }
        if (opcion==2){
            System.out.println("Jaja por nub no puso pared");
        }

    }
}