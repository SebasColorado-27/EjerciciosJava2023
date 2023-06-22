import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = scanner.nextInt();
        int[] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor en posicion #" + i + ": ");
            vector[i] = scanner.nextInt();
        }

        int[] primos = new int[n];
        int[] noPrimos = new int[n];
        int numPrimos = 0;
        int numNoPrimos = 0;

        for (int i = 0; i < n; i++) {
            boolean esPrimo = true;
            for (int j = 2; j < vector[i]; j++) {
                if (vector[i] % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                primos[numPrimos] = vector[i];
                numPrimos++;
            } else {
                noPrimos[numNoPrimos] = vector[i];
                numNoPrimos++;
            }
        }

        System.out.print("Arreglo Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo Con Primos: ");
        for (int i = 0; i < numPrimos; i++) {
            System.out.print(primos[i] + " ");
        }
        System.out.println("La longitud es: "+primos.length);
        System.out.println();

        System.out.print("Arreglo Con No Primos: ");
        for (int i = 0; i < numNoPrimos; i++) {
            System.out.print(noPrimos[i] + " ");
        }
        System.out.println("La longitud es: "+noPrimos.length);
        System.out.println();
    }
}
