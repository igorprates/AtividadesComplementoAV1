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
public class ativ01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual é sua Idade: ");
        int idade = sc.nextInt();
        
        System.out.println("Qual é Seu nome: ");
        String nome = sc.next();
        
        System.out.println("Qual é seu peso: ");
        float peso = sc.nextFloat();
        
        System.out.println("Qual é o seu tipo sanguineo (Sem o + ou -) : ");
        String tiposangue = sc.next();
        
        System.out.println("Qual é sua data de aniversário: ");
        String data = sc.next();
        
        System.out.println("Qual é o numero do seu sapato: ");
        int tamsapato = sc.nextInt();
        
        System.out.println("Casado? (S/N)");
        String casado = sc.next();
        
       
        System.out.println("Seu nome: " + nome);
        
        System.out.println("Sua idade: " + idade);
        
        System.out.println("Data de aniversário: " + data);
        
        System.out.println("Tipo sanguíneo : " + tiposangue);
        
        System.out.println("Peso: " + peso + " KG");
        
        System.out.println("Numero sapato:" + tamsapato);
        
        System.out.println("Casado: " + casado);
    }
    
}
