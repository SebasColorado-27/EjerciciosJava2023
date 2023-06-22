import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de elementos del arreglo: ");
        int n = scanner.nextInt();
        
        int[] arreglo = new int[n];
        System.out.println("Ingrese los valores del arreglo:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemento " + (i+1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        
        System.out.print("Ingrese el número de movimientos (negativo para izquierda, positivo para derecha): ");
        int numMovimientos = scanner.nextInt();
        
        // Realizar los movimientos
        int[] nuevoArreglo = new int[n];
        for (int i = 0; i < n; i++) {
            int nuevaPosicion = i + numMovimientos;
            if (nuevaPosicion < 0) {
                nuevaPosicion += n;
            } else if (nuevaPosicion >= n) {
                nuevaPosicion -= n;
            }
            nuevoArreglo[nuevaPosicion] = arreglo[i];
        }
        
        System.out.println("El arreglo movido es:");
        for (int i = 0; i < n; i++) {
            System.out.print(nuevoArreglo[i] + " ");
        }
    }
}
