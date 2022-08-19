import java.util.Scanner;
class radius
  {
    public static void main(String[] args)
    {
     int r=13;
     double pi = 3.14, area;
      Scanner ra=new Scanner (System.in);
      System.out.println("Enter the radius of circle");
      r=ra.nextInt();
      area= pi * r * r;
     System.out.println(" The Area of Circle is"+area);
    }
  }
      