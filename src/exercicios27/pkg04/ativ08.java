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
public class ativ08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Informe o numero : ");
       int numero = sc.nextInt(); 
       
       String bin = Integer.toString(numero, 2);
       
       System.out.println("Seu numero em binario é : " + bin);
    }
    
}
