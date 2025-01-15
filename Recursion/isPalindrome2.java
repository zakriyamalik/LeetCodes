package Recursion;

public class isPalindrome2 {
    ListNode first=new ListNode();
    public boolean Palindrome2(ListNode head) {
        first=head;
        ListNode node= checkP(head);
        if(node==null)
        {
            return true;
        }
        if(node.val==-1)
        {
            return false;
        }

        return true;

    }

    private ListNode checkP(ListNode head) {
        if(head==null)
        {
            return null;
        }

        ListNode node=checkP(head.next);
        // This happens only one time when node==null and that is when base case reached in that case it check head(last) and first node value

        if(node==null)
        {

            if(head.val==first.val)
            {
                first=first.next;
                return first;

            }
            else
            {
                return new ListNode(-1);
            }
        }
        else if(node.val==-1)
        {
            return new ListNode(-1);
        }
        else
        {
            if(head.val==node.val)
            {

                first=first.next;
                return first;
            }
            else
            {
                return new ListNode(-1);
            }
        }

    }

    public void main(String[] args) {
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

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;


        System.out.println(Palindrome2(node1)); // Output: true
    }
}
