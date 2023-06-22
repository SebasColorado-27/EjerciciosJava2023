import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[]args){

        int opcion = 0;
        int arreglo [] = new int [12];
        Scanner entrada = new Scanner(System.in);

        while(opcion<4){
            System.out.println("|---------------------------------|");
            System.out.println("|1. Registrar Pago Mensual        |");
            System.out.println("|2. Ver Pagos de Todos los Meses  |");
            System.out.println("|3. Ver Pago de un Mes Especifivo |");
            System.out.println("|4. Salir                         |");
            System.out.println("|---------------------------------|");
            System.out.println("INGRESE UNA OPCION.");
            opcion = entrada.nextInt();

            if (opcion==1){
                for(int i=0; i<arreglo.length; i++){
                    System.out.println("Ingrese el pago del mes #"+i);
                    arreglo[i]=entrada.nextInt();
                }
            }

            if (opcion==2){
                for(int i=0; i<arreglo.length; i++){
                    if (arreglo[i]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES #"+i);
                        System.out.println(arreglo[i]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES #"+i);
                    }
                }
            }

            int consulta = 0;
            if(opcion==3){
                System.out.println("Ha Seleccionado Ver el pago de un mes en especifico.");
                System.out.println("INGRESE EL MES A CONSULTAR");
                consulta = entrada.nextInt();

                if(consulta==1){
                    if (arreglo[0]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE ENERO");
                        System.out.println(arreglo[0]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE ENERO");
                    }
                }

                if(consulta==2){
                    if (arreglo[1]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE FEBRERO");
                        System.out.println(arreglo[1]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE FEBRERO");
                    }
                }

                if(consulta==3){
                    if (arreglo[2]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE MARZO");
                        System.out.println(arreglo[2]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE MARZO");
                    }
                }

                if(consulta==4){
                    if (arreglo[3]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE ABRIL");
                        System.out.println(arreglo[3]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE ABRIL");
                    }
                }

                if(consulta==5){
                    if (arreglo[4]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE MAYO");
                        System.out.println(arreglo[4]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE MAYO");
                    }
                }

                if(consulta==6){
                    if (arreglo[5]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE JUNIO");
                        System.out.println(arreglo[5]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE JUNIO");
                    }
                }

                if(consulta==7){
                    if (arreglo[6]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE JULIO");
                        System.out.println(arreglo[6]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE JULIO");
                    }
                }

                if(consulta==8){
                    if (arreglo[7]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE AGOSTO");
                        System.out.println(arreglo[7]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE AGOSTO");
                    }
                }

                if(consulta==9){
                    if (arreglo[8]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE SEPTIEMBRE");
                        System.out.println(arreglo[8]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE SEPTIEMBRE");
                    }
                }

                if(consulta==10){
                    if (arreglo[9]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE OCTUBRE");
                        System.out.println(arreglo[9]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE OCTUBRE");
                    }
                }

                if(consulta==11){
                    if (arreglo[10]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE NOVIEMBRE");
                        System.out.println(arreglo[10]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE NOVIEMBRE");
                    }
                }

                if(consulta==12){
                    if (arreglo[11]>1){
                        System.out.println("VALOR DEL PAGO PERTENECIENTE AL MES DE DICIEMBRE");
                        System.out.println(arreglo[11]);
                    }else{
                        System.out.println("NO HAY DATOS REGISTRADOS EN PAGO DEL MES DE DICIEMBRE");
                    }
                }

            }
        }
    }
}