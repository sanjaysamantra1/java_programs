import java.util.*;

class StackDemo1 {
   public static void main(String args[]) {
   // creating stack
   Stack st = new Stack();

   //stack is empty?
   System.out.println("stack is empty? "+st.empty());

   // Inserting element  to stack
   st.push("hdfs");
   st.push("hive");
   st.push("pig");

   // stack elements
   System.out.println("Elements before remove: "+st);

   // removing top element
   System.out.println("Removed object is: "+st.pop());

   // elements after remove
   System.out.println("Elements after remove: "+st);

   //top element from stack
   System.out.println("Last/Top Element : "+st.peek());

   System.out.println("Elements after Peek: "+st);
   System.out.println("Element at index 1: "+st.get(1));
   }
}