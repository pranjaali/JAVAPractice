import java.util.*;
public class Main{
   static class MyStack {
    static Queue<Integer>q1;
    static Queue<Integer>q2;
    Integer top;
       MyStack() {
           q1=new LinkedList<>();
           q2=new LinkedList<>();
           
       }
       
       public void push(int x) {
           q1.add(x);
           top=x;
       }
       
       public int pop() {
           int l=q1.size()-1;
           Integer t=0;
           while(q2.size()!=l)
           {
            //    System.out.println(q1+" "+q2);
               top=q1.poll();
               q2.add(top);
           }
           t=q1.poll();
           while(q1.size()!=l)
           {
               q1.add(q2.poll());
            //    top=q2.peek();
           }


           return t;
           
       }
       
       public int top() {
           return top;
       }
       
       public boolean empty() {
         return q1.isEmpty();  
       }
   }
    public static void main(String[] ags){
     MyStack s=new MyStack();
     System.out.println(s.empty());
     s.push(1);
     s.push(3);
     s.push(4);
     s.push(9);
     s.pop();
     s.push(7);
     s.push(8);
      System.out.println(s.pop()+" top:"+s.top()+" "+s.empty());
    // Queue<Integer>p=new LinkedList<>();
    // p.add(1);
    // p.add(2);
    // p.add(3);
    // Queue<Integer>a=new LinkedList<>();
    // a.add(p.poll());
    // a.add(p.poll());
    // System.out.println(p.size()+" "+a.size());
    }
}