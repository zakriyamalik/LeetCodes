package Recursion;


//First Logic


//public class swapPairs {
//    public ListNode swapPairs(ListNode head) {
//        ListNode curr=new ListNode();
//        ListNode currNext=new ListNode();
//        curr=head;
//        currNext=head.next;
//        return check2(head,curr,currNext);
//
//    }
//
//    private ListNode check2(ListNode head, ListNode curr, ListNode currNext) {
//        if((curr==null)||(currNext==null))
//        {
//            return head;
//        }
//        ListNode temp=new ListNode();
//        temp=curr;
//        curr=currNext.next;
//        currNext=temp;
//       return check2(head,curr,currNext);
//
//    }
//
//    public static void main() {
//        // write respective main function
//        // Example usage:
//         ListNode node1 = new ListNode(1);
//         ListNode node2 = new ListNode(2);
//         ListNode node3 = new ListNode(3);
//         ListNode node4 = new ListNode(4);
//         node1.next = node2;
//         node2.next = node3;
//         node3.next = node4;
//         swapPairs swapPairs = new swapPairs();
//         ListNode result = swapPairs.swapPairs(node1);
//         System.out.println(result.val); // Output: 2
//         System.out.println(result.next.val); // Output: 1
//         System.out.println(result.next.next.val); // Output: 4
//         System.out.println(result.next.next.next.val); // Output: 3
//
//
//    }
//}


public class swapPairs {
    ListNode toReturn;
    ListNode temp;
    ListNode curr;
    ListNode dummy=new ListNode(0);
    public ListNode swapPairs(ListNode head) {
        dummy.next=head;
        toReturn=head;
        curr=head;
        check2(head);
        return toReturn;

    }

    private ListNode check2(ListNode head) {
        if(head==null||head.next==null)
        {
            return head;
        }
        temp=head;
        head=head.next;
        temp.next=head.next;
        head.next=temp;

        check2(head.next.next);
        return null;
    }

    public static void main() {
        // write respective main function
        // Example usage:
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        swapPairs swapPairs = new swapPairs();
        ListNode result = swapPairs.swapPairs(node1);
        System.out.println(result.val); // Output: 2
        System.out.println(result.next.val); // Output: 1
        System.out.println(result.next.next.val); // Output: 4
        System.out.println(result.next.next.next.val); // Output: 3


    }
}
