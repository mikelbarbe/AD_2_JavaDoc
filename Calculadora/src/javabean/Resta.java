package javabean;

/**
 * Clase que realiza las operaciones de resta.
 * Esta clase resta diferentes valores:
 *  * - La resta de dos numeros reales
 *  * - La resta de tres numeros reales
 *  * - La resta con valor acumulado
 * Autor: Beatriz Waliño
 * GitHub: BeatrizWali
 */
public class Resta {
    //Creo una variable para el valor acumulado
    private double acum=0;

    /**
     * Metodo para restar dos numeros reales
     * @param num1 valor del primer número real
     * @param num2 valor del segundo número real
     * @return devuelve la resta de num1 y num2
     */

    public double restaDeNumerosReales(double num1, double num2){
        return num1-num2;
    }
    /**
     * Metodo para restar dos numeros enteros
     * @param num1 valor del primer número entero
     * @param num2 valor del segundo número entero
     * @return devuelve la resta de num1 y num2
     */
    public int restaDeNumerosEnteros(int num1,int num2){
        return num1-num2;
    }

    /**
     * Metodo para restar tres numeros reales
     * @param num1 valor del primer número real
     * @param num2 valor del segundo número real
     * @param num3 valor del tercer número real
     * @return devuelve la resta de num1,num2,num3
     */
    public double restaDeTresNumerosReales(double num1, double num2,double num3){
        return num1-num2-num3;
    }
    /**
     * Metodo para hacer la resta acumulada
     * @param num número que se restara del acumulado
     * @return devuelve el valor acumulado despues de realizar la resta
     */
    public double restaAcumulado(double num){
        acum-=num;
        return acum;
    }
}
