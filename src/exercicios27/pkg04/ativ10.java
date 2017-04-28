/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios27.pkg04;

import javax.swing.JOptionPane;

/**
 *
 * @author Michelly Ponce
 */
public class ativ10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object[] cityObject = new Object[5];
        String userCity;

	int count = 0;

	do {
            userCity = JOptionPane.showInputDialog(null, "Digite uma cidade");
            
            if (!userCity.equals("")) {
            cityObject[count] = userCity;
            System.out.println(cityObject[count]);
            count++;
            }
	} while (count < 5);

        Object showInputDialog;
        showInputDialog = JOptionPane.showInputDialog(null, "Escolha uma cidade", "Cidades", JOptionPane.INFORMATION_MESSAGE, null,
                cityObject, cityObject[0]);
    }
    
}
