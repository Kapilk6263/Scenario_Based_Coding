import java.util.*;
class AtmSimulationProgram{

    public static void main(String[] args) {
      
        atmOperations();
    }
    
    public static void atmOperations(){
    int account_balance=4000;
    Scanner kk=new Scanner(System.in);
     System.out.println("Enter number of transactions");
    int t=kk.nextInt();
   
 

    for(int i=1;i<=t;i++){ 
        System.out.println("1.Withdraw "+"\n"+"2. Deposit"+"\n"+"3.Check Balance"+"\n"+"4.Exit");
        System.out.println("Enter your choice ");
        int c=kk.nextInt();
        switch (c) {
            case 1: {
            System.out.println("Enter withdraw amount : ");
            int amount=kk.nextInt();
           if(amount>account_balance && amount<0){
            System.out.println("Insufficient Balance ");
           }else {
              account_balance-=amount;
              System.out.println("Amount withdrawn successfully.");
           }
                 break;
        }
          case 2: {
          System.out.println("Enter amount to deposit ");
          int damount=kk.nextInt();
          if(damount<0){
            System.out.println("Amount must pe posititve ");
          }else {
          account_balance+=damount;
          System.out.println("Amount Deposit successfully");
          }
          break;
          }
           case 3: { 
            System.out.println("Current balance "+account_balance);
            break;
           } 
            case 4: {
                System.out.println("Thank you for using our ATM");
                break;
            }
      

    }
}
    }
}



