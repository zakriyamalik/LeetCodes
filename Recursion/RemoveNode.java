package Recursion;

public class RemoveNode {
    public ListNode removeNodes(ListNode head) {
        if(head.next==null)
        {
            return head;
        }
        head.next=removeNodes(head.next);
        if(head.val>head.next.val)
        {
            return head;
        }
        else if(head.val<head.next.val)
        {
            return head.next;
        }
        else
        {
            return head;
        }

    }
    public static void main(String[] args) {
        ListNode node = new ListNode();
        node.val = 1;
        node.next = new ListNode();
        node.next.val = 2;
        node.next.next = new ListNode();
        node.next.next.val = 3;
        node.next.next.next = new ListNode();
        node.next.next.next.val = 4;
        node.next.next.next.next = new ListNode();
        node.next.next.next.next.val = 5;
        node.next.next.next.next.next = null;
        RemoveNode removeNode = new RemoveNode();
        ListNode newHead = removeNode.removeNodes(node);
        while (newHead!= null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
        // Output: 2 3 4 5

    }
}
