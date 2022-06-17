import java.util.Scanner;

class Main{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int target=in.nextInt();
    int[] array={1,2,3,4,15,44,56};
    int ans=fun(array,0,array.length,target);
    System.out.print(ans);
  }
  static int fun(int[] array,int s,int e,int target)
  {
    if(s>e){
      return -1;
    }
    int m=s+(e-s)/2;
    if(array[m]==target)
    {
      return m;
    }
    if(array[m]>target)
    {
      return(fun(array,s,m-1,target));
    }
          return(fun(array,m+1,e,target));
    

  }
}