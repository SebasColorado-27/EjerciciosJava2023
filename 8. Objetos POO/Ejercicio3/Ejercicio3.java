import java.util.Scanner;

public class Ejercicio3{
    public static void main (String[]args){

        Scanner entrada_texto = new Scanner(System.in);
        Scanner entrada_numeros = new Scanner(System.in);
        int pos_disponible = 0;
        PersonaEJ3 arreglo [] = new PersonaEJ3[10];
        int opcion = 0;

        do{
            System.out.println(" ");
            System.out.println("||-----------------------------------||");
            System.out.println("||----------SECCION CLIENTES---------||");
            System.out.println("||-----------------------------------||");
            System.out.println("||            Clientes Registrados: "+pos_disponible+"||");
            System.out.println("||                                   ||");
            System.out.println("|| 1.Registrar Cliente.              ||");
            System.out.println("|| 2.Ver Clientes Registrados.       ||");
            System.out.println("|| 3.Modificar Informacion Clientes. ||");
            System.out.println("|| 4.Ver Informacion Cliente.        ||");
            System.out.println("|| 5.Eliminar Cliente.               ||");
            System.out.println("|| 6.Salir.                          ||");
            System.out.println("||-----------------------------------||");
            System.out.print("||=> Ingrese una Opcion: ");
            opcion = entrada_numeros.nextInt();

            if (opcion==1){
                System.out.println("|| => Ingrese el documento: ");
                int documento = entrada_numeros.nextInt();

                System.out.println("|| => Ingrese el nombre: ");
                String nombres = entrada_texto.nextLine();

                System.out.println("|| => Ingrese el apellido: ");
                String apellidos = entrada_texto.nextLine();

                System.out.println("|| => Ingrese el email: ");
                String email = entrada_texto.nextLine();

                PersonaEJ3 temporal = new PersonaEJ3(documento, nombres, apellidos, email);
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
                System.out.println(" ");
                System.out.println(" ==> LISTA CLIENTES REGISTRADOS:");
                for (int i=0; i<pos_disponible; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarDatosPersonales();
                    }
                }

            } else if (opcion==3){
                for (int i=0; i<pos_disponible; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarDatosPersonales();
                    }
                }
                System.out.println("Ingrese el numero de documento para realizar la modificacion");
                int buscarcedula = entrada_numeros.nextInt();
                for (int i=0; i<pos_disponible; i++){
                int atributo = 0;
                    if (buscarcedula==arreglo[i].getDocumento()){
                        System.out.println("La cedula ha sido localizada correctamente.");
                        while(atributo < 5){
                            System.out.println("Ingrese el atributo a modificar: ");
                            System.out.println(" ");
                            System.out.println("|------------------------|");
                            System.out.println("|1. Cedula               |");
                            System.out.println("|2. Nombres              |");
                            System.out.println("|3. Apellidos            |");
                            System.out.println("|4. Email                |");
                            System.out.println("|5. Salir                |");
                            System.out.println("|------------------------|");
                            System.out.println(" ");
                            atributo=entrada_numeros.nextInt();

                            // PersonaEJ3 temporal2 = new PersonaEJ3(newdocumento, newnombres, newapellidos, newemail);
                            if (atributo==1){
                                System.out.println("|| => Ingrese el nuevo documento: ");
                                // int newdocumento = entrada_numeros.nextInt();
                            }
                            if (atributo==2){
                                System.out.println("|| => Ingrese el nuevo nombre: ");
                                // String newnombres = entrada_texto.nextLine();
                            }
                            if (atributo==3){
                                System.out.println("|| => Ingrese el nuevo apellido: ");
                                // String newapellidos = entrada_texto.nextLine();
                            }
                            if (atributo==4){
                                System.out.println("|| => Ingrese el nuevo email: ");
                                // String newemail = entrada_texto.nextLine();
                            }
                            // arreglo[i]=temporal2;
                        }
                    } else if(buscarcedula!=arreglo[i].getDocumento()){
                        System.out.println("La cedula ingresada no se encuentra almacenada en las bases de datos.");
                    }

                }

            } else if(opcion==4){
                System.out.println(" ");
                System.out.println(" ==> LISTA CLIENTES REGISTRADOS:");
                for (int i=0; i<pos_disponible; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarDatosPersonales();
                    }
                }
                System.out.println(" ");
                System.out.println("Ingrese el numero de documento para realizar la busqueda");
                int buscarcedula = entrada_numeros.nextInt();
                for (int i=0; i<pos_disponible; i++){
                    if (buscarcedula==arreglo[i].getDocumento()){
                        System.out.println("La cedula ha sido localizada correctamente.");
                        System.out.println("Nombre Completo: "+arreglo[i].getNombres()+" "+arreglo[i].getApellidos());
                        System.out.println("Numero de Documento: "+arreglo[i].getDocumento());
                        System.out.println("Correo Electronico: "+arreglo[i].getEmail());
                    }
                }
            
            }else if(opcion==5){
                System.out.println(" ");
                System.out.println(" ==> LISTA CLIENTES REGISTRADOS:");
                for (int i=0; i<pos_disponible; i++){
                    if (arreglo[i]!=null){
                        arreglo[i].mostrarDatosPersonales();
                    }
                }
                System.out.println(" ");
                System.out.println("Ingrese el numero de documento para eliminar al cliente");
                int buscarcedula = entrada_numeros.nextInt();
                for (int i=0; i<pos_disponible; i++){
                    if (buscarcedula==arreglo[i].getDocumento()){
                        System.out.println("La cedula ha sido localizada correctamente.");
                        // arreglo[i].setNombres()="";
                        // arreglo[i].setDocumento()="";
                        // arreglo[i].setEmail()="";
                    }
                }
            } else if (opcion==6){
                System.out.println("|| ========= SALIENDO ========= ||");
            } else{
                System.out.println("||-------------------------------------||");
                System.out.println("|| ========= OPCION INVALIDA ========= ||");
                System.out.println("||-------------------------------------||");
            }

        } while(opcion!=6);
    }
}