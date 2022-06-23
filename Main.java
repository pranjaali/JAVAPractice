import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    int[] arr={3,1,0,3,4,2,55,7};
    int temp=0;
    int max=arr[0];
    int cnt=arr.length;
    int len=arr.length;
    for(int j=0;j<len-1;j++)
    {
      for(int i=0;i<len-1-j;i++)
      {
  
        if(arr[i]>arr[i+1])
        {
  
          temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;

          // len--;
        }
        max=arr[i];
        
      }
      
    }
    printArray(arr);
    // for(int j=0;j<arr.length;j++)
    // {
    //   System.out.print(" "+arr[j]);
    // }
  }
}
