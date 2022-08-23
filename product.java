import java.util.Scanner;
class product
  {
    public static void main(String args[])
    {
      int pno;
      String pname;
      float pcost,pqty;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the product number:");
      pno=sc.nextInt();
      System.out.println("enter the product name:");
      pname=sc.next();
      System.out.println("enter the product cost:");
      pcost=sc.nextFloat();
      System.out.println("enter the product quantity:");
      pqty=sc.nextFloat();
      System.out.println("print the product number is "+pno);
      System.out.println("print the product name is "+pname);
      System.out.println("print the product cost is"+pcost);
      System.out.println("print the product quantityis"+pqty);
    }
  }

      
    
      
      
      
      
    
  