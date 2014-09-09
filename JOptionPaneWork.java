/**
 * Lab Assignment
 * Kevin's store receipt
 * @author: Eric Schenck
 * @author: Valerie Metzger-Smith
 * @author: Bertha Sanchez
 * Date: September 10 2012
 *
 * Problem Statement: Create a single item cash register. Use the scanner class
 * to get a product name and then the cost of the item and the quantity. 
 *
 * Overall Plan:
 * 1) define integers, double, constant
 * 2) prompt user for item to purchase, cost and quantity
 * 3) calculate formulas
 * 4) print out receipt
 */
//import scanner
//import formatter
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.JOptionPane;

public class JOptionPaneWork {
  
 
     //assigning constant to tax rate
     public static final double TAX = 0.0775;
     public static final double COUPON = 25.00;
     
     public static void main(String[] args)  {
     
     //declaring variables
    
   
    
        
     
        
        
        
        NumberFormat moneyFormatter = NumberFormat.getCurrencyInstance();
       
        NumberFormat moneyFormatter2 = 
           NumberFormat.getCurrencyInstance(Locale.FRANCE);
           
        DecimalFormat Formatter = new DecimalFormat("00.0%");  
        
        //prompt user for input
        String game = JOptionPane.showInputDialog(null, "Please enter the" 
         + " name of the product of which you want to buy...");
         
       
        
        String cost = JOptionPane.showInputDialog(null, "Now enter the cost of "
          + "that product");
        
        
        
        String qnty = JOptionPane.showInputDialog(null, "And how many "
                + "do you want?");
        
        
        
        String qnty2 = JOptionPane.showInputDialog(null, "How many $25 coupons"
         + " do you have?");
        
        
        
        double productCost = Double.parseDouble(cost);
        double productQnty = Double.parseDouble(qnty);
        double couponQnty = Double.parseDouble(qnty2);
        
        //calculate formulas
        
        
        double sbttl = productCost * productQnty;
        
        double sbttl2 = sbttl - COUPON;
        
        double ftax = sbttl2 * TAX;
        
        double ttl = ftax + sbttl2;
        
        double prct = COUPON / sbttl;
        
        String prct2 = Formatter.format(prct);
        
        String output;
        output = "                Kevin's Store                    \n";
        output = output + "-------------------------------------------------\n";
        output = output + "Quantity   Product                   Unit Cost   \n";
        output = output + "   " + productQnty;
        output = output + "          " + game;
        output = output + "                                "  
                + moneyFormatter.format(productCost);
        output = output + "                                                 \n";
        output = output + "                         Subtotal:";
        output = output + moneyFormatter.format(sbttl2);
        output = output + "\n                         Tax:"; 
        output = output + moneyFormatter.format(ftax);
        output = output + "\n                         Total:";
        output = output + moneyFormatter.format(ttl);
        output = output + "\nIf your French, then this cost...    ";
        output = output + moneyFormatter2.format(ttl);
        output = output + "                                                \n";
        output = output + "Savings:\n" + prct2;
        
        
       JOptionPane.showMessageDialog(null, output);
    
    }//end of main
}//end of class Lab
