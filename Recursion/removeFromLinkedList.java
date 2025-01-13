package Recursion;

public class removeFromLinkedList {
    public static ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        ListNode nextOne = removeElements(head.next, val);

        if (head.val == val) {
            return nextOne;
        }

        head.next = nextOne;
        return head;
    }

    public static void main(String[] args) {
        // write respective main function
    }
}
