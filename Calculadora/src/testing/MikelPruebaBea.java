package testing;
import javabean.Resta;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.assertEquals;


public class MikelPruebaBea {

    /**
     * Este testing prueba la clase de Resta realizada por bea.
     * Probaremos los metodos:
     * - Resta de dos numeros reales.
     * - Resta de tres numeros reales.
     * - Resta de dos numeros enteros.
     * - Resta de numeros acumulados de 10.
     */

    Resta resta;

    @BeforeEach
    public void
    setup(){

        resta = new Resta();
    }

    @Test
    public void restaDeNumerosReales (){
        assertEquals(5.5,resta.restaDeNumerosReales(2.2,3.3),0.1);}

    @Test
    public void restaDeNumerosEnteros(){
        assertEquals(6,resta.restaDeNumerosEnteros(3,3),0.1);
    }

    @Test
    public void restaDeTresNumerosReales(){
        assertEquals(4.4,resta.restaDeTresNumerosReales(8.1,3,7),0.1);
    }

    @Test
    public void restaAcumulado(){
        assertEquals(-10,resta.restaAcumulado(10),0.1);
    }
}