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
class Solution {
  public String interpret(String command) {
//          creating new object s to make a mutable string 
     StringBuilder S = new StringBuilder(command.length());
      int i=0;
      while(i<command.length()){
          if(command.charAt(i)=='G'){
              S.append('G');
              i++;
//                 checking for () or (al)
          }else if(command.charAt(i)=='('){
              if(command.charAt(i+1)=='a'){
                    S.append("al");
              i=i+4;
              
              }else{
                      S.append('o');
              i+=2; 
              }
         
          }
      }
      return S.toString();
  }
}
