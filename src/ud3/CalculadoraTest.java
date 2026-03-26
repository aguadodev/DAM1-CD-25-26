package ud3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    @Test
    void testDivide() {
        Calculadora c = new Calculadora(6, 2);
        int resultado = c.divide();
        assertEquals(3, resultado);    }

    @Test
    void testMultiplica() {
        Calculadora c = new Calculadora(2, 3);
        int resultado = c.multiplica();
        assertEquals(6, resultado);    }

    @Test
    void testResta() {
        Calculadora c = new Calculadora(2, 3);
        int resultado = c.resta();
        assertEquals(-1, resultado);    }

    @Test
    void testSuma() {
        Calculadora c = new Calculadora(2, 3);
        int resultado = c.suma();
        assertEquals(5, resultado);
    }
}
