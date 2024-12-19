/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[][] ventas = new double[2][5];

        int filas;
        int columnas;
        double valor;
        double total = 0;

        for (filas = 0; filas < 2; filas++) {
            for (columnas = 0; columnas < 5; columnas++) {
                System.out.println(vendedores[filas]+" Ingrese ventas del dia "
                        + columnas);
                valor = entrada.nextDouble();

                ventas[filas][columnas] = valor;
                total = total + ventas[filas][columnas];

            }
        }
        for(filas = 0; filas<2; filas++){
            System.out.printf("Vendedor (a): %s\n", vendedores[filas]);
        
        }
         System.out.printf("Ha vendido un total de %.2f en ventas\n", total);

    }

}
