import java.util.Scanner;
class interest
  {
    public static void main(String[]args)
    {
      float p,r,t,i,ta;
      Scanner sc = new Scanner(System.in);
      System.out.println(" enter the value of p:");
      p=sc.nextFloat();
      System.out.println("enter the value of r:");
      r=sc.nextFloat();
      System.out.println("enter the value of t:");
      t=sc.nextFloat();
      i=(p*t*r)/100;
      ta=p+i;
      System.out.println("print the i:"+i);
      System.out.println("print the ta:"+ta);
      
      
        
      
      
    }
    
    
    
  }