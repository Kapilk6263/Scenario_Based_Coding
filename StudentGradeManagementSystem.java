import java.util.Scanner;

public class StudentGradeManagementSystem {
    public static void main(String[] args) {
    gradeManagement();
    }


    public static void gradeManagement(){
        
    Scanner kk=new Scanner(System.in);
    System.out.println("Enter number of students:");
    int student_number=kk.nextInt();

    for(int i=1;i<=student_number;i++){
        System.out.println("Enter name of student"+i);
        String name=kk.nextLine();
        System.out.println("Enter marks in 3 subjects:");
        int mark1=kk.nextInt();
        int mark2=kk.nextInt();
        int mark3=kk.nextInt();
       int total=mark1+mark2+mark3;
       int average=total/3; 

      String grade="";
       if(average>=90)
           grade="A";
      else if (average>=75 && average <90)
       grade="B";
      else if (average>=50 && average<75)
       grade="C";
        else if(average<50)
        grade="Fail";


    System.out.println("--- Student Details ---");
    System.out.println("Name: "+name +","+" Total :"+total+","+" Average"+ average+","+"Grade:"+grade);
    System.out.println("");
    }  
   



    }
}
