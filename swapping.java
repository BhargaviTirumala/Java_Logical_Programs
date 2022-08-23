import java.util.Scanner;
class swapping
  {
    public static void main(String[]args)
    {
      int a;
      int b;
      Scanner swapping =new Scanner(System.in);
      System.out.println("enter the value of a and b");
      a=swapping.nextInt();
      b=swapping.nextInt();
      System.out.println("before swapping:"+a+" "+b);
      a=a+b;
      b=a-b;
      a=a-b;
      System.out.println("ater swapping:"+a+" "+b);
    }
  }