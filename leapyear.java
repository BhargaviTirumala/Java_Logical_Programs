import java.util.Scanner;
class leapyear
{
  public static void main(String args[])
  {
    int y;
    System.out.println("enter the year");
    Scanner sc =new Scanner(System.in);
    y=sc.nextInt();
    if(((y % 4 == 0) && (y%100!= 0)) ||(y%400==0))
      System.out.println("the year is leap year");
    else
      System.out.println("the year is not leap year");
    
  }
}