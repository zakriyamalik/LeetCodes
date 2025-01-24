package Recursion;


//Thinking process
// This was the first logic (trash)


//public class reOrderList {
//    int size=0;
//    int count1=0;
//    int count2=0;
//    ListNode returning;
//    public void reorderList(ListNode head) {
//
//        ListNode temp=head;
//        while (temp!=null)
//        {
//            size+=1;
//            temp=temp.next;
//
//        }
//        System.out.println("Size is "+size);
//
//        if(size%2==0)
//        {
//            check1(head);
//        }
//        else
//        {
//            check2(head);
//        }
//
//
//
//
//
//    }
//
//    private ListNode check1(ListNode head) {
//
//        if( count1+1>=size/2)
//        {
//            returning=head.next.next;
//            head.next.next=returning.next;
//            return returning;
//        }
//        count1++;
//        ListNode nextOne=check1(head.next);
//        ListNode nextReturing=nextOne.next;
//        nextOne.next=head.next;
//        head.next=nextOne;
//        System.out.println(returning.val+" "+returning.next.val+" "+nextReturing.val);
//        return nextReturing;
//    }
//
//    private void check2(ListNode head) {
//
//    }
//
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//
//        reOrderList reorderList = new reOrderList();
//        reorderList.reorderList(head);
//
//        ListNode current = head;
//        while (current!= null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//        }
//    }
//}




// Logic 2 (unable to solve)

//public class reOrderList {
//    int size=0;
//    int count1=0;
//    int count2=0;
//    ListNode returning;
//    public void reorderList(ListNode head) {
//        check1(head);
//
//    }
//
//    private ListNode check1(ListNode head) {
//
//      if(head.next.next==null)
//      {
//          return head;
//      }
//        ListNode temp= head;
//      while (temp.next.next!=null)
//      {
//          temp=temp.next;
//      }
//      ListNode nextOne=temp.next;
//      temp=nextOne.next;
//      head=temp;
//      head.next=nextOne;
//      head.next=check2(temp,head);
//    }
//
//    private ListNode check2(ListNode temp,ListNode head) {
//       if (temp.next==null)
//        {
//            return temp;
//        }
//       ListNode nextOne=check2(temp.next,head);
//       temp.next=nextOne.next;
//       head=temp;
//       return nextOne;
//
//    }
//
//    public static void main(String[] args) {
//        ListNode head = new ListNode(1);
//        head.next = new ListNode(2);
//        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);
//        head.next.next.next.next.next = new ListNode(6);
//
//        reOrderList reorderList = new reOrderList();
//        reorderList.reorderList(head);
//
//        ListNode current = head;
//        while (current!= null) {
//            System.out.print(current.val + " ");
//            current = current.next;
//        }
//    }
//}



public class reOrderList {
    int size=0;
    int count1=0;
    int count2=0;
    ListNode returning;
    ListNode current;
    public void reorderList(ListNode head) {

        ListNode temp=head;
        ListNode first=head;
        returning=head;
        while (temp!=null)
        {
            size+=1;
            temp=temp.next;

        }
        System.out.println("Size is "+size);

        if(size%2==0)
        {
            check1(head);
        }
        else
        {
            check1(head);
        }





    }

    private void check1(ListNode head) {
        if(count1==size/2)
        {
            return;

        }
        current=head;
        ListNode nextOne=findLast(head);
        nextOne.next=current.next;
        current.next=nextOne;
        current=current.next.next;
        count1++;
        check1(current);

    }

    private ListNode findLast(ListNode head) {
        if(head.next.next==null)
        {
            ListNode next=head.next;
            head.next=null;
            return next;
        }
        return findLast(head.next);
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
     //   head.next.next.next.next.next = new ListNode(6);

        reOrderList reorderList = new reOrderList();
        reorderList.reorderList(head);

        ListNode current = head;
        while (current!= null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}