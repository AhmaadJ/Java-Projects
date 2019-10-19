import java.util.Stack;

public class StackAL {
   public static void main (String [] args) {
      
      Stack<Integer> stacklist = new Stack<>();      
      
      stacklist.push(2);
      stacklist.push(4);
      stacklist.push(6);
      stacklist.push(8);
      
      System.out.println("Stack: " + stacklist);
      System.out.println("");
        
      // What is happening here?
      int topNum = stacklist.pop(); 
      System.out.println("Removing: " + topNum);
      System.out.println("New Stack: " + stacklist);
      System.out.println(); 
        
      // What is happening here?
      topNum = stacklist.peek();
      System.out.println("Top of stack: " + topNum);
      System.out.println("New Stack: " + stacklist);
        
   }
}   