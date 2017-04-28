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
public class ativ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float media ;
        
        System.out.println("Qual é a primeira nota: ");
        float pnota = sc.nextFloat();
        
        System.out.println("Qual é a segunda nota ");
        float snota = sc.nextFloat();
        
        media = ((pnota+snota)/2);
        
        if (media >= 6){
            System.out.println("Aluno está aprovado !");
        }
        else{
            System.out.println("Aluno está reprovado !");
        }
        System.out.println("Sua média é : " + media);
    }
    
}
