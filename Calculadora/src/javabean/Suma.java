package javabean;

/**
 * Esta clase suma diferentes valores:
 * - La suma de dos numeros enteros
 * - La suma de dos numeros reales
 * - La suma de tres numeros reales
 * @author Mikel Barberena - GitHub: mikelbarbe
 * @version 1.0
 */
public class Suma {

    /**
     * Suma dos numeros reales y te devuelve el resultado
     * @param n1 Valor del primer numero.
     * @param n2 Valor del segundo numero.
     * @return Devuelve la suma de los dos numeros reales.
     */
    public double sumaReal(double n1, double n2){
        return n1 + n2;
    }

    /**
     * Suma dos numeros enteros y te devuelve el resultado.
     * @param n1 El valor del primer numero.
     * @param n2 El valor del segundo numero.
     * @return El resultado de la suma.
     */
    public int sumaEntero(int n1, int n2){
        return n1 + n2;
    }

    /**
     * Suma tres numeros reales y te devuelve el resultado.
     * @param n1 Valor del primer numero.
     * @param n2 Valor del segundo numero.
     * @param n3 Valor del tercer numero.
     * @return Suma de los tres numeros.
     */
    public double sumaTres(double n1, double n2, double n3){
        return n1 + n2 + n3;
    }
}
