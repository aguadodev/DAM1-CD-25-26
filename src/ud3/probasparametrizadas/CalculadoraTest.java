package ud3.probasparametrizadas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest {

    int sumar(int a, int b) {
        return a + b;
    }

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "2, 3, 5",
        "10, 5, 15"
    })
    void testSuma(int a, int b, int resultadoEsperado) {
        assertEquals(resultadoEsperado, sumar(a, b));
    }
}

