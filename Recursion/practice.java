package Recursion;


// Finding value in LinkedList of Integer values using recursion


public class practice {
    public ListNode getElement(ListNode head, int val) {
        if(head==null)
        {
            return head;
        }

        else
        {
            ListNode temp=getElement(head.next,val);
            if(head.val==val)
            {
                return head;
            }
            else
            {
                return temp;
            }
        }




    }

    public static void main(String[] args) {
        practice practice=new practice();
        ListNode node1=new ListNode(1);
        ListNode node2=new ListNode(2);
        ListNode node3=new ListNode(3);
        ListNode node4=new ListNode(4);
        ListNode node5=new ListNode(5);
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node4.next=node5;
        int val=9;
        ListNode res=practice.getElement(node1,val);
        if(res==null)
        {
            System.out.println("Result is : Null");
        }
        else
        {
            System.out.println("Result is : "+res.val);
        }

    }

}


// Remove elements from the linkedlist

//public class practice {
//    public ListNode getElement(ListNode head, int val) {
//        if(head==null)
//        {
//            return null;
//        }
//
//        else
//        {
//            head.next=getElement(head.next,val);
//            if(head.val==val)
//            {
//                return head.next;
//            }
//            else
//            {
//                return head;
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        practice practice=new practice();
//        ListNode node1=new ListNode(7);
//        ListNode node2=new ListNode(7);
//        ListNode node3=new ListNode(7);
//        ListNode node4=new ListNode(7);
//        ListNode node5=new ListNode(7);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;
//        node4.next=node5;
//        int val=7;
//        ListNode res=practice.getElement(node1,val);
//        if(res==null)
//        {
//            System.out.println("Result is : Null");
//        }
//        else
//        {
//            System.out.println("Result is : "+res.val);
//        }
//
//    }
//
//}



