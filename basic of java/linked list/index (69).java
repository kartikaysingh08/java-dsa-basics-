//middle element of linked list
  public ListNode middleNode(ListNode head){
      ListNode h1= head;
      ListNode h2 =head;
      while(h2!=null&&h2.next!=null){
          h1=h1.next;
          h2=h2.next.next;
      }
      return h1;
      }
       
