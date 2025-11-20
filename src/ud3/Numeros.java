package ud3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class Numeros {

    public static boolean ePrimo(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    @Test
    void testEPrimo() {
        assertEquals(false, Numeros.ePrimo(0));
        assertFalse(Numeros.ePrimo(0));
        assertFalse(Numeros.ePrimo(1));
        assertTrue(Numeros.ePrimo(2));
        assertTrue(Numeros.ePrimo(3));
        assertFalse(Numeros.ePrimo(4));
        assertTrue(Numeros.ePrimo(5));
    }


}
