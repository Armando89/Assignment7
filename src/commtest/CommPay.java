//Armando Galan-Cedeño  Assignment7
//CS121 Spring 2020
//May 1, 2020
//Purpose: Program with more than one class

package commtest;

public class CommPay {
    
    //instance variables(are automatically initiazed)
    private String firstName, lastName;
    private int itemsSold;
    private double itemsCost, wPaycheck, totalAmount, totalComm;
    private final double COMMISSION = .10;
    private final double BASE_PAY = 200;
    
    //setter(method) that sets user input in the objects 
    public void setValues(String firstName, String lastName, int itemsSold, double itemsCost)
    {
        //storing the input for each variable
        this.firstName = firstName;
        this.lastName = lastName;
        this.itemsSold = itemsSold;
        this.itemsCost = itemsCost;
    }
    
    public void WklyPaycheck()
    {
        totalAmount = (double)itemsSold * itemsCost;
        totalComm = totalAmount * COMMISSION;
        wPaycheck = totalComm + BASE_PAY;
    }
            
    //
    public double getWklyPaycheck()
    {
        return wPaycheck;
    }
}
