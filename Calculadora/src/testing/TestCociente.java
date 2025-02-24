package testing;

import javabean.Cociente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class TestCociente {
    private Cociente cociente;

    @BeforeEach
    void setUp() {
        cociente = new Cociente();
    }


    /*
     * Tests cocienteReal
     */

    @Test
    void testCocienteReal() {
        assertEquals(3.12 / 123.4, cociente.cocienteReal(3.12, 123.4));
    }

    @Test
    void testCocienteRealDiv0() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteReal(5.0, 0));
    }

    /*
     * Tests cocienteEntero
     */

    @Test
    void testCocienteEntero() {
        assertEquals(3, cociente.cocienteEntero(9, 3));
    }

    @Test
    void testCocienteEnteroDiv0() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteEntero(10, 0));
    }

    /*
     * Tests cocienteInversion
     */

    @Test
    void testCocienteInversion() {
        assertEquals(1.0 / 4.0, cociente.cocienteInversion(4));
    }

    @Test
    void testCocienteInversionDiv0() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteInversion(0));
    }

    /*
     * Tests cocienteRaiz
     */

    @Test
    void testCocienteRaiz() {
        assertEquals(5.0, cociente.cocienteRaiz(25.0));
    }

    @Test
    void testCocienteRaizNeg() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteRaiz(-3));
    }
}