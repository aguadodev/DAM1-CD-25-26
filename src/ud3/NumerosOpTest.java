package ud3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NumerosOpTest {

    @Test
    void testSumaDigitos() {
        assertEquals(6, NumerosOp.sumaDigitos(123));
        assertEquals(1, NumerosOp.sumaDigitos(1));
        assertEquals(10, NumerosOp.sumaDigitos(190));
        assertEquals(0, NumerosOp.sumaDigitos(0));
        assertEquals(1+9+8+1+3+2+7+5+3, NumerosOp.sumaDigitos(1981327530));
    }
}

