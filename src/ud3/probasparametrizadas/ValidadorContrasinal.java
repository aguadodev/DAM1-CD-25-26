package ud3.probasparametrizadas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ValidadorContrasinal {
    boolean eValida(String password) {
        if (password == null || password.length() < 8) return false;
            return password.matches(".*\\d.*");
    }

    @ParameterizedTest  
    @CsvSource({
        "ksdjfgjasja2, true",
        "askjh, false",
        "123456789, true"
    })
    void testValida(String password, boolean resultadoEsperado) {
        assertEquals(resultadoEsperado, password);
    }

}
