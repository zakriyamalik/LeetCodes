package Recursion;

import java.util.ArrayList;
import java.util.List;

public class addTwoNumbers {
    List<Integer> result=new ArrayList<>();
    List<Integer> Tresult=new ArrayList<>();
    int value;
    ListNode arr;
    ListNode dummyC=new ListNode(0);
    int rem=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Tresult=check2(l1,l2);
        arr=dummyC;
        for (int i=0;i<Tresult.size();i++)
        {

            arr.next=new ListNode(Tresult.get(i));
            System.out.println(Tresult.get(i)+" ");
            arr=arr.next;
        }
        System.out.println("\n");
        return dummyC.next;
    }
    public List<Integer> check2(ListNode l1, ListNode l2)
    {
        if(l1==null&& l2==null)
        {
            if(rem!=0)
            {
                result.add(rem);
            }
            return result;
        }
        else {
            if(l1==null)
            {
                value=(l2.val + rem)%10;
                result.add(value) ;
              //  result=result.next;
                rem = (l2.val + rem) / 10;
                result=check2(null, l2.next);
            }
            else if(l2==null)
            {
                value=(l1.val  + rem)%10;
                result.add(value) ;
                rem = (l1.val  + rem) / 10;
                result=check2(l1.next, null);
            }
            else
            {
                value=(l1.val+ l2.val  + rem)%10;
                result.add(value) ;
                rem = (l1.val+ l2.val  + rem) / 10;
                result=check2(l1.next, l2.next);
            }

        }
        return result;
    }

//    public static void main()
//    {
//        addTwoNumbers addTwoNumbers=new addTwoNumbers();
//        // Initialize the first linked list
////        ListNode l1 = new ListNode(2);
////        l1.next = new ListNode(4);
////        l1.next.next = new ListNode(3);
////
////        // Initialize the second linked list
////        ListNode l2 = new ListNode(5);
////        l2.next = new ListNode(6);
////        l2.next.next = new ListNode(4);
//
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(0);
//
//
//
//        // Add the two linked lists
//        ListNode result = addTwoNumbers.addTwoNumbers(l1, l2);
//
//        // Print the resultant linked list
//        printList(result);
//    }

    public static void main(String[] args) {
        addTwoNumbers addTwoNumbers = new addTwoNumbers();

        // Initialize the first linked list l1 = [9,9,9,9,9,9,9]
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);
        l1.next.next = new ListNode(9);
        l1.next.next.next = new ListNode(9);
        l1.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next = new ListNode(9);
        l1.next.next.next.next.next.next = new ListNode(9);

        // Initialize the second linked list l2 = [9,9,9,9]
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        l2.next.next = new ListNode(9);
        l2.next.next.next = new ListNode(9);

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
