//practice of exception handling 

import java.util.*;

public class MoneyWithdrawal { 
    static double account_balance=20000;
    //static Scanner kk=new Scanner(System.in); 

    public static void main(String[] args) {
    Scanner kk=new Scanner(System.in);
    System.out.println("Enter amount you want to withdraw ");
    double withdrawal_amount=kk.nextDouble();

  //exception handling 
    try{
     if(withdrawal_amount>account_balance){
        throw new ArithmeticException("insufficient Balance");
     }
    account_balance-=withdrawal_amount;
    System.out.println("Amount withdrawal Succesfully");
    } 
    catch(ArithmeticException e1){
        System.out.println(e1.getMessage());

    }
    checkBalance(kk);
}
    

  public static void checkBalance(Scanner kk){

    //for checking account balance 
    System.out.println("Check account balance: for Yes press 1, for No press 2 ");
    int choice=kk.nextInt();
    if(choice==1){
        System.out.println(account_balance);
    } 
    else {
        System.out.println("Thanks for using our Service");
    }
    
  }
}
