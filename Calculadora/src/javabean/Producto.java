package javabean;

    /**
     * Esta clase multiplica diferentes valores:
     * - Producto de dos numeros reales
     * - Producto de dos numeros enteros
     * - Producto de tres numeros reales
     * - Producto de una potencia
     *
     * @author Almudena García
     * @version 1.0
     */

    public class Producto {

        /**
         * Producto de dos numeros reales y te devuelve el resultado.
         * @param n1 Primer numero a multiplicar.
         * @param n2 Segundo numero a multiplicar.
         * @return Devuelve el prodcuto de los dos numeros reales.
         */
        public double prodReal(double n1, double n2){
            return n1 * n2;
        }

        /**
         * Producto de dos numeros enteros y te devuelve el resultado.
         * @param n1 Primer numero a multiplicar.
         * @param n2 Segundo numero a multiplicar.
         * @return Devuelve el prodcuto de los dos numeros enteros.
         */

        public int prodEntero(int n1, int n2){
            return n1 * n2;
        }

        /**
         * Producto de tres numeros reales y te devuelve el resultado.
         * @param n1 Primer numero a multiplicar.
         * @param n2 Segundo numero a multiplicar.
         * @param n3 Tercer numero a multiplicar.
         * @return Producto de los tres numeros.
         */

        public double prodTres(double n1, double n2, double n3){
            return n1 * n2 * n3;
        }

        /**
         * Producto de una potencia y te devuelve el resultado.
         * @param base La base de la potencia.
         * @param exponente El exponente al que se elevará la base.
         * @return El resultado de la potencia.
         */

        public double potencia(double base, int exponente){
            return Math.pow(base,exponente);
        }
    }



