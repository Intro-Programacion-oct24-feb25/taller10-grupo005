/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] notas = {{9, 10, 7, 8},
        {10, 5, 7, 9},
        {7, 9.4, 10, 9}};

        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "David Bell"};
        double[] promedios = new double[3];
        int fila;
        int columna;
        double suma = 0;

        for (fila = 0; fila < 3; fila++) {
            for (columna = 0; columna < 4; columna++) {
                suma = suma + notas[fila][columna];

            }
            promedios[fila] = suma / 4;
            suma = 0;
        }

        for (fila = 0; fila < 3; fila++) {
            System.out.printf("Estudiante: %s tiene un promedio de: %.2f\n",
                    estudiantes[fila],
                    promedios[fila]);

        }

    }

}
