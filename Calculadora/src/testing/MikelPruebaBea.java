package testing;
import javabean.Resta;


public class MikelPruebaBea {

    /**
     * Este testing prueba la clase de Resta realizada por bea.
     * Probaremos los metodos:
     * - Resta de dos numeros reales.
     * - Resta de tres numeros reales.
     * - Resta de dos numeros enteros.
     * - Resta de numeros acumulados de 10.
     */
    static Resta resta = new Resta();

    public static void main(String[] args) {
        dosReales();
        dosEnteros();
    }

    public static void dosReales () {
        double num1 = 1.2;
        double num2 = 2.1;

        System.out.println("Resta de dos numeros reales: " + resta.restaDeNumerosReales(num1,num2));
    }
    public static void dosEnteros () {
        int num1 = 1;
        int num2 = 2;

        System.out.println("Resta de dos numeros reales: " + resta.restaDeNumerosEnteros(num1,num2));
    }


    public static void tresReales (){
        double num1 = 1.2;
        double num2 = 2.1;
        double num3 = 3.3;

        System.out.println("Resta de tres numeros reales: " + resta.restaDeTresNumerosReales(num1,num2,num3));
    }

    public static void restaAcumulado () {
        double num1 = 1.2;

        System.out.println("Resta de dos numeros reales: " + resta.restaAcumulado(num1));
    }
}
