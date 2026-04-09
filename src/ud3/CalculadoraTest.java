package ud3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    Calculadora c = null;

    @BeforeEach
    void iniciarCalculadora() {
        c = new Calculadora(6, 2);
    }

    @Test
    void testDivide() {
        int resultado = c.divide();
        assertEquals(3, resultado);    }

    @Test
    void testMultiplica() {
        int resultado = c.multiplica();
        assertEquals(12, resultado);    }

    @Test
    void testResta() {
        int resultado = c.resta();
        assertEquals(4, resultado);    }

    @Test
    void testSuma() {
        int resultado = c.suma();
        assertEquals(8, resultado);
    }
}
