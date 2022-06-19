import java.util.*;

public class Main{
  public static void main(String[] args)
  {
    int k=2;
    int[] arr={1,2,3,4,5,6,7};
    int start=0;
    int end=3;
    int s=end+1;
    int e=6;
    while(start<end)
    {
      arr[start]=arr[start]^arr[end];
      arr[end]=arr[start]^arr[end];
      arr[start]=arr[start]^arr[end];
      start++;
      end--;

    }
    while(s<e)
    {
      arr[s]=arr[s]^arr[e];
      arr[e]=arr[s]^arr[e];
      arr[s]=arr[s]^arr[e];
      s++;
      e--;

    }
    for(int i=0;i<arr.length;i++)
    {
      System.out.println(arr[i]);
    }
  }
}