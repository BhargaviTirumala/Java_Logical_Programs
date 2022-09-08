import java.util.Scanner;
class array2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,sum=0;
      System.out.println("enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements to Array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("elements of the array:");
      for(i=0;i<n;i++)
        {
          System.out.println("a["+i+"] is "+a[i]);
        }
      for(i=0;i<n;i++)
        {
          sum=sum+a[i];
        }
       System.out.println("the sum of elements "+sum);
    }
  }