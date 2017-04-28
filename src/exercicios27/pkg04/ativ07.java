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
public class ativ07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float nota ;
	float total = 0;
	int quantidade = 0;
        
        
        do{
            System.out.println("Qual é a nota: ");
            
            nota = sc.nextFloat();
        
            if (nota != -1) {
		total += nota;
		quantidade++;
            }
            
        } while(nota != -1);
        
        float media = (total/quantidade);
        System.out.println("A sua média é " + media );

    }
    
}
