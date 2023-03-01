

import java.util.*;
 
class LL {
    Node head;
     class Node {
    String data ;
    Node next ;
    
     Node (String data){
        this.data= data;
        this.next = next ;
    }
    }
    //add first
     void addFirst(String data){
        Node newnode = new Node(data) ;
      
           newnode.next= head;
      head= newnode;
    }
    //add last
       void addLast(String data){
           Node newnode = new Node(data) ;
        if (head==null){
           newnode= head;
           return;
        }
        Node currnode =head;
        while(currnode.next !=null){
            currnode = currnode.next;
        }
        currnode.next =newnode;
      }
      // print list
     
       void printList(){
             Node currnode =head;
           if(head==null){
               System.out.print("list empty");
               return;
           }
          while(currnode !=null){
              System.out.println(currnode.data);
            currnode = currnode.next;
        }
       
         System.out.print("null");
       }
       //delete first
        void deleteFirst(){
             if(head==null){
               System.out.print("list empty");
               return;
           }
            head=head.next;
    }
    //delete last
          
   public static void main(String args[]) {
      LL list = new LL();
      list.addFirst("a ");
      list.addFirst("is ");
      list.printList();
      list.addLast("list");
      list.printList();
       list.addFirst("this ");
      list.printList();
      list.deleteFirst();
       list.printList();
   }
    }