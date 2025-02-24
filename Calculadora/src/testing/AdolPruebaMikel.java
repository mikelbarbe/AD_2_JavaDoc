package testing;

import javabean.Suma;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdolPruebaMikel {

    private Suma suma;

    @BeforeEach
    void setUp() {
        suma = new Suma();
    }

    /*
     * Tests sumaReal
     */

    @Test
    void testSumaReal() {
        assertEquals(5.5, suma.sumaReal(2.2, 3.3));
    }

    /*
     * Tests sumaEntero
     */

    @Test
    void testSumaEntero() {
        assertEquals(-10, suma.sumaEntero(0, -10));
    }

    /*
     * Tests sumaTres
     */

    @Test
    void testSumaTres() {
        assertEquals(7.5, suma.sumaTres(3.2, 4.3, 0.0));
    }
}
