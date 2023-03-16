import java.util.Scanner;

public class Ejercicio16 {

    public static void main(String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE SU NOMBRE DE USUARIO");
        String usuario = entrada.nextLine();

        int memoriadisponible = 100;
        int espacio=0;
        int opcion = 0;
        int totalhabitantes = 0;

        //Arreglos 
        String municipios [] = new String [5];
        String departamentos [] = new String [1];
        int habitantes [] = new int [5]; 
        int alturaSNM [] = new int [5]; 
        

        while(opcion<10){
            System.out.println("Bienvenido al Sistema, "+usuario+"."+" / MEMORIA DISPONIBLE: "+memoriadisponible+" Registros.");
            System.out.println("|---------------------------------------------------------------|");
            System.out.println("|1. Registrar Municipio                                         |");
            System.out.println("|2. Ver Lista de Municipios                                     |");
            System.out.println("|3. Ver Informacion de Municipio                                |");
            System.out.println("|4. Registar Numero de Habitantes de un Municipio               |");
            System.out.println("|5. Registrar Altura Sobre el nivel del mar de un Municipio     |");
            System.out.println("|6. Ver Lista de Departamentos registrados                      |");
            System.out.println("|7. Ver informacion De Departamento                             |");
            System.out.println("|8. Eliminar municipio                                          |");
            System.out.println("|9. Eliminar Departamento                                       |");
            System.out.println("|10. Salir                                                      |");
            System.out.println("|---------------------------------------------------------------|");

            System.out.println("INGRESE UNA OPCION.");
            opcion = entrada.nextInt(); 

            if (opcion == 1){
                System.out.println("");
                System.out.println("1. REGISTRAR MUNICIPIO.");
                System.out.println("");

                for (int i=0; i<municipios.length; i++){
                    System.out.println("Ingrese El Nombre del Municipio "+i);
                    String municipio = entrada.next(); 
                    municipios[i]=municipio;
                    memoriadisponible=memoriadisponible-1;
                    espacio=espacio+1;
                     
                }
                for (int i=0; i<departamentos.length; i++){
                    System.out.println("Ingrese a que Departamento pertecene los Anteriores Municipios ");
                    String departamento = entrada.next(); 
                    departamentos[i]=departamento;
                    memoriadisponible=memoriadisponible-1;
                    espacio=espacio+1;
                }

                // boolean validar=true;
                // if (municipio == municipios[i]){
                //     validar = false;
                // } else if (validar){
                // } else{
                //     System.out.println("EL MUNICIPIO INGRESADO YA ESTA REPETIDO!");
                //     i--;
                // }

            } 
    
            if (opcion == 2){
                System.out.println("");
                System.out.println("1. VER LISTA DE MUNICIPIOS.");
                for (int i=0; i<municipios.length; i++){
                    for (int j=0; j<1; j++){
                        System.out.println(" ");    
                    }
                    System.out.println("["+municipios[i]+"]");
                }
            }

            if (opcion == 3){
                System.out.println("");
                System.out.println("3. VER INFORMACION DE MUNICIPIOS.");
                System.out.println("");
                System.out.println("MUNICIPIO---------HABITANTES----------ALTURA SNM");
                for (int i=0; i<municipios.length; i++){
                    for (int j=0; j<1; j++){
                        System.out.println(" ");    
                    }
                    System.out.println("["+municipios[i]+"]"+" --- "+"["+habitantes[i]+"]"+" --- "+"["+alturaSNM[i]+"]");
                }
            }

            if (opcion == 4){
                System.out.println("");
                System.out.println("5. REGISTRAR NUMERO DE HABITANTES DE UN MUNICIPIO.");
                System.out.println(" ");
                for (int i=0; i<habitantes.length; i++){
                    System.out.println("Ingrese La Cantidad de Habitantes del Municipio "+municipios[i]);
                    int habitante = entrada.nextInt(); 
                    habitantes[i]=habitante;
                    totalhabitantes = totalhabitantes + habitante;
                    memoriadisponible=memoriadisponible-1;
                    espacio=espacio+1;
                }
            }

            if (opcion == 5){
                System.out.println("");
                System.out.println("5. ALTURA SOBRE EL NIVEL DEL MAR DE UN MUNICIPIO.");
                System.out.println(" ");
                for (int i=0; i<alturaSNM.length; i++){
                    System.out.println("Ingrese La Altura Sobre el Nivel del Mar del Municipio "+municipios[i]);
                    int altura = entrada.nextInt(); 
                    alturaSNM[i]=altura;
                    memoriadisponible=memoriadisponible-1;
                    espacio=espacio+1;
                }
            }

            if (opcion == 6){
                System.out.println("");
                System.out.println("6. VER LISTA DE DEPARTAMENTOS REGISTRADOS.");
                System.out.println(" ");
                for (int i=0; i<departamentos.length; i++){
                    System.out.println("["+departamentos[i]+"]");
                }
            }

            if (opcion == 7){
                int mayor = alturaSNM[0];
                int menor = alturaSNM[0];
                for (int i = 1; i < alturaSNM.length; i++) {
                    if (alturaSNM[i] > mayor) {
                        mayor = alturaSNM[i];
                    }

                    if (alturaSNM[i] < menor) {
                        menor = alturaSNM[i];
                    }
                }
                System.out.println("");
                System.out.println("7. VER INFORMACION DEL DEPARTAMENTO.");
                System.out.println("");
                System.out.println("DERPARTAMENTO");
                for (int i=0; i<departamentos.length; i++){
                    System.out.println("["+departamentos[i]+"]");
                }
                System.out.println(" ");
                System.out.println("MUNICIPIOS");
                for (int i=0; i<municipios.length; i++){
                    System.out.println("["+municipios[i]+"]");
                }
                System.out.println(" ");
                System.out.println("TOTAL HABITANTES");
                System.out.println("["+totalhabitantes+"]");
                System.out.println(" ");
                System.out.println("MAYOR ALTURA SNM");
                System.out.println("["+mayor+"]");
                System.out.println(" ");
                System.out.println("MENOR ALTURA SNM");
                System.out.println("["+menor+"]");
            }

            if (opcion == 8){
                System.out.println("");
                System.out.println("8. ELIMINAR MUNICIPIO.");
                System.out.println(" ");
                System.out.println("Ha seleccionado eliminar municipio, ingrese indice del municipio que desea eliminar");
                int eliminar = entrada.nextInt();
                if (eliminar==0){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL MUNICIPIO "+municipios[0]+" Y TODA SU INFORMACION");
                    municipios[0]=municipios[1];
                    alturaSNM[0]=alturaSNM[1];
                    habitantes[0]=habitantes[1];
                    municipios[1]=municipios[2];
                    alturaSNM[1]=alturaSNM[2];
                    habitantes[1]=habitantes[2];
                    municipios[2]=municipios[3];
                    alturaSNM[2]=alturaSNM[3];
                    habitantes[2]=habitantes[3];
                    municipios[3]=municipios[4];
                    alturaSNM[3]=alturaSNM[4];
                    habitantes[3]=habitantes[4];
                    municipios[4]="";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
                if (eliminar==1){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL MUNICIPIO "+municipios[1]+" Y TODA SU INFORMACION");
                    municipios[1]=municipios[2];
                    alturaSNM[1]=alturaSNM[2];
                    habitantes[1]=habitantes[2];
                    municipios[2]=municipios[3];
                    alturaSNM[2]=alturaSNM[3];
                    habitantes[2]=habitantes[3];
                    municipios[3]=municipios[4];
                    alturaSNM[3]=alturaSNM[4];
                    habitantes[3]=habitantes[4];
                    municipios[4]="";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
                if (eliminar==2){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL MUNICIPIO "+municipios[2]+" Y TODA SU INFORMACION");
                    municipios[2]=municipios[3];
                    alturaSNM[2]=alturaSNM[3];
                    habitantes[2]=habitantes[3];
                    municipios[3]=municipios[4];
                    alturaSNM[3]=alturaSNM[4];
                    habitantes[3]=habitantes[4];
                    municipios[4]="";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
                if (eliminar==3){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL MUNICIPIO "+municipios[3]+" Y TODA SU INFORMACION");
                    municipios[3]=municipios[4];
                    alturaSNM[3]=alturaSNM[4];
                    habitantes[3]=habitantes[4];
                    municipios[4]="";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
                if (eliminar==4){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL MUNICIPIO "+municipios[4]+" Y TODA SU INFORMACION");
                    municipios[4]="";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
                if (eliminar<0 && eliminar>=5){
                    System.out.println("El Indice ingresado no esta en las bases de datos");
                }
            }
            if (opcion == 9){
                System.out.println("");
                System.out.println("8. ELIMINAR DEPARTAMENTO.");
                System.out.println(" ");
                System.out.println("Ha seleccionado eliminar departamento, ingrese indice del departamento que desea eliminar");
                int eliminar = entrada.nextInt();
                if (eliminar==0){
                    System.out.println(" ");
                    System.out.println("HA ELIMINADO EL DEPARTAMEDO DE "+departamentos[0]+" Y TODA SU INFORMACION");
                    municipios[0]="Sin datos";
                    alturaSNM[0]=0;
                    habitantes[0]=0;
                    municipios[1]="Sin datos";
                    alturaSNM[1]=0;
                    habitantes[1]=0;
                    municipios[2]="Sin datos";
                    alturaSNM[2]=0;
                    habitantes[2]=0;
                    municipios[3]="Sin datos";
                    alturaSNM[3]=0;
                    habitantes[3]=0;
                    municipios[4]="Sin datos";
                    alturaSNM[4]=0;
                    habitantes[4]=0;
                }
            }
            if (opcion==10){
                System.out.println(" ");
                System.out.println("|----------------------------------------|");
                System.out.println("|    GRACIAS POR USAR ESTE SOFTWARE :D   |");
                System.out.println("|----------------------------------------|");
                System.out.println(" ");
            }
        }
    }
}