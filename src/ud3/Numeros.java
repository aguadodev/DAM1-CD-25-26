package ud3;

public class Numeros {

    public static boolean ePrimo(int n) {
        if (n <= 1) 
            return true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 1)
                return false;
        }
        return true;
    }

}
