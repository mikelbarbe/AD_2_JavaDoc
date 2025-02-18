package testing;
import javabean.Suma;

public class Test {
    public static void main(String[] args) {

        Suma suma = new Suma();
        System.out.println("---A SUMAR---");
        System.out.println("Suma de dos numeros enteros: " + suma.sumaEntero(2,4));
        System.out.println("Suma de dos numeros reales: " + suma.sumaReal(1.2,3.2));
        System.out.println("Suma de tres numeros reales: " + suma.sumaTres(2.3,7.3,2.1));
    }
}