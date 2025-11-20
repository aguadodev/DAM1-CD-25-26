package ud3;
public class Contador {
    public static int contarMultiplos(int n, int divisor) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (i % divisor == 0)
                count++;
        }
        return count;
    }
}
