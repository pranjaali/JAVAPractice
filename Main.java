import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Main{
  public static void main(String[] args)
  {
    System.out.print("Enter 2D array size : ");
    Scanner sc=new Scanner(System.in);
    // int rows=sc.nextInt();/
    int columns=sc.nextInt();
    
    System.out.println("Enter array elements : ");    
     
    int twoD[]=new int[columns];
     
       
               
         for(int j=0; j<columns;j++)
         {
             twoD[j]=sc.nextInt();
         }
      

      int ans=maxx(twoD);
      System.out.println(ans);
  }
  static int maxx(int[] candies)
  { 
    int[] arr=new int[candies.length];
    for(int i=0;i<candies.length;i++)
    {
      for(int j=0;j<candies.length;j++)
      {
        if(candies[i]>candies[j])
        {
          arr[i]++;
        }
      }
    }
    for(int i=0;i<candies.length;i++)
    {
      System.out.println("("+arr[i]+")");
    }

    return 1;
  }
}