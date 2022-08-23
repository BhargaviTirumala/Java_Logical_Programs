import java.util.Scanner;
class student
  {
    public static void main(String args[])
    {
      float sno;
      String sname;
      float sub1,sub2,sub3;
      Scanner sc= new Scanner(System.in);
      System.out.println("enter the student number:");
      sno=sc.nextFloat();
      System.out.println("enter the student name:");
      sname=sc.next();
      System.out.println("enter the student sub 1 marks:");
      sub1=sc.nextFloat();
      System.out.println("enter the student sub2 marks:");
      sub2=sc.nextFloat();
      System.out.println("enter the student sub3 marks:");
      sub3=sc.nextFloat();
      Float total=sub1+sub2+sub3;
      double avg=(total/3);
      System.out.println("print student number is "+sno);
      System.out.println("print student name is "+sname);
      System.out.println("print subject 1 marks is "+sub1);
      System.out.println("print subject 2 marks is "+sub2);
      System.out.println("print subject 3 marks is "+sub3);
      System.out.println("total marks of student is "+total);
      System.out.println("total average of student is "+avg);
      
    }
  }
      
      
    
  
