
package testing;
import javabean.Producto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BeaPruebaAlmudena {

    Producto producto;
    @BeforeEach
    void setUp() {
        producto = new Producto();
    }

    @Test
    public void testProductoReales() {

    //dos numeros positivos
    assertEquals(6.0, producto.prodReal(2.0, 3.0), 0.01);

    //Un numero positivo y otro negativo
    assertEquals(-6.0, producto.prodReal(2.0, -3.0), 0.01);

    //dos numero negativos
    assertEquals(0.06, producto.prodReal(-0.2, -0.3), 0.01);

    //multiplicacion por 0
    assertEquals(0.0, producto.prodReal(2.0, 0.0), 0.01);
    assertEquals(0.0, producto.prodReal(0.0, 3.0), 0.01);
}
    @Test
    public void testProductoEnteros(){
    Producto producto = new Producto();

    //dos numeros positivos
    assertEquals(8,producto.prodEntero(2,4));

    //Un numero positivo y otro negativo
    assertEquals(-8,producto.prodEntero(2,-4));

    //dos numero negativos
    assertEquals(8,producto.prodEntero(-2,-4));

    //multiplicacion por 0
    assertEquals(0,producto.prodEntero(2,0));
    assertEquals(0,producto.prodEntero(0,4));

}
@Test
    public void testProductoTresReales(){
    Producto producto = new Producto();

    //Tres numero positivos
    assertEquals(24.0,producto.prodTres(4.0, 3.0,2.0),0.01);

    //Tres numeros negativos
    assertEquals(-24.0,producto.prodTres(-4.0,-3.0,-2.0),0.01);

    //Positivo y negativo
    assertEquals(-24.0,producto.prodTres(4.0,-3.0,2.0),0.01);

    //Multiplicacion por 0
    assertEquals(0.0,producto.prodTres(4.0,0.00,2.0),0.01);
}
@Test
    public void testPotencia(){
    Producto producto = new Producto();

    //base positiva exponente positivo
    assertEquals(8.0, producto.potencia(2.0, 3), 0.01);

    // Base positiva y exponente negativo
    assertEquals(0.125, producto.potencia(2.0, -3), 0.01);

    // Exponente cero
    assertEquals(1.0, producto.potencia(2.0, 0), 0.01);


}
}
