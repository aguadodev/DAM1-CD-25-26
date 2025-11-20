package ud3;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContadorTest {

    @Test
    void testContarMultiplos() {
        assertEquals(3, Contador.contarMultiplos(10, 3)); // 3,6,9
        assertEquals(5, Contador.contarMultiplos(20, 4)); // 4,8,12,16,20
    }

    @Test
    void testNMenorQueDivisor() {
        assertEquals(0, Contador.contarMultiplos(3, 5));
    }
}
