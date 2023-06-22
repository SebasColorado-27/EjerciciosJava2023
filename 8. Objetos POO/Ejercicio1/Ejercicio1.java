import java.util.Scanner;

public class Ejercicio1{
    public static void main (String[]args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int pos_disponible = 0;
        Persona arreglo [] = new Persona[100];
        int opcion = 0;

        do{
            System.out.println(" ");
            System.out.println("||-------------------------------||");
            System.out.println("||-----------PERSONAS------------||");
            System.out.println("||-------------------------------||");
            System.out.println("||       Personas Registradas: "+pos_disponible+"||");
            System.out.println("||                               ||");
            System.out.println("|| 1.Registrar Persona.          ||");
            System.out.println("|| 2.Ver Lista Persona.          ||");
            System.out.println("|| 3.Ordenar Lista Personas.     ||");
            System.out.println("|| 4.Salir.                      ||");
            System.out.println("||-------------------------------||");
            System.out.print("||=> Ingrese una Opcion: ");
            opcion = entrada_numeros.nextInt();

            if (opcion==1){
                System.out.println("|| => Ingrese el documento: ");
                int documento = entrada_numeros.nextInt();

                System.out.println("|| => Ingrese el nombre: ");
                String nombres = entrada_texto.nextLine();

                System.out.println("|| => Ingrese el apellido: ");
                String apellidos= entrada_texto.nextLine();

                System.out.println("|| => Ingrese la direccion: ");
                String direccion= entrada_texto.nextLine();

                System.out.println("|| => Ingrese el telefono: ");
                String telefono= entrada_texto.nextLine();

                System.out.println("|| => Ingrese el email: ");
                String email= entrada_texto.nextLine();

                Persona temporal = new Persona(documento, nombres, apellidos, direccion, telefono, email);
                boolean valido = true;
                for (int i=0; i<pos_disponible; i++){
                    if (documento==arreglo[i].getDocumento()){
                        valido=false;
                        break;
                    }
                }
                if (valido){
                    arreglo[pos_disponible]=temporal;
                    pos_disponible++;
                    System.out.println(" ");
                    System.out.println("|| === REGISTRADO CON EXITO === ||");
                    System.out.println(" ");
                
                }else{
                   System.out.println(" ");
                   System.out.println("|| === EL DOCUMENTO YA EXISTE, NO SE PUEDE REGISTRAR. === ||");
                   System.out.println(" "); 
                }
                

            } else if (opcion==2){
                for (int i=0; i<pos_disponible; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarDatosPersonales();
                    }
                }

            } else if (opcion==3){
                for (int i=0; i<arreglo.length; i++){
                    for (int j=0; j<arreglo.length-1; j++){
                        if (arreglo[j]!=null && arreglo[j+1]!=null){
                            
                            if (arreglo[j].getDocumento()>arreglo[j+1].getDocumento()){
                                Persona aux = arreglo[j];
                                arreglo[j]=arreglo[j+1];
                                arreglo[j+1]=aux;
                            }

                        }
                    }
                }

            } else if (opcion==4){
                System.out.println("|| ========= SALIENDO ========= ||");
            } else{
                System.out.println("||-------------------------------------||");
                System.out.println("|| ========= OPCION INVALIDA ========= ||");
                System.out.println("||-------------------------------------||");
            }

        } while(opcion!=4);
    }
}