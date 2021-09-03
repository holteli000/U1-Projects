import javax.swing.JOptionPane;

public class Sales {




    public static void main(String[] args) {
     double Price;
     int quantity;
     double salesTax;
     double discount;

     Price = Integer.parseInt(JOptionPane.showInputDialog("What is the sale price?"));
     quantity = Integer.parseInt(JOptionPane.showInputDialog("What is the quantity"));
     salesTax = Integer.parseInt(JOptionPane.showInputDialog("What is the sales tax"));
     discount = Integer.parseInt(JOptionPane.showInputDialog("What is the discount"));


      double subtotal = Price * quantity;
      double taxTotal = subtotal * salesTax/100.00;
      double totalCost = subtotal + taxTotal;
      double discountedPrice = subtotal * ( subtotal - discount);

     JOptionPane.showMessageDialog(null, "subtotal "  + subtotal);
     JOptionPane.showMessageDialog(null,"discounted price " + discountedPrice);
     JOptionPane.showMessageDialog(null, "tax total "  + taxTotal);
     JOptionPane.showMessageDialog(null, "totalCost " + totalCost);

     System.exit(0);




    }
}
/*Write a program, using dialog boxes, which prompts the user to enter a quantity, price, discount(as an integer) and sales tax(as an integer).
    The program should output the subtotal, tax total and total cost. Output should have proper currency format and proper rounding.

    Hint: You can use \n inside a String literal to make a new line, helpful for the dialog box output.

    Example:

    What is the sale price?: 4.99
    What is the discount?: 10
    How many are you buying?: 5
    What is the sales tax?: 7

    Subtotal: $22.46
    Tax Total: $1.57
    Total Cost: $24.03
     */