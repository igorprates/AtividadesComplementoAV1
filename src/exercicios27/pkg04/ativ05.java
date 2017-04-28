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
public class ativ05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double resultado = 0;
        System.out.println("Digite o primeiro numero: ");
        double pnumero = sc.nextDouble();
        
        System.out.println("Digite o operador: ");
        String op = sc.next();
        
        System.out.println("Digite o segundo numero: ");
        double snumero = sc.nextDouble();
        
        switch (op){
            case "+" :
                resultado = (pnumero + snumero);
                break;
            case "-":
                resultado = (pnumero - snumero);
                break;
            case "*":
                resultado = (pnumero * snumero);
                break;
            case "/":
                resultado = (pnumero / snumero);
                break;
        }
          System.out.println("O resultado é : " + resultado);
    }
    
}
