
//linked list using collection framework
import java.util.*;
 
class LL {
   public static void main(String args[]) {
       LinkedList<String> list= new LinkedList<String>();
      list.addFirst("kartik");
      list.addFirst("class");
       System.out.println(list);
       list.addLast("smart");
        System.out.println(list);
         System.out.println(list.size());
         //to print also traversing , can also search of element
         for(int i=0;i<list.size();i++){
             System.out.print(list.get(i));
         }
            System.out.print("null");
     list.removeFirst();
      System.out.print(list);
         list.removeLast();
      System.out.print(list);
      removing a certain value at ith index
      list.remove(2);
       System.out.print(list);
       list.addFirst(1,"zlatan");
       System.out.print(list);
}
}
// another method
LinkedList ll =new LinkedList();
ll.add(0 ,"deepak");
ll.add(1 ,"rahul");
System.out.print(ll);
}
}

