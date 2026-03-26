package ud3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testDivide() {
        fail("Prueba sin implementar");
    }

    @Test
    void testMultiplica() {
        fail("Prueba sin implementar");
    }

    @Test
    void testResta() {
        fail("Prueba sin implementar");
    }

    @Test
    void testSuma() {
        Calculadora c = new Calculadora(2, 3);
        int resultado = c.suma();
        assertEquals(5, resultado);
    }
}
