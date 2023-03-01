//linked list has cycle or not

import java.util.*;


class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        x=val;
        next=null;
    }
}
class solution{
    public boolean hasCycle(ListNode head){
        ListNode fast = head;
        ListNode slow= head;
        while (slow!=null && fast!=null){
            fast = fast.next.next;
            slow =slow.next;
            if (fast==slow){
                return true ;
            }
        }
            return false;
        }
    }
