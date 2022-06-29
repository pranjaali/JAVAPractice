import java.util.List;
import java.util.Scanner;
public class Main{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int sizeArray=in.nextInt();
    int sizeSubArray=in.nextInt();
    
    int[] arr=new int[sizeArray];
    for (int i=0;i<sizeArray;i++)
    {
       arr[i]=in.nextInt();
    }
    int start=0;
    int end=0;
    int maxSum=0;
    int tempSum=0;
    while(end<sizeSubArray)
    {
      maxSum=maxSum+arr[end];
      // System.out.print(" ("+arr[end]+")");
      end++;
    }
    tempSum=maxSum;
    System.out.println(" ()="+maxSum);
    
    while(end<arr.length)
    {  
       tempSum=tempSum-arr[start]+arr[end];
      //  System.out.println(" =("+tempSum+"-"+arr[start]+"-"+arr[end]);
       if(maxSum<tempSum)
       {
         maxSum=tempSum;

        // System.out.println(" ="+maxSum);
       }
       end++;
       start++;

    }
    System.out.println("Max Sum SubArray ="+maxSum);
  }
}