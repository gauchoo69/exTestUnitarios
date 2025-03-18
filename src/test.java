import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Test {

    @Test
    public void testCalcularLetraDNI() {
        assertEquals('T', Main.calcularLetraDNI("00000000"));
        assertEquals('R', Main.calcularLetraDNI("00000001"));
        assertEquals('W', Main.calcularLetraDNI("00000002"));
        assertEquals('A', Main.calcularLetraDNI("00000003"));
    }

    @Test
    public void testComprobarDNI() {
        assertTrue(Main.comprobarDNI("00000000", 'T'));
        assertFalse(Main.comprobarDNI("00000000", 'R'));
        assertTrue(Main.comprobarDNI("00000001", 'R'));
        assertFalse(Main.comprobarDNI("00000001", 'T'));
    }

    @Test
    public void testDNIInvalido() {
        assertThrows(NumberFormatException.class, () -> Main.calcularLetraDNI("ABCDEFGH"));
        assertThrows(NumberFormatException.class, () -> Main.calcularLetraDNI("1234ABCD"));
    }
}
.
