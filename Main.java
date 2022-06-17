import java.util.Scanner;
import java.util.Arrays;

class Main{
  public static void main(String []args)
  {
    Scanner in=new Scanner(System.in);
    int size=in.nextInt();
    int[] nums=new int[size];

    for(int i=0;i<size;i++)
    {
      nums[i]=in.nextInt();
    }

    int ans=0;
    int val=2;
    ans=fun(val);
    System.out.println("["+ans+"]");

  }
  
  static int fun(int nums) {
      int cnt=0;
      if(nums==0)
      {
        return 0;
      }
      if(nums==1)
      {
        return 1;
      }
      

      
      return (fun(nums-2)+fun(nums-1));
  }


}