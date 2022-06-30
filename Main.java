import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        int[] arr={111,120,300,1260};
        int n=102;
        int sum=0;
        int[] brr=new int[arr.length];
        for(int j=0;j<arr.length;j++){
            brr[j]=fun(arr[j]);
        }
        for(int k=0;k<brr.length-1;k++)
        {
           sum=sum+brr[k];
        }
        if(sum==brr[brr.length-1])
        {
            System.out.print("YES");
        }
        else{
            System.out.println("NO");
        }

    }
    static int fun(int num)
    {
        int ans=0;
        List<Integer> list=new ArrayList<>();
        while(num>0)
        {
            if(num%10!=0)
            {
                list.add(num%10);
            }
            num=num/10;
        }
        for(int i=list.size()-1;i>=0;i--)
        {
            // System.out.print(" ("+list.get(i));
            ans=ans*10+list.get(i);
        }







     
        return ans;
    }
}