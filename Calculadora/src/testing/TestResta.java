package testing;

import javabean.Resta;

public class TestResta {
    public static void main(String[] args){
        Resta resta = new Resta();
        System.out.println("Resta de dos numeros reales: " + resta.restaDeNumerosReales(10.5,3.2));
        System.out.println("Resta de dos numeros enteros: " + resta.restaDeNumerosEnteros(10,5));
        System.out.println("Resta de tres numeros reales: " + resta.restaDeTresNumerosReales(10.5,3.2,1.1));
        System.out.println("Resta de numeros acumulados de 10: " + resta.restaAcumulado(10);

    }
}

