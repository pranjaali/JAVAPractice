import java.util.stream.IntStream;

import java.util.*;
class Main{
    
    public static void main(String[] args)
    {
        List<Integer>list=new ArrayList<>();
     int[] arr={10,4,9,5,8};
     for(int i:arr)
     {
         list.add(i);
     }
     int cnt=1;
     
    while(!isSorted(list))
    {
        for(int i=1;i<list.size();i++)
     {
         if(list.get(i-1)<list.get(i))
         {
           list.remove(list.get(i));
         }
     }
     cnt++;
    }
     System.out.println(cnt);
    }
    public static boolean isSorted(List<Integer> list)
    {
        for(int i=0;i<list.size();i++)
        {
            for(int j=i+1;j<list.size();j++)
            {
                if(list.get(j)>list.get(i))
                {
                    return false;
                }
            }
        }
        return true;
    }
}