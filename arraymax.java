import java.util.Scanner;
class arraymax
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,max;
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
         max=a[0];
         for(i=0;i<n;i++)
           {
             if(max<a[i])
               max=a[i];
           }
      System.out.println("maximum value in array is:"+max);
    }
  }