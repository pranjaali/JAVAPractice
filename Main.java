// Java program to merge two sorted arrays
import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{

	public static void mergeArrays(int[] arr1, int[] arr2, int n1,
								int n2, int[] arr3)
	{
		int i = 0, j = 0, k = 0;
		while (i<n1 && j <n2)
		{
		
			if (arr1[i] < arr2[j])
				arr3[k++] = arr1[i++];
			else
				arr3[k++] = arr2[j++];
		}
		while (i < n1)
			arr3[k++] = arr1[i++];
	
		
		while (j < n2)
			arr3[k++] = arr2[j++];
	}
	
	public static void main (String[] args)
	{
    String[] str={"1,3,4,7,13","1,2,4,13,15"};
    String[] inputNumber =  str[0].split(",");
    int arr1 []= new int[inputNumber.length];
   
      for(int i=0; i<inputNumber.length;i++){
            arr1[i]=Integer.parseInt(inputNumber[i]);
      }

String[] inputNumber1 =  str[0].split(",");
    int arr2 []= new int[inputNumber.length];
    
      for(int i=0; i<inputNumber1.length;i++){
            arr2[i]=Integer.parseInt(inputNumber1[i]);
      }

	
		int n1 = arr1.length;
	
		int n2 = arr2.length;
	
		int[] arr3 = new int[n1+n2];
		
		mergeArrays(arr1, arr2, n1, n2, arr3);
	
		System.out.println("Array after merging");
		for (int i=0; i < n1+n2; i++)
			System.out.print(arr3[i] + " ");
	}
}

/* This code is contributed by Mr. Somesh Awasthi */
