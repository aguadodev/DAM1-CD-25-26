package ud3.probasparametrizadas;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;


class UsuarioTest {

    // Método a probar
    boolean nomeValido(String nome) {
        return nome != null && !nome.isEmpty();
    }

    // Método para probas parametrizadas dinámicas
    static List<String> nomesValidos() {
        return List.of("Ana", "Luis", "Marta", "a");
    }

    /**
     * Proba con datos parametrizados usando un método como fonte de datos
     * @param nome
     */
    @ParameterizedTest
    @MethodSource("nomesValidos")
    void testNomeValido(String nome) {
        assertTrue(nomeValido(nome));
    }


    // Formas de probar valores nulos ou baleiros
    static String[] nomesNonValidos() {
        return new String[] {null, "", "   ", "%", "6"};
    } 

    @ParameterizedTest
    @MethodSource("nomesNonValidos")
    void testNomeNonValido(String nome) {
        assertFalse(nomeValido(nome));
    }

    // Anotación NullAndEmptySource
    @ParameterizedTest
    @NullAndEmptySource
    void testNomeNuloOuBaleiro(String nome) {
        assertFalse(nomeValido(nome));
    }  

     



}

