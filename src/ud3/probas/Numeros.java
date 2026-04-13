package ud3.probas;

public class Numeros {

    public static boolean ePrimo(int n) {
        if (n <= 1) 
            return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

}
