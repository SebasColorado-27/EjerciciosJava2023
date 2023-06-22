import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("SENOR USUARIO, INGRESE 1 PARA CONTINUAR");
        int continuar = entrada.nextInt();

        for (int j=1; j <= continuar; j++){
            System.out.println("|-------------BIENVENIDO-------------|");
            System.out.println("|1.Docente                           |");
            System.out.println("|2.Estudiante                        |");
            System.out.println("|3.Salir                             |");
            System.out.println("|------------------------------------|");

            System.out.println("SENOR USUARIO, INGRESE LA OPCION A USAR");
            int opcion = entrada.nextInt();
            if (opcion == 1){
                System.out.println("HA SELECCIONADO OPCION 1: DOCENTE");
                //VARIABLE DE ENTRADA
                Scanner entrada1 = new Scanner(System.in);

                //PEDIR AL DATOS USUARIO
                System.out.println("SENOR USUARIO, INGRESE LAS CANTIDAD DE NOTAS");
                int cantidad = entrada1.nextInt();

                float sumatoria = 0;
                for (int i=1; i<=cantidad; i++){
                    System.out.print("INGRESE LA NOTA " +i+": ");
                    float nota = entrada1.nextFloat();

                    sumatoria = sumatoria + nota;
                }
                float promedio = sumatoria / cantidad;
                System.out.println("EL PROMEDIO ES "+ promedio);
            }
        
            if (opcion == 2){
                System.out.println("HA SELECCIONADO OPCION 2: ESTUDIANTE");
                    //VARIABLE DE ENTRADA
                Scanner entrada3 = new Scanner(System.in);
        
                System.out.println("SENOR USUARRIO, INGRESE LA CANTIDAD DE MATERIAS");
                int cant_manterias = entrada3.nextInt();

                //VARIABLES 
                float sumatoria = 0;
                float Sum_NotasMaterias = 0;
                float Promedio_Ponderado = 0;
                float Notas_Materias = 0;
                float Promedio_Semestre = 0;
                int acumulador_creditos = 0;

                for (int i=1; i<=cant_manterias; i++){

                    System.out.print("INGRESE LA NOTA DE LA MATERIA " + i+": ");
                    Notas_Materias = entrada3.nextFloat();
                
                    System.out.print("INGRESE LA CANTIDAD DE CREDITOS DE LA MATERIA " + i+": ");
                    int creditosXmateria = entrada3.nextInt();

                    sumatoria=sumatoria+(Notas_Materias*creditosXmateria);
                    acumulador_creditos=acumulador_creditos+creditosXmateria;
                }
                System.out.println("total de creditos es: " + acumulador_creditos);
                System.out.println("promedio del semestre es: " + sumatoria/acumulador_creditos);
            }
            if (opcion == 3){
            System.out.println("HA SELECCIONADO OPCION 3: SALIR");
            }
        }
    }
}