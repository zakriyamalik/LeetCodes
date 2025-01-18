package Recursion;

public class addTwoNumbers {
    ListNode result;
    int rem=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&& l2==null)
        {
            return result;
        }
        else {
            result.val = l1.val + l2.val + rem + rem;
            rem = result.val / 10;
            addTwoNumbers(l1.next, l2.next);
        }


    }
    public static void main()
    {
        addTwoNumbers addTwoNumbers=new addTwoNumbers();
        // Initialize the first linked list
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Initialize the second linked list
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        // Add the two linked lists
        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);

        // Print the resultant linked list
        printList(result);
    }

    private static void printList(ListNode result) {
        System.out.println("Result is \n");
        while (result!=null){
            System.out.println(result.val+" ");
            result=result.next;
        }
        System.out.println("Done...\n");
    }
}
