//reversing linked list using iterative method
import java.util.*;
 
class LL {
    Node head ;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data =data;
                this.next=next;
            }
        }
            void addFirst(int data){
                Node newnode =new Node(data);
             
                newnode.next=head;
                head = newnode;
                }
            void printList(){
                Node currnode =head;
                while(currnode !=null){
                    System.out.print(currnode.data);
                   currnode = currnode.next;
                }
 System.out.print("null");
            }
            void reverseList(){
                if(head==null || head.next==null){
                    return;
                }
                
                Node previousnode=head;
                Node currnode=head.next;
                while(currnode !=null){
                   Node nextnode = currnode.next;
                   currnode.next=previousnode;
                //update
                previousnode =currnode;
                currnode=nextnode;
            }
            head.next=null;
            head=previousnode;
            }
            
            
   public static void main(String args[]) {
       LL list = new LL();
       list.addFirst(1);
        list.addFirst(2);
         list.addFirst(3);
          list.addFirst(4);
          list.printList();
          list.reverseList();
          list.printList();
   }
   }
//reversing using collection framework 
class LL {
     public static void main(String args[]) {

LinkedList ll =new LinkedList();
ll.add(0);
ll.add(1);
ll.add(2);
ll.add(3);

//System.out.print(ll);
for(int i=3;i>=0;i--){
  System.out.print(ll.get(i));  
}
System.out.print("null");
}
}
  
