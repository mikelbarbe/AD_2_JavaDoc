package testing;

import javabean.Producto;

public class TestProducto {

    public static void main(String[] args){

        Producto producto = new Producto();

        System.out.println("---A MULTIPLICAR---");
        System.out.println("Producto de dos numeros enteros: " + producto.prodReal(4.0,4.2));
        System.out.println("Producto de dos numeros reales: " + producto.prodEntero(2,3));
        System.out.println("Producto de tres numeros reales: " + producto.prodTres(3.3,6.3,2.1));
        System.out.println("Potencia: " + producto.potencia(3.3,2));
    }




}
