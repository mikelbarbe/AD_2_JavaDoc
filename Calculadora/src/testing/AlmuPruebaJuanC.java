package testing;

import static org.junit.jupiter.api.Assertions.*;

import javabean.Modulo;
import org.junit.jupiter.api.Test;

public class AlmuPruebaJuanC {

        private Modulo modulo = new Modulo();  // Crear una instancia de la clase Modulo

    /**
     * Test para el modulo residuo
     */
    @Test
        public void testModuloResiduo() {
            // Verifica que el residuo de 10 dividido por 3 sea 1
            assertEquals(1, modulo.moduloResiduo(10, 3));  // 10 % 3 = 1
        }
    /**
     *  Test para el valor absoluto
     */
        @Test
        public void testValorAbsoluto() {
            // Verifica que el valor absoluto de -5 sea 5
            assertEquals(5, modulo.valorAbsoluto(-5));  // Valor absoluto de -5 debe ser 5
        }
}
