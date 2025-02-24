package testing;

import javabean.Modulo;

public class TestModulo {

    public static void main(String[] args){

       Modulo modulo = new Modulo();

        System.out.println("---Vamos a calcular el modulo---");
        System.out.println("Cálculo del módulo (residuo de una división entera): " + modulo.moduloResiduo(5,3));
        System.out.println("Cálculo del valor absoluto de un número: " + modulo.valorAbsoluto(-4));


    }




}
