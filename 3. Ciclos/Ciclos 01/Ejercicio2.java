import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        //VARIABLE DE ENTRADA
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("SENOR USUARRIO, INGRESE LA CANTIDAD DE MATERIAS");
        int cant_manterias = entrada.nextInt();

        //VARIABLES 
        float sumatoria = 0;
        float Sum_NotasMaterias = 0;
        float Promedio_Ponderado = 0;
        float Notas_Materias = 0;
        float Promedio_Semestre = 0;
        int acumulador_creditos = 0;

        for (int i=1; i<=cant_manterias; i++){

            System.out.print("INGRESE LA NOTA DE LA MATERIA " + i+": ");
            Notas_Materias = entrada.nextFloat();
            
            System.out.print("INGRESE LA CANTIDAD DE CREDITOS DE LA MATERIA " + i+": ");
            int creditosXmateria = entrada.nextInt();

            sumatoria=sumatoria+(Notas_Materias*creditosXmateria);
            acumulador_creditos=acumulador_creditos+creditosXmateria;
        }

        System.out.println("total de creditos es: " + acumulador_creditos);
        System.out.println("promedio del semestre es: " + sumatoria/acumulador_creditos);
    }
}