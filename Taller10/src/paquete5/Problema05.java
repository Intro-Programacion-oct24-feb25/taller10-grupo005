/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };

        char letra;
        String letra2;
        String cadena = "";
        
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {

                letra = estudiantes[i][j].charAt(0);
                letra2 = String.valueOf(letra);
                if(letra2.equals("S")||letra2.equals("P")||letra2.equals("T")){
                   cadena = String.format("%s%s\n",cadena, estudiantes[i][j]);
                
                }

            }
        }
        System.out.printf("Estudiantes del arreglo con inicial: S,P,T:\n%s",
                cadena);
    }

}
