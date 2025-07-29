/*✅ Scenario: Online Shopping Cart System

A simple console-based shopping cart where:
👇 Requirements:

1.The system has a fixed price list of 3 items:
T-Shirt → ₹500
Jeans → ₹1200
Shoes → ₹2000

2.Ask the user how many items they want to buy.
3.For each item:
  Show the menu and ask for item choice and quantity.
  Calculate the cost for that item and add to total.

4.After all items are selected:
If total >= ₹5000 → apply 10% discount
If total >= ₹3000 → apply 5% discount
Else → no discount

5.Display:
Final bill (total before discount, discount applied, final amount) 
*/

import java.util.*;
public class OnlineShoppingCarSystem {
    public static void main(String[] args) 
    {
    runCart();

    }
    

  public static void runCart(){

    Scanner kk=new Scanner(System.in);
    System.out.println("Enter number of items to purchase: ");
    int number=kk.nextInt();

    double total=0;
    for(int i=1;i<=number;i++)
    { 
        displayMenu();
        System.out.println("Enter item"+i+"choice");
        int choice=kk.nextInt();
        System.out.println("enter quantity");
        int quantity=kk.nextInt();

      double price=getPrice(choice);
      if(price==0){
        System.out.println("Invalid item choice. Skipping this item.\n");
        continue;
      }
      double itemcost=price*quantity;
      total+=itemcost;


    }
    double discount=calculateDiscount(total);
    double finalAmount=total-discount;

    System.out.println("-------Final Bill-------");
    System.out.println("total before discount :"+total);
    System.out.println("discount applied "+discount);
    System.out.println("Final amount "+finalAmount);

    
} 
 

 static void displayMenu()
    {
        System.out.println("--- Available Items ---");
        System.out.println("1. T-Shirt - ₹500");
        System.out.println("2. Jeans   - ₹1200");
        System.out.println("3. Shoes   - ₹2000");
    }

 public static double getPrice(int choice)
 {
    switch(choice)
    {
        case 1:
             return 500;
        case 2: 
              return 1200;
         case 3:
             return 2000;
             default :
             return 0;
    }
 } 
 public static double calculateDiscount(double total)
 {
    if(total>=5000)
    {
        return total*0.10;

    }else if(total>=3000){
        return total*0.05;
    }else {
        return 0;
    }
 }

}