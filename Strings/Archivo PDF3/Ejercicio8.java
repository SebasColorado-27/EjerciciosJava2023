import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del arreglo: ");
        int n = scanner.nextInt();
        int [] vector = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor en posicion #" + i + ": ");
            vector[i] = scanner.nextInt();
        }

        int[] pares = new int[n];
        int[] impares = new int[n];
        int numPares = 0;
        int numImpares = 0;

        for (int i = 0; i < n; i++) {
            if (vector[i] % 2 == 0) {
                pares[numPares] = vector[i];
                numPares++;
            } else {
                impares[numImpares] = vector[i];
                numImpares++;
            }
        }

        System.out.print("Arreglo Original: ");
        for (int i = 0; i < n; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo Con Pares: ");
        for (int i = 0; i < numPares; i++) {
            System.out.print(pares[i] + " ");
        }
        System.out.println();

        System.out.print("Arreglo Con Impares: ");
        for (int i = 0; i < numImpares; i++) {
            System.out.print(impares[i] + " ");
        }
        System.out.println();
    }
}
