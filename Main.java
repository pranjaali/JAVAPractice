import java.util.*;
public class Main{
    public static void main(String[] args )
    {

        String s1 = "GFG";
        StringBuffer sb1 = new StringBuffer("GFG1");
        String s2 = sb1.toString();
        System.out.println(s1.equals(s2));
        // --------------------------------------
        String  s="hello";
        String  t="elloh";
        boolean ans=false;
        StringBuffer str=new StringBuffer(s);
     
        String b=str.toString();
       
        do
        {
            char a=str.charAt(0);
            for(int i=0;i<str.length()-1;i++)
            {
                str.setCharAt(i,str.charAt(i+1));
            }
            str.setCharAt(str.length()-1,a);
            // System.out.println(str);
            
            b=str.toString();
            if(b.equals(t))
            {
               ans=true;
            }
        }while(!s.equals(b));
          return ans;
    }
}