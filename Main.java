import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner in=new Scanner(System.in);
          List<Integer> list=new ArrayList<>();
        int[] arr={1,2,3,4,5,6};
        int s=0;
        int e=0;
        int sum=0;
        int k=in.nextInt();
        while(k<arr.length)
        {
            s=0;
            sum=0;
            e=0;

            while(e<k)
            {
                sum+=arr[e++];
            }
            list.add(sum);
           System.out.println(" "+e);

            while(e<arr.length)
            {
                sum+=arr[e++]-arr[s++];
                list.add(sum);

            }

            k++;
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}