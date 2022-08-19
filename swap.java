import java.util.Scanner;
class swap
{
  public static void main(String[]args)
  {
    int a;
    int b;
    int t=5;
    Scanner swap = new Scanner(System.in);
    System.out.println(" enter the values of a and b");
    a=swap.nextInt();
    b=swap.nextInt();
    System.out.println("before swap:"+a+" "+b);
    t=a;
    a=b;
    b=t;
    System.out.println("after swap:"+a+" "+b);
    System.out.println();
  }
}