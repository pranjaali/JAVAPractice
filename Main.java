import java.util.Scanner;

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

    int ans;
    ans=singleNumber(nums);
    System.out.println("["+ans+"]");

  }
  
  static public int singleNumber(int[] nums) {
    int ans=0;
   int cnt=0;
   int k=0;
  //  int[] arr=new int[size];
   if(nums.length==1)
   {
     ans=nums[0];
   }
   else if(nums.length>1)
   {
     for(int i=0;i<nums.length;i++)
     {
        k=k^(nums[i]);
     }
     ans=k;
    
   }
   return ans;
}
}