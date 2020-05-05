//Armando Galan-Cedeño  Assignment7
//CS121 Spring 2020
//May 1, 2020
//Purpose: Program with more than one class

package commtest;
import javax.swing.JOptionPane;

public class CommTest {

    public static void main(String[] args) {        //main method
        
        //declaring and initializing variables
        int soldItems; 
        int paycheckCount = 1;
        double itemsCost, wklyPaycheck;
        String firstName, lastName, printOut; 
        
        //while loop to calculate only two checks 
        while(paycheckCount <= 2)
        {
            //prompting and reading user input
            firstName = JOptionPane.showInputDialog("Please enter your first "
                + "name:");
            lastName = JOptionPane.showInputDialog("Please enter your last "
                + "name:");
            soldItems = Integer.parseInt(JOptionPane.showInputDialog("Please enter "
                + "the number of items sold:"));
                
                //while loop for input validation
                while (soldItems < 0 || soldItems > 500)
                {
                    soldItems = Integer.parseInt(JOptionPane.showInputDialog("Invalid "
                        + "input: The number of items sold must be a positive number "
                        + "and should not exceed the quantity of 500."));
                }

            itemsCost = Double.parseDouble(JOptionPane.showInputDialog("Please enter "
                + "the price of the item(s):"));
            
            //creating a CommPay object and assigning it to "data"
            CommPay data = new CommPay();
            
            //calling methods from "CommPay" class
            data.setValues(firstName, lastName, soldItems, itemsCost);
            data.WklyPaycheck();
            wklyPaycheck = data.getWklyPaycheck();
            
            //printing out the results 
            printOut = String.format("The weekly paycheck amount for employee %s %s "
                + "is $%.2f.", firstName, lastName, wklyPaycheck);
            JOptionPane.showMessageDialog(null, printOut);
            
            //counter 
            paycheckCount = paycheckCount + 1;
        }
    }   
}