//adding two list

import java.util.*;

public class LL {

     Node head;
     Node tail;
     //int size;
     class Node {
         int value;
         Node next;

        public Node(int value) {
            this.value = value;
               
        }

       public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


   /* public LL() {
        this.size = 0;
    }*/
     

      //  size++;
    
    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
       // size += 1;
    }
    
    public static LL merge (LL first,LL second ){
        Node head1=first.head;
        Node head2=second.head;
        
        LL ans =new LL();
        while(head1!=null && head2!=null){
            if(head1.value<head2.value){
                ans.insertFirst(head1.value);
                head1=head1.next;
            }
            else{
                ans.insertFirst(head2.value);  
            }
        }
        while(head1 !=null){
            ans.insertFirst(head1.value);
            head1=head1.next;
        }
          while(head2 !=null){
            ans.insertFirst(head2.value);
            head2=head2.next;
    }
    return ans;
    }
     public static void main(String[] args) {
        LL first = new LL();
        LL second = new LL();

       
        first.insertFirst(5);
        first.insertFirst(4);
         first.insertFirst(3);
          first.insertFirst(2);
           first.insertFirst(1);
         first.display();

        second.insertFirst(9);
         second.insertFirst(8);
          second.insertFirst(7);
           second.insertFirst(6);
         second.display();
        
          LL T = LL.merge( first, second );
         T.display();
     }
}
