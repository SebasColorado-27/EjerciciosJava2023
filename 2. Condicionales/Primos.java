public class Primos {
    public static void main(String[]args) {
        
        int v[] = new int[n];
        int b = 1;
        for (int i = 0; i < v.length; i++) {
            while (i != n) {
                if (b % 2 != 0) {
                    v[i] = b;
                    i++;
                    b++;
                } else {
                    b++;
                }
            }

        }
        for (int i = 0; i < v.length; i++) {
            System.out.println("" + v[i]);
        }
    }
}