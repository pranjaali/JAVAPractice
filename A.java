public abstract class A {
    public static void main(String[] args)
    {
        String[] str={"1,3,4,7,13","1,2,4,13,15"};
        String[] num;
        for(int i=0;i<str.length;i++)
        {
          num=str[i].split(",");
        }


        for(int i=0;i<num.length;i++)
        {
            System.out.print(" "+num[i]);
        }

        //   String s="1";
        //   int q=Integer.parseInt(s);
        //     int[] a={1,3,4};
        //    int[][] arr=new int[2][3];
        //    for(int i=0;i<arr.length;i++)
        //    {
               
        //     for(int j=0;j<arr[i].length;j++)
        //     {
        //             arr[i][j]=a[j];
        //     }
        //    }

        //    for(int i=0;i<arr.length;i++)
        //    {
        //        for(int j=0;j<arr[i].length;j++)
        //        {
        //            System.out.print(" "+arr[i][j]);
        //        }
        //        System.out.println(" ");
        //    }


            //  System.out.println(i+i);
        

       
    }
    
}
