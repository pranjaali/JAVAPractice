import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    int[] arr={90,0,3,4,2,55,7};
    // int temp=0;
   for(int i=0;i<arr.length-1;i++)
   {
     int smallestIndex=i;
     for(int j=i+1;j<arr.length;j++)
     {
         if(arr[smallestIndex]>arr[j])
         {
           smallestIndex=j;
         }
     }
    //  arr[smallestIndex]=arr[smallestIndex]^arr[i];
    //  arr[i]=arr[smallestIndex]^arr[i];
    //  arr[smallestIndex]=arr[smallestIndex]^arr[i];
     int temp=arr[smallestIndex];
     arr[smallestIndex]=arr[i];
     arr[i]=temp;
   }
    // printArray(arr);
    for(int j=0;j<arr.length;j++)
    {
      System.out.print(" "+arr[j]);
    }
  }
}
