/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package combolockdriver;

/**
 *
 * @author Hildana
 */
public class ComboLock {
    
    private int num1, num2, num3;
    
    //default constructor 
    ComboLock()
    {
      num1 = (int) (Math.random() * 3) + 1;;
      num2 = (int) (Math.random() * 3) + 1;;
      num3 = (int) (Math.random() * 3) + 1;;
    }
    
    //alternative constructor 
    ComboLock(int number1,int number2, int number3)
    {
        num1 = number1;
        num2 = number2;
        num3 = number3;
    }
    
    
    public void setComboLock(int numb1,int numb2, int numb3)
    {
      num1 = numb1;
      num2 = numb2;
      num3 = numb3;
    }
    
    
    public int getNum1()
    {
        return num1;
    }
    
    public int getNum2()
    {
        return num2;
    }
    
    public int getNum3()
    {
        return num3;
    }
    
    public String toString()
    {
        String output = "Number 1: " + num1 + "\n";
        output += "Number 2:" + num2 + "\n";
        output += "Number 3: " + num3 + "\n";
        
        return output;
     
    }
    
 
    
}
