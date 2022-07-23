import java.util.*;
public class Main{
	public static int count(int[] arr)
	{
		int cnt=0;
		String[] st=new String[arr.length];
		
		for(int i=0;i<st.length;i++)
		{
			st[i]=String.valueOf(decToBinary(arr[i]));
		}
		int max=0;
		int[] a=new int[32];
		for(int i=0;i<st.length;i++)
		{
			// System.out.println(st[i]);
     
			for(int j=0;j<st[i].length();j++)
			{
				Character ch=st[i].charAt(j);
				if(ch.compareTo('1')==0)
				{
					a[j]+=1;
				}

			}
		}
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}

		return max;
	}
	public static String decToBinary(int num)
	{
		String s="";
		while(num!=0)
		{
			// System.out.print((num%2));
			s+=String.valueOf(num%2);
			num=num/2;
		}
		
		return s;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		  int arr[]=new int[num];
		  for(int i=0;i<num;i++)
		  {
			  arr[i]=in.nextInt();
		  }
		  int o=count(arr);
        //  System.out.println(decToBinary(num));
		System.out.println(o);
	}
}