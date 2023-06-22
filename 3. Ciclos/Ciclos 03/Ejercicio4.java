import java.util.Scanner;

public class Ejercicio4{
    public static void main (String[]args){

        Scanner entrada = new Scanner(System.in);
        System.out.println("|----------SELECTOR DE RUTAS---------|");
        System.out.println("|INFORMACION ADICIONAL:              |");
        System.out.println("|CONSUMO PROMEDIO DEL CAMION  12KM/LI|");
        System.out.println("|ALMACENAMIENTO DEL TANQUE       25GA|");
        System.out.println("|VALOR DE LA GASOLINA:         10.000|");
        System.out.println("|------------------------------------|");

        int valorgasolina = 10000;
        int kilometro=1000;

        System.out.println("SENOR USUARIO, INGRESE LA CIUDAD DE ORIGEN");
        int origen = entrada.nextInt();
        System.out.println("HA SELECCIONADO "+origen+"x");

        System.out.println("SENOR USUARIO, INGRESE LA CIUDAD DE DESTINO");
        int destino = entrada.nextInt();
        System.out.println("HA SELECCIONADO "+destino+"x");

        if(origen==1 && destino==1){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==1 && destino==2){
            int distanciarecorrido=38;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 38.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==3){
            int distanciarecorrido=39;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 39.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==4){
            int distanciarecorrido=67;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 67.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==5){
            int distanciarecorrido=58;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 58.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==6){
            int distanciarecorrido=24;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 24.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==7){
            int distanciarecorrido=35;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 35 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==8){
            int distanciarecorrido=88;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==9){
            int distanciarecorrido=55;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 55.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==10){
            int distanciarecorrido=65;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 65.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==11){
            int distanciarecorrido=26;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 26.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==12){
            int distanciarecorrido=77;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 77.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==13){
            int distanciarecorrido=76;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 76.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==14){
            int distanciarecorrido=15;
            System.out.println("CIUDAD DE ORIGEN; APIA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 15.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==1){
            int distanciarecorrido=39;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 39.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==2){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==2 && destino==3){
            int distanciarecorrido=56;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 56.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==4){
            int distanciarecorrido=52;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 52.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==5){
            int distanciarecorrido=76;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 76.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==6){
            int distanciarecorrido=13;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 13.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==7){
            int distanciarecorrido=18;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 18.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==8){
            int distanciarecorrido=72;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 72.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==9){
            int distanciarecorrido=73;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 73 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==10){
            int distanciarecorrido=49;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 49.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==11){
            int distanciarecorrido=64;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 64.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==12){
            int distanciarecorrido=94;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 94.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==13){
            int distanciarecorrido=61;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 61.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==14){
            int distanciarecorrido=38;
            System.out.println("CIUDAD DE ORIGEN; BALBOA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 38.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        //DIVISION//
        if(origen==3 && destino==1){
            int distanciarecorrido=39;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 39.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==2){
            int distanciarecorrido=56;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 56.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==3){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==3 && destino==4){
            int distanciarecorrido=74;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 74.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==5){
            int distanciarecorrido=25;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==6){
            int distanciarecorrido=71;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 71.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==7){
            int distanciarecorrido=40;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 40.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==8){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==9){
            int distanciarecorrido=16;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 16.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==10){
            int distanciarecorrido=71;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 71.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==11){
            int distanciarecorrido=65;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 65.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==12){
            int distanciarecorrido=52;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 52.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==13){
            int distanciarecorrido=83;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 83.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==3 && destino==14){
            int distanciarecorrido=71;
            System.out.println("CIUDAD DE ORIGEN; BELEN DE UMBRIA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 71.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==1){
            int distanciarecorrido=67;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 67.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==2){
            int distanciarecorrido=51;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 51.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==3){
            int distanciarecorrido=73;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 73.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==4){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==4 && destino==5){
            int distanciarecorrido=92;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 92.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==6){
            int distanciarecorrido=66;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 66.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==7){
            int distanciarecorrido=32;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 32.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==8){
            int distanciarecorrido=34;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 34.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==9){
            int distanciarecorrido=89;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 89.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==10){
            int distanciarecorrido=2;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 2.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==11){
            int distanciarecorrido=65;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 65.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==12){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==13){
            int distanciarecorrido=12;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 12.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==4 && destino==14){
            int distanciarecorrido=66;
            System.out.println("CIUDAD DE ORIGEN; DOSQUEBRADAS, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 66 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==1){
            int distanciarecorrido=58;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 58.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==2){
            int distanciarecorrido=76;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 76.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==3){
            int distanciarecorrido=25;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==4){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==5){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==5 && destino==6){
            int distanciarecorrido=91;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 91.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==7){
            int distanciarecorrido=60;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 60 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==8){
            int distanciarecorrido=98;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 98.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==9){
            int distanciarecorrido=25;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==10){
            int distanciarecorrido=90;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 90.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==11){
            int distanciarecorrido=84;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 84.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==12){
            int distanciarecorrido=22;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 22.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==13){
            int distanciarecorrido=85;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 85.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==5 && destino==14){
            int distanciarecorrido=73;
            System.out.println("CIUDAD DE ORIGEN; GUATICA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 73.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==1){
            int distanciarecorrido=24;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 24.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==2){
            int distanciarecorrido=13;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 13.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==3){
            int distanciarecorrido=71;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 71.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==4){
            int distanciarecorrido=67;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 67.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==5){
            int distanciarecorrido=91;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 91.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==6){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==6 && destino==7){
            int distanciarecorrido=33;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 33.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==8){
            int distanciarecorrido=87;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==9){
            int distanciarecorrido=88;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==10){
            int distanciarecorrido=64;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 64.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==11){
            int distanciarecorrido=49;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 49.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==12){
            int distanciarecorrido=110;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==13){
            int distanciarecorrido=76;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 76.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==6 && destino==14){
            int distanciarecorrido=22;
            System.out.println("CIUDAD DE ORIGEN; LA CELIA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 22.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==1){
            int distanciarecorrido=35;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 35 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==2){
            int distanciarecorrido=19;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 19 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==3){
            int distanciarecorrido=40;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 40.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==4){
            int distanciarecorrido=34;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 34 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==5){
            int distanciarecorrido=60;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 60 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==6){
            int distanciarecorrido=34;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 34 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==7 && destino==7){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==7 && destino==8){
            int distanciarecorrido=53;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 53.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==9){
            int distanciarecorrido=88;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==10){
            int distanciarecorrido=30;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 30.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==11){
            int distanciarecorrido=60;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 60 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==12){
            int distanciarecorrido=78;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 78.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==13){
            int distanciarecorrido=43;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 43 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==7 && destino==14){
            int distanciarecorrido=33;
            System.out.println("CIUDAD DE ORIGEN; LA VIRGINIA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 33.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==1){
            int distanciarecorrido=88;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==2){
            int distanciarecorrido=72;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 72 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==3){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==4){
            int distanciarecorrido=35;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 35.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==5){
            int distanciarecorrido=98;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 98.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==6){
            int distanciarecorrido=87;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==8 && destino==7){
            int distanciarecorrido=53;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 53 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==8){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==8 && destino==9){
            int distanciarecorrido=110;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==10){
            int distanciarecorrido=32;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 32.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==11){
            int distanciarecorrido=113;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 113 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==12){
            int distanciarecorrido=96;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 96.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==13){
            int distanciarecorrido=44;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 44.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==8 && destino==14){
            int distanciarecorrido=86;
            System.out.println("CIUDAD DE ORIGEN; MARSELLA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 86.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==1){
            int distanciarecorrido=55;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 55.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==2){
            int distanciarecorrido=73;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 73.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==3){
            int distanciarecorrido=16;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 16.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==4){
            int distanciarecorrido=90;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 90.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==5){
            int distanciarecorrido=25;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 25.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==6){
            int distanciarecorrido=88;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 88.1 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==9 && destino==7){
            int distanciarecorrido=57;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 57 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==8){
            int distanciarecorrido=110;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==9){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; MISTRATO.");
             System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==9 && destino==10){
            int distanciarecorrido=87;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==11){
            int distanciarecorrido=81;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 81.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==12){
            int distanciarecorrido=53;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 53.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==13){
            int distanciarecorrido=99;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 99.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==9 && destino==14){
            int distanciarecorrido=70;
            System.out.println("CIUDAD DE ORIGEN; MISTRATO, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 70.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==1){
            int distanciarecorrido=65;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 65.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==2){
            int distanciarecorrido=49;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 49.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==3){
            int distanciarecorrido=71;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 71.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==4){
            int distanciarecorrido=2400;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 2.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==5){
            int distanciarecorrido=90;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 90.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==6){
            int distanciarecorrido=64;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 64.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==10 && destino==7){
            int distanciarecorrido=30;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 30.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==8){
            int distanciarecorrido=30;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 30 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==9){
            int distanciarecorrido=87;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 87.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==10){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==10 && destino==11){
            int distanciarecorrido=90;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 90.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==12){
            int distanciarecorrido=95;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 95.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==13){
            int distanciarecorrido=14;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 14.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==10 && destino==14){
            int distanciarecorrido=64;
            System.out.println("CIUDAD DE ORIGEN; PEREIRA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 64.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==1){
            int distanciarecorrido=26;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 26.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==2){
            int distanciarecorrido=64;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 64.6 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==3){
            int distanciarecorrido=65;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 65.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==4){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==1 && destino==5){
            int distanciarecorrido=84;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 84.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==6){
            int distanciarecorrido=48;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 48.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==11 && destino==7){
            int distanciarecorrido=59;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 59.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==8){
            int distanciarecorrido=113;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 113 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==9){
            int distanciarecorrido=81;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 81.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==10){
            int distanciarecorrido=90;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 90.5 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==11){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==11 && destino==12){
            int distanciarecorrido=103;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 103 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==13){
            int distanciarecorrido=103;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 103 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==11 && destino==14){
            int distanciarecorrido=34;
            System.out.println("CIUDAD DE ORIGEN; PUEBLO RICO, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 34.3 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==1){
            int distanciarecorrido=77;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; APIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 77.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==2){
            int distanciarecorrido=94;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; BALBOA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 94.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==3){
            int distanciarecorrido=52;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; BELEN DE UMBRIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 52.4 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==4){
            int distanciarecorrido=91;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; DOSQUEBRADAS.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 91.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==5){
            int distanciarecorrido=22;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; GUATICA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 22.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==2 && destino==6){
            int distanciarecorrido=110;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; LA CELIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 110 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
            
        }

        if(origen==12 && destino==7){
            int distanciarecorrido=78;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; LA VIRGINIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 78.7 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==8){
            int distanciarecorrido=96;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; MARSELLA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 96.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==9){
            int distanciarecorrido=57;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; MISTRATO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 57.9 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==10){
            int distanciarecorrido=93;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; PEREIRA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 93.8 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==11){
            int distanciarecorrido=103;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; PUEBLO RICO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 103 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==12){
            int distanciarecorrido=5000;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; QUINCHIA.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 5 KILOMETROS");
            int costoviaticos = valorgasolina/distanciarecorrido;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos+" PESOS.");
        }

        if(origen==12 && destino==13){
            int distanciarecorrido=83;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; SANTA ROSA DE CABAL.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 83.2 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }

        if(origen==12 && destino==14){
            int distanciarecorrido=109;
            System.out.println("CIUDAD DE ORIGEN; QUINCHIA, CON DESTINO; SANTUARIO.");
            System.out.println("EL RECORRIDO TIENE UNA DISTANCIA DE 109 KILOMETROS");
            int costoviaticos = distanciarecorrido/12;
            System.out.println("EL VALOR DE LA GASOLINA POR EL RECORRIDO ES "+costoviaticos*10000+" PESOS.");
        }
    }
}