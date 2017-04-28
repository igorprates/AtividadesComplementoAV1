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
public class ativ12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float hipotenusa ;
        float rhipotenusa ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro cateto: ");
        float pcat = sc.nextFloat();
        
        System.out.println("Informe o primeiro cateto: ");
        float scat = sc.nextFloat();
        
        hipotenusa =  ((float) Math.pow(pcat, 2) + (float) Math.pow(scat, 2)) ;
        rhipotenusa = (float)Math.pow(hipotenusa, (1.0/2));
        
        System.out.println("O valor da hipotenusa é :" + rhipotenusa);
    }
    
}
