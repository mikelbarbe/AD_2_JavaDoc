package testing;

import javabean.Cociente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class JcarlosPruebaAdol {
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
        assertEquals(0.8, cociente.cocienteReal(4, 5));
    }

    @Test
    void testCocienteRealDiv0() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteReal(4.0, 0));
    }

    /*
     * Tests cocienteEntero
     */

    @Test
    void testCocienteEntero() {
        assertEquals(3, cociente.cocienteEntero(6, 2));
    }

    @Test
    void testCocienteEnteroDiv0() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteEntero(-18, 0));
    }

    /*
     * Tests cocienteInversion
     */

    @Test
    void testCocienteInversion() {
        assertEquals(1.0 / 3.0, cociente.cocienteInversion(3));
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
        assertEquals(3.0, cociente.cocienteRaiz(9.0));
    }

    @Test
    void testCocienteRaizNeg() {
        assertThrows(IllegalArgumentException.class, () -> cociente.cocienteRaiz(-4));
    }
}