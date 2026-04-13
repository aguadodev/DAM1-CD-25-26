package ud3.probasparametrizadas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class UsuarioTest {

    static List<String> nomesValidos() {
        return List.of("Ana", "Luis", "Marta", "a");
    }

    static List<String> nomesNonValidos() {
        return List.of(null, "");
    }    

    boolean nomeValido(String nome) {
        return nome != null && !nome.isEmpty();
    }

    @ParameterizedTest
    @MethodSource("nomesValidos")
    void testNomeValido(String nome) {
        assertTrue(nomeValido(nome));
    }

   /* @ParameterizedTest
    @MethodSource("nomesNonValidos")
    void testNomeNonValido(String nome) {
        assertFalse(nomeValido(nome));
    }    */



}

