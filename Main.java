import java.util.*;

public class Main{
	public static int binary_Decimal(int[] arr)
	{
		int num=0;
         if(arr[0]==1)
		 {
            for(int i=0;i<arr.length;i++)
			{
				arr[i]=arr[i]^1;
			}
		     num=convert(	twoSComplement(arr));
			 num=-num;

		 }
		 else{
			 num=convert(arr);
		 }



		return num;
	}
	public static int[] twoSComplement(int[] arr)
	{
		int[] n=new int[arr.length];
		int carry=1;
         for(int i=arr.length-1;i>=0;i--)
		 {  
			if(arr[i] == 1 && carry == 1)  
			{  
				n[i] = 0;  
			}  
			else if(arr[i] == 0 && carry == 1)  
			{  
				n[i] = 1;  
				carry = 0;  
			}  
			else  
			{  
				n[i] = arr[i];  
			}  
		}  



		return n;
	}
	public static int convert(int[] arr)
	{
		int num=0;
		int j=0;
		for(int i=arr.length-1;i>=0;i--)
		{
           num+=arr[i]*power(j++);

		}

		return num;
	}
	public static int power(int num)
	{
		int n=1;
		int i=1;
		while(i<=num)
		{
			n*=2;
			i++;
		}
		return n;
	}
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int[] arr=new int[size];
	
		for(int i=0;i<size;i++)
		{
			arr[i]=in.nextInt();
		}
		System.out.println(binary_Decimal(arr));


	}
}