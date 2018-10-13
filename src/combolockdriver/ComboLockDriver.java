/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;
import javax.swing.*;
/**
 *
 * @author Hildana
 */
public class ComboLockDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int num1, num2, num3;
        int combo1, combo2, combo3;
        int inputGuess1, inputGuess2, inputGuess3;
        int counter = 0;

        //promt user for combolock 
        num1 = Integer.parseInt(JOptionPane.showInputDialog ("Please input first number for your new combination"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog ("Please input second number for your new combination"));
        num3 = Integer.parseInt(JOptionPane.showInputDialog ("Please input third number for your new combination"));
        
        ComboLock comboLock1 = new ComboLock ();
        ComboLock comboLock2 = new ComboLock (num1, num2, num3);
        
        JOptionPane.showMessageDialog(null, "Your locker combination is: " + num1 + ", " + num2 + ", " + num3);
        
        comboLock2.setComboLock(num1, num2, num3);
        
        //prompt user to type in their combination 
        combo1 = Integer.parseInt(JOptionPane.showInputDialog ("Please type your first number combination"));
        combo2 = Integer.parseInt(JOptionPane.showInputDialog ("Please type your second number combination"));
        combo3 = Integer.parseInt(JOptionPane.showInputDialog ("Please type your third number combination"));
        
        //check if they entered the correct combination 
        if (combo1 == comboLock2.getNum1() && combo2 == comboLock2.getNum2() && combo3 == comboLock2.getNum3())
        {
          JOptionPane.showMessageDialog(null, "Your locker combination is correct");  
        } else {
          JOptionPane.showMessageDialog(null, "Your locker combination is incorrect\n" + "Please try again");  
        }
        
        //part 2: Guess combination
        JOptionPane.showMessageDialog(null, "Try to guess the locker combination (between 1 -3)"); 

        
        while (counter < 3)
        {
            inputGuess1 = Integer.parseInt(JOptionPane.showInputDialog ("Please type the first guessed number combination"));
            inputGuess2 = Integer.parseInt(JOptionPane.showInputDialog ("Please type the second guessed number combination"));
            inputGuess3 = Integer.parseInt(JOptionPane.showInputDialog ("Please type the third guessed number combination"));
            counter++;
                if (counter <= 3 && inputGuess1 == comboLock1.getNum1() && inputGuess2 == comboLock1.getNum2() && inputGuess3 == comboLock1.getNum3() )
                {
                    JOptionPane.showMessageDialog(null, "You guessed correctly");
                }
                if (counter >= 3) 
                {
                    JOptionPane.showMessageDialog(null, "You did not guess correctly\n" + "The locker combination is: "
                    + comboLock1.getNum1() + ", " +comboLock1.getNum2() + ", " + comboLock1.getNum3());
                } 
             }
        }
    }
