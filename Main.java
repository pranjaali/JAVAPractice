import java.util.*;
class Main{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int[] arr=new int[num];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++)
    {
       arr[i]=in.nextInt();
    }
    Solution s=new Solution();
    s.fun(arr);


  }
}
class Solution{
  public void fun(int[] arr)
  {
    int temp=0;
    for(int i=0;i<arr.length;i++)
    {
      // temp=arr[i-1];
      for(int j=i+1;j<arr.length;j++)
      {
        if(arr[i]>arr[j])
        {
          temp=arr[i];
          arr[i]=arr[j];
          arr[j]=temp;
        }
        Arrays.sort(arr);
        for(int k=0;k<arr.length;k++)
        {
          System.out.print(arr[k]);
        }
        System.out.println(" ");
       
      }
    }
  }
}