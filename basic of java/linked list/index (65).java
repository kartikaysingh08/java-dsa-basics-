//removing duplicate 
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
     public void duplicate(){
        Node temp =head;
        while(temp.next!=null){
            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
            }
            else{
              temp=temp.next;
            }
        }
     }
     public static void main(String[] args) {
        LL first = new LL();
       // LL second = new LL();

        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(3);
         first.insertFirst(4);
          first.insertFirst(5);
           first.insertFirst(5);
         first.display();
        
          first.duplicate();
          first.display();
     }
}
