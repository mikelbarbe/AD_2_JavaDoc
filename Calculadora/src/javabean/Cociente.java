package javabean;

/**
 * Esta clase calcula la division entre diferentes valores:
 * - Division de dos numeros reales
 * - Division de dos numeros enteros
 * - Inverso de un numero real
 * - Raiz de un numero
 * @author Adolfo Martinez - GitHub: AdolMF
 * @version 1.0
 */
public class Cociente {

    /**
     * Division de dos numeros reales
     * @param n1 Valor del primer numero real (Dividendo).
     * @param n2 Valor del segundo numero real (Divisor).
     * @return Devuelve la division entre dos numeros reales.
     * @throws IllegalArgumentException cuando el denominador es igual a 0
     */
    public double cocienteReal(double n1, double n2){
        if (n2 == 0)
           throw new IllegalArgumentException("El divisor no puede ser 0");
        else return n1 / n2;
    }

    /**
     * Division de dos numeros enteros
     * @param n1 Valor del primer numero entero (Dividendo).
     * @param n2 Valor del segundo numero entero (Divisor).
     * @return Devuelve la division entre dos numeros enteros.
     * @throws IllegalArgumentException cuando el denominador es igual a 0
     */
    public int cocienteEntero(int n1, int n2){
        if (n2 == 0)
            throw new IllegalArgumentException("El divisor no puede ser 0");
        else return n1 / n2;
    }

    /**
     * Inverso de un numero real
     * @param n1 Valor del numero real.
     * @return Devuelve el inverso de un numero real.
     * @throws IllegalArgumentException cuando el denominador es igual a 0
     */
    public double cocienteInversion(double n1){
        if (n1 == 0)
            throw new IllegalArgumentException("El divisor no puede ser 0");
        else return 1 / n1;
    }

    /**
     * Raiz de un numero real
     * @param n1 Valor del numero real.
     * @return Devuelve la raiz cuadrada de un numero real.
     */
    public double cocienteRaiz(double n1){return Math.sqrt(n1);
    }
}



