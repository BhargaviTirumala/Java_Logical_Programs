import java.util.Scanner;
class empruntime
  {
    public static void main(String[] args)
    {
      int eno;
      String ename;
      double esal;
      Scanner sc=new Scanner(System.in);

     System.out.println("The Given Employee number is ");
     eno=sc.nextInt();
     System.out.println("The Given Employee name is ");
     ename=sc.next();
     System.out.println("The Given Employee salary is ");
     esal=sc.nextDouble();
     System.out.println("The Given Employee number is "+eno);
     System.out.println("The Given Employee name is "+ename);
     System.out.println("The Given Employee salary is "+esal);
    }

  }
    
     
  