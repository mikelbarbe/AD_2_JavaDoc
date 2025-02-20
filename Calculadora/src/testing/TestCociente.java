package testing;

import javabean.Cociente;

public class TestCociente {

    public static void main(String[] args){

        Cociente cociente = new Cociente();

        System.out.println("---A DIVIDIR---");
        System.out.println("Division de dos numeros reales: " + cociente.cocienteReal(3.12,123.4));
        System.out.println("Division de dos numeros enteros: " + cociente.cocienteEntero(9,3));
        System.out.println("Division de dos numeros reales: " + cociente.cocienteInversion(4));
        System.out.println("Division de dos numeros reales: " + cociente.cocienteRaiz(25));

    }




}
