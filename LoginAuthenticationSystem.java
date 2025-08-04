import java.util.*;
public class LoginAuthenticationSystem {
    private static final String USERNAME="kapilff001";
    private static final String PASSWARD="Kapilk6#";


   public static boolean check(String user,String passward){
     return user.equals(USERNAME) && passward.equals(PASSWARD);
   }
    public static void login() 
    {   Scanner kk=new Scanner(System.in);
        int attempts=3;
      
     while(attempts>0)
    {
      System.out.println("Enter a username ");
      String userName=kk.nextLine();
      System.out.println("Enter passward " );
      String passward=kk.nextLine();
     
      if( check(userName, passward)){
         System.out.println("Login Successful");
         return;
      }else {
        attempts--;
        if(attempts>0){
              System.out.println("Invalid credentials " +attempts+ " attempts left .\n");
        }else {
            System.out.println("Account locked .try again letter");
        }
      }

    }
    }

   
   //main method 
   public static void main (String []args)
   {
    
    login();

   }
}