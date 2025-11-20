package ud3;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class NumerosTest {
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
