import java.util.*;
public class Main{
  public static void main(String[] args)
  {
    int[] nums={3,0,1};
     int num=missingNumber(nums);
     System.out.println(num);
  }
  static int missingNumber(int[] nums) {
    int ans=0;
    int[] ne=new int[nums.length+1];
    for(int i=0;i<nums.length;i++)
    {
        ne[nums[i]]=1;
    }
    for(int i=0;i<nums.length+1;i++)
    {
       if(ne[i]!=1)
       {
           return i;
       }
    }
    return nums.length;
}
}
