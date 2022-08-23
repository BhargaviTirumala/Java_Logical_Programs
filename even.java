import java.util.Scanner;
class even
  {
    public static void main(String args[])
    {
      int num;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter a number:");
       num = sc.nextInt();
      if(num % 2 == 0)
      {
         System.out.println("Given number "+num+" is even");
      }
      else
      {
         System.out.println("Given number "+num+" isnoteven");
        
      }
    }
  }
        
         
      
      
      
      
      
    
    
  
  