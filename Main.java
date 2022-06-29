import java.util.List;
public class Main{
  public static void main(String[] args)
  {
    int[] arr={12,-1,-7,8,-16,30,16,28};
    int windowSize=3;
    int start=0;
    
    int end=0;
    end=windowSize-1;
    int firstNegative=0;
    int index=0;

    while(end<arr.length)
    {
      int cnt=start;
      aa: while(cnt<=end)
       {
         if(arr[cnt]<0)
         {
           firstNegative=arr[cnt];
           System.out.print(" :"+firstNegative);
           index=cnt;
           break aa;
         }
         cnt++;
       }
       start++;
       end++;
    }


  }
}