/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema03 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[][] notasCualitativas = new String[3][3];
        double[][] notasCuantitativas = {{7.1, 8, 10}, {3, 7, 9}, {10, 9, 2.1}};

        /*
        Referencia para obtener el valor cualitativo de una nota numérica
        0 - 2.9   Insuficiente
        3 - 4.9   Regular
        5 - 7.9   Buena
        8 - 9.5   Muy Buena
        9.6 - 10  Sobresaliente  
         */
        double valor;
        for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                valor = notasCuantitativas[i][j];
                if (valor >= 0 && valor <= 2.9) {
                    notasCualitativas[i][j] = "Insuficiente";

                } else {
                    if (valor >= 3 && valor <= 4.9) {
                        notasCualitativas[i][j] = "Regular";

                    } else {
                        if (valor >= 5 && valor <= 7.9) {
                            notasCualitativas[i][j] = "Buena";

                        } else {
                            if (valor >= 8 && valor <= 9.5) {
                                notasCualitativas[i][j] = "Muy buena";

                            } else {
                                if (valor >= 9.6 && valor <= 10) {
                                    notasCualitativas[i][j] = "Sobresaliente";
                                }

                            }
                        }
                    }
                }

            }
        }
         for (int i = 0; i < notasCuantitativas.length; i++) {
            for (int j = 0; j < notasCuantitativas[i].length; j++) {
                System.out.printf("Nota: %.2f; con promedio cualitativo de: %s\n",
                       notasCuantitativas[i][j],
                       notasCualitativas[i][j]);
        
            }
         }
    }
}
