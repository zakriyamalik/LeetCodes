package Recursion;

public class isPalindrome {

    public boolean isPalindrome(ListNode head) {

        ListNode node= checkP(head, head);
        if(node==null) return true;
        if(node.val==-1)
        {
            return false;
        }

        return true;

    }

    private ListNode checkP(ListNode head, ListNode first) {
        if(head==null)
        {
            return first;
        }

        ListNode node=checkP(head.next,first);
        if (node==null||node.val == -1)
        {
            return new ListNode(-1);
        }

            if(head.val==node.val) {
                return node.next;

            }
            else
            {
                return new ListNode(-1);
            }


    }

    public static void main(String[] args) {
        // write respective main function
        // Example usage:
//        ListNode node1 = new ListNode(1);
//        ListNode node2 = new ListNode(2);
//        ListNode node3 = new ListNode(3);
//        ListNode node4 = new ListNode(2);
//        ListNode node5 = new ListNode(1);
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
        isPalindrome compared =new isPalindrome();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;


        System.out.println(compared.isPalindrome(node1)); // Output: true
    }
}
