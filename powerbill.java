import java.util.Scanner; 
class powerbill
  {
    public static void main(String args[])
    {
      float cno;
      String cname;
      float pmr,lmr;
      double bill;
      Scanner sc=new  Scanner(System.in);
      System.out.println("enter the consumer number:");
      cno=sc.nextFloat();
      System.out.println("enter the consumer name:");
      cname=sc.next();
      System.out.println("enter present month reading:");
      pmr=sc.nextFloat();
      System.out.println("enter last month reading:");
      lmr=sc.nextFloat();
      float u=3.80f;
      float tu;
      tu=pmr-lmr;
      bill=tu*+u;
      System.out.println("the given consumer no is :"+cno);
      System.out.println("the given consumer name is:"+cname);
      System.out.println("the present month reading is:"+pmr);
      System.out.println("the last month reading is:"+lmr);
      System.out.println("print bill is:"+bill);
    }
  }
      
      
      
      
      
    
  
    