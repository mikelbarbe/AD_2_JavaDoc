package javabean;

/**
 * Esta clase Esta clase proporciona operaciones relacionadas con el módulo (residuo de una división) y el valor
 * absoluto.
 * - Cálculo del módulo (residuo de una división entera).
 * - Cálculo del valor absoluto de un número.
 * @author Juan Carlos Revueltas - GitHub: Jcrev95
 * @version 1.0
 */


public class Modulo {

    /**
     *  Cálculo del módulo (residuo de una división entera).
     * @param n1 Valor del primer numero entero (Dividendo).
     * @param n2 Valor del segundo numero entero (Divisor).
     * @return Devuelve la division entre dos numeros enteros.
     * @throws IllegalArgumentException cuando el denominador es igual a 0
     */

    public int moduloResiduo (int n1, int n2){
        if (n2 == 0)
            throw new IllegalArgumentException("El divisor no puede ser 0");
        else return n1 % n2;
    }

    /**
     * calculo del valor absoluto de un numero
     * @param n1 Valor del primer numero entero (Dividendo).
     * @return Devuelve el valor absoluto de n1.
     */
    public double valorAbsoluto(double n1){
        if (n1 >= 0)
            return n1;

        else return -n1;
    }


}