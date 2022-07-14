import java.util.*;
public class Main{

    static class Fun{
        List<Integer>list=new ArrayList<>();
        Fun(int[] arr)
        {
            for(int i=0;i<arr.length;i++)
            {
                list.add(arr[i]);
            }
            Collections.sort(list);
           System.out.println(list);

        }
        int fun(int i)
        {
            int nas=-1;
            if(i%2==0)
            {
              nas=  list.get(0);
            list.remove(0);
            }
            if(i%2!=0)
            {
                nas=list.get(list.size()-1);
                list.remove(list.size()-1);
            }
            return nas;
        }
    }









    public static void main(String[] args)
    {
        int[] arr={1,4,2,3,5,6,44,33};
        Fun s=new Fun(arr);
         for(int j=0;j<arr.length;j++)
         {
            System.out.println(s.fun(j)+"     "+s.list);
         }
      

    }
}