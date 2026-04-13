package ud3.probasparametrizadas;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NumerosTest {

    boolean ePar(int numero) {
        return numero % 2 == 0;
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12})
    void testNumerosPares(int numero) {
        assertTrue(ePar(numero));
    }


}
