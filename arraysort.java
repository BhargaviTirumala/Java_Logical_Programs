import java.util.Scanner;
class arraysort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int i,n,j,t;
      System.out.println("enter array size:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("enter elements to Array:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("before sorting elements in an array:");
      for(i=0;i<n;i++)
        {
          System.out.println("a["+i+"] is "+a[i]);
        }
       for(i=0;i<n-1;i++)
         {
           for(j=0;j<n-1-i;j++)
             {
               if(a[j]>a[j+1])
               {
                 t=a[j];
                 a[j]=a[j+1];
                 a[j+1]=t;
               }
             }
         }
      System.out.println("after sorting element is:");
      for(i=0;i<n;i++)
        {
          System.out.println("the a["+i+"] value is: "+a[i]);
        }
    }
  }