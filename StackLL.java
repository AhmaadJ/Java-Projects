import java.util.LinkedList;

public class StackLL {
   
   Node front;
   
   public class Node {
      int data;   
      Node next;
       
      Node(int data, Node next)  {
         this.data = data;   
         this.next = next; 
      }
   }   
      
      public void addToFront(int data)   {
         Node n = new Node(data, front);
         front = n;
         
      } 
      
      public void print()   {
         Node ptr = front;
         while(ptr != null) {
            System.out.print(ptr.data); //+ " -> ");
            ptr = ptr.next;
         }
         System.out.println("\\");
      }
      
      public void removeFront()   {
         front = front.next;
      }     
           
      public static void main (String [] args) {
         StackLL list = new StackLL();
         list.addToFront(2);
         list.addToFront(4);
         list.addToFront(6);
         list.addToFront(8);
         
         System.out.print("Linked List: ");       
         list.print();
         
         list.removeFront();
         System.out.print("List Without Head: ");
         list.print();
         
      }
      
}   

/* push = addToFront()
   pop = removeToFront()  
   
   push - 2, 4, 6, 8
   remove 8
   print list
   
   print # at head
   print list */
   
   
   /* Debugger Code Below
   
   if (front != null) {
            System.out.println(front.data);
            }  */