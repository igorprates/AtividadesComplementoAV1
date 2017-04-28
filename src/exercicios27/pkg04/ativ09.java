/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios27.pkg04;

import java.util.Scanner;

/**
 *
 * @author Michelly Ponce
 */
public class ativ09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é o numero da matriz: ");
        int matriz = sc.nextInt();

        for (int i = 0; i < matriz + 1; i++) {

            for (int v = 0; v < matriz; v++) {
                System.out.println("|" + v + "|" + i + "|");
    }
        }  
}
}