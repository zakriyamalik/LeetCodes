package Recursion;

public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            return head;
        }
        else
        {
            ListNode res=reverseList(head.next);
            head.next=null;
            res=addToEnd(res,head.val);
            return res;
        }

    }

    private ListNode addToEnd(ListNode res, int val) {
        if(res.next==null)
        {
            res.next= new ListNode(val,null);
            return res;
        }
        res.next=addToEnd(res.next,val);
        return res;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode reversedList = reverseLinkedList.reverseList(node1);

        while (reversedList != null) {
            System.out.print(reversedList.val + " -> ");
            reversedList = reversedList.next;
        }
        System.out.println("null");
    }
}
