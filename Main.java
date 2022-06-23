import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    int[] arr={90,0,3,4,2,55,7};
     for(int i=1;i<arr.length;i++)
     {
       int j=i-1;
       int cur=arr[i];
       while(j>=0 && cur>arr[j])
       {
         arr[j+1]=arr[j];
         j--;
       }
       arr[j+1]=cur;
     }
    for(int j=0;j<arr.length;j++)
    {
      System.out.print(" "+arr[j]);
    }
  }
}
