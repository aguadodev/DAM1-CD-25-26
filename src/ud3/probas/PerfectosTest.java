package ud3.probas;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PerfectosTest {

    @Test
    void testPerfectos() {
        assertEquals(6, Perfectos.primeiroPerfecto(10));
        assertEquals(28, Perfectos.primeiroPerfecto(30));
        assertEquals(-1, Perfectos.primeiroPerfecto(5));
    }
}
