import java.util.Scanner;
 class perimeter
   {
     public static void main(String[] args)
     {
       int perimeter;
       int l;
       int b;
       double ar;
       Scanner peri=new Scanner(System.in);
       System.out.println("enter length");
       l=peri.nextInt();
       System.out.println("enter breadth");
       b=peri.nextInt();
       ar=l+b;
       perimeter=2*(l+b);
       System.out.println("The area of rectangle is "+ar);
    System.out.println("The perimeter of rectangle is"+peri);
     }
   }