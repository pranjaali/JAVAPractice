import java.util.*;
public class Main{
  class MyGeneric<T1>{
     int val;
     private T1 t1;
     public MyGeneric(int val12,T1 t12)
     {
       t1=t12;
       val=val12;
     }
     public int getVal() {
         return val;
     }
     public T1 gett1()
     {
       return t1;
     }
  }
  public static void main(String[] args)
  {
    MyGeneric<String> g1=new MyGeneric<String>(2, "sdb");
  }
}