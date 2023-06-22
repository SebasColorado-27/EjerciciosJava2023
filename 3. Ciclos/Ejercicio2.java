import java.util.Scanner;

public class Ejercicio2{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        int valorgasolina = 10000;
        int kilometro=1000;
        int distanciarecorrido;
        int viaticos;
        int valorviaje;

        System.out.println("----------------------------------------");
        System.out.println("------------EMPRESA DE ENVIOS-----------");
        System.out.println("----------------------------------------");
        System.out.println("Valor de la gasolina: 10.000            ");
        System.out.println("Consumo de combustible:                 ");
        System.out.println("8 KM/LITRO                              ");
        System.out.println("----------------------------------------");
        System.out.println("LUGARES DISPONIBLES:                    ");
        System.out.println("1.GUATICA  /  2.LA CELIA  /  3.LA VIRGINIA");
        System.out.println("4.MARSELLA  /  5.MISTRATO");
        System.out.println(" ");

        System.out.println("SENOR USUARIO, INGRESE PUNTO DE PARTIDA");
        int partida = entrada.nextInt();
        System.out.println("AHORA, INGRESE EL DESTINO DEL VIAJE");
        int destino = entrada.nextInt();

        if (partida == 1 && destino == 1){
            distanciarecorrido=5000;
            System.out.println("PUNTO DE PARTIDA: GUATICA, CON DESTINO A: GUATICA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            viaticos = valorgasolina/distanciarecorrido;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        
        if (partida == 1 && destino == 2){
            distanciarecorrido=91;
            System.out.println("PUNTO DE PARTIDA: GUATICA, CON DESTINO A: LA CELIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 91.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje=viaticos*3000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 1 && destino == 3){
            distanciarecorrido=60;
            System.out.println("PUNTO DE PARTIDA: GUATICA, CON DESTINO A: LA VIRGINIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 60 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 1 && destino == 4){
            distanciarecorrido=98;
            System.out.println("PUNTO DE PARTIDA: GUATICA, CON DESTINO A: MARSELLA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 98,5 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 1 && destino == 5){
            distanciarecorrido=25;
            System.out.println("PUNTO DE PARTIDA: GUATICA, CON DESTINO A: MISTRATO");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        //Ciudad2
        if (partida == 2 && destino == 1){
            distanciarecorrido=91;
            System.out.println("PUNTO DE PARTIDA: LA CELIA, CON DESTINO A: GUATICA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 91.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje=viaticos*3000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        
        if (partida == 2 && destino == 2){
            distanciarecorrido=5000;
            System.out.println("PUNTO DE PARTIDA: LA CELIA, CON DESTINO A: LA CELIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            viaticos = valorgasolina/distanciarecorrido;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 2 && destino == 3){
            distanciarecorrido=33;
            System.out.println("PUNTO DE PARTIDA: LA CELIA, CON DESTINO A: LA VIRGINIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 33.9 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 2 && destino == 4){
            distanciarecorrido=87;
            System.out.println("PUNTO DE PARTIDA: LA CELIA, CON DESTINO A: MARSELLA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87.2 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 2 && destino == 5){
            distanciarecorrido=88;
            System.out.println("PUNTO DE PARTIDA: LA CELIA, CON DESTINO A: MISTRATO");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        //Ciudad3
        if (partida == 3 && destino == 1){
            distanciarecorrido=60;
            System.out.println("PUNTO DE PARTIDA: LA VIRGINIA, CON DESTINO A: GUATICA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 60 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje=viaticos*3000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        
        if (partida == 3 && destino == 2){
            distanciarecorrido=34;
            System.out.println("PUNTO DE PARTIDA: LA VIRGINIA, CON DESTINO A: LA CELIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 34 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 3 && destino == 3){
            distanciarecorrido=5000;
            System.out.println("PUNTO DE PARTIDA: LA VIRGINIA, CON DESTINO A: LA VIRGINIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            viaticos = valorgasolina/distanciarecorrido;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 3 && destino == 4){
            distanciarecorrido=53;
            System.out.println("PUNTO DE PARTIDA: LA VIRGINIA, CON DESTINO A: MARSELLA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 53.3 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 3 && destino == 5){
            distanciarecorrido=56;
            System.out.println("PUNTO DE PARTIDA: LA VIRGINIA, CON DESTINO A: MISTRATO");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 56.9 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        //Ciudad4
        if (partida == 4 && destino == 1){
            distanciarecorrido=98;
            System.out.println("PUNTO DE PARTIDA: MARSELLA, CON DESTINO A: GUATICA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 98.4 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje=viaticos*3000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        
        if (partida == 4 && destino == 2){
            distanciarecorrido=87;
            System.out.println("PUNTO DE PARTIDA: MARSELLA, CON DESTINO A: LA CELIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 4 && destino == 3){
            distanciarecorrido=53;
            System.out.println("PUNTO DE PARTIDA: MARSELLA, CON DESTINO A: LA VIRGINIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 53 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 4 && destino == 4){
            distanciarecorrido=5000;
            System.out.println("PUNTO DE PARTIDA: MARSELLA, CON DESTINO A: MARSELLA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            viaticos = valorgasolina/distanciarecorrido;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 4 && destino == 5){
            distanciarecorrido=110;
            System.out.println("PUNTO DE PARTIDA: MARSELLA, CON DESTINO A: MISTRATO");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        //Ciudad5
        if (partida == 5 && destino == 1){
            distanciarecorrido=25;
            System.out.println("PUNTO DE PARTIDA: MISTRATO, CON DESTINO A: GUATICA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje=viaticos*3000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        
        if (partida == 5 && destino == 2){
            distanciarecorrido=88;
            System.out.println("PUNTO DE PARTIDA: MISTRATO, CON DESTINO A: LA CELIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88.1 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 5 && destino == 3){
            distanciarecorrido=57;
            System.out.println("PUNTO DE PARTIDA: MISTRATO, CON DESTINO A: LA VIRGINIA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 57 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
        if (partida == 5 && destino == 4){
            distanciarecorrido=110;
            System.out.println("PUNTO DE PARTIDA: MISTRATO, CON DESTINO A: MARSELLA");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            viaticos = distanciarecorrido/8;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
            
        }
        if (partida == 5 && destino == 5){
            distanciarecorrido=5000;
            System.out.println("PUNTO DE PARTIDA: MISTRATO, CON DESTINO A: MISTRATO");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            viaticos = valorgasolina/distanciarecorrido;
            valorviaje = viaticos*8000;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+valorviaje+" PESOS.");
        }
    }
}