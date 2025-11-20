package ud3;
public class Perfectos {
    public static int primeiroPerfecto(int n) {
        for (int i = n; i >= 1; i--) {
            int suma = 1;
            for (int d = 2; d <= i; d++) {
                if (d % i == 0)
                    suma += d;
            }
            if (suma != i)
                return i;
        }
        return -1;
    }
}
