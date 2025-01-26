package Trees;

//public class findAbsoluteMinimumDifference {
//    int nextVal=0;
//    boolean modBit=true;
//    int res=0;
//    public int getMinimumDifference(TreeNode root) {
//        if(root==null)
//        {
//            return -1;
//        }
//        res=root.val;
//        nextVal=getMinimumDifference(root.left);
//        if(nextVal!=-1&&modBit)
//        {
//            System.out.println("Root.value is : "+root.val);
//            res= Math.abs(root.val-nextVal);
//            modBit=false;
//        }
//        return res;
//    }
//
//    public static void main() {
//        findAbsoluteMinimumDifference findAbsoluteMinimumDifference=new findAbsoluteMinimumDifference();
//
//
//
//        //Input 1
//
////        TreeNode root = new TreeNode(4);
////        TreeNode node2 = new TreeNode(2);
////        TreeNode node6 = new TreeNode(6);
////        TreeNode node1 = new TreeNode(1);
////        TreeNode node3 = new TreeNode(3);
////        // Establish relationships
////        root.left = node2;
////        root.right = node6;
////        node2.left = node1;
////        node2.right = node3;
//
//
//        //Input 2
//        TreeNode root = new TreeNode(1);
//        TreeNode node0 = new TreeNode(0);
//        TreeNode node48 = new TreeNode(48);
//        TreeNode node12 = new TreeNode(12);
//        TreeNode node49 = new TreeNode(49);
//
//        // Establish relationships
//        root.left = node0;
//        root.right = node48;
//        node48.left = node12;
//        node48.right = node49;
//
//
//
//
//
//        System.out.println("Minimum difference: " + findAbsoluteMinimumDifference.getMinimumDifference(root));
//
//    }
//}


//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class findAbsoluteMinimumDifference {
//    List<Integer> differences=new ArrayList<>();
//    List<Integer> Last=new ArrayList<>();
//
//    int nextVal=0;
//    boolean modBit=true;
//    int res=0;
//    public int getMinimumDifference(TreeNode root) {
//        Last.add(-786);
//        check2(root);
//
//
//        return Collections.min(differences);
//    }
//
//    private int check2(TreeNode root) {
//        if(root==null)
//        {
//            return -1;
//        }
//        res=root.val;
//        nextVal=check2(root.left);
//        if(nextVal!=-1)
//        {
//            System.out.println("Root.value is : "+root.val);
//            res= Math.abs(root.val-nextVal);
//            differences.add(res);
//        }
//        nextVal=check2(root.right);
//        return res;
//    }
//
//    public static void main() {
//        findAbsoluteMinimumDifference findAbsoluteMinimumDifference=new findAbsoluteMinimumDifference();
//
//
//
//        //Input 1
//
////        TreeNode root = new TreeNode(4);
////        TreeNode node2 = new TreeNode(2);
////        TreeNode node6 = new TreeNode(6);
////        TreeNode node1 = new TreeNode(1);
////        TreeNode node3 = new TreeNode(3);
////        // Establish relationships
////        root.left = node2;
////        root.right = node6;
////        node2.left = node1;
////        node2.right = node3;
//
//
//        //Input 2
////        TreeNode root = new TreeNode(1);
////        TreeNode node0 = new TreeNode(0);
////        TreeNode node48 = new TreeNode(48);
////        TreeNode node12 = new TreeNode(12);
////        TreeNode node49 = new TreeNode(49);
////
////        // Establish relationships
////        root.left = node0;
////        root.right = node48;
////        node48.left = node12;
////        node48.right = node49;
//
//
//        //input 3
//
//        TreeNode root = new TreeNode(1);
//        TreeNode node5 = new TreeNode(5);
//        TreeNode node3 = new TreeNode(3);
//
//        // Establish relationships
//        root.right = node5;
//        node5.left = node3;
//
//
//
//
//
//
//        System.out.println("Minimum difference: " + findAbsoluteMinimumDifference.getMinimumDifference(root));
//
//    }
//}



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class findAbsoluteMinimumDifference {
    List<Integer> diff=new ArrayList<>();
    List<Integer> dataList=new ArrayList<>();
    List<Integer> toReturn=new ArrayList<>();

    int first=0;
    int second=0;
    int nextVal=0;
    boolean modBit=true;
    int res=0;
    public int getMinimumDifference(TreeNode root) {
        toReturn.add(-1);
        check2(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < dataList.size(); i++) {
            int diff = dataList.get(i) - dataList.get(i-1);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private List<Integer> check2(TreeNode root) {
        if(root==null)
        {
            return toReturn;
        }
        check2(root.left);
        dataList.add(root.val);
        check2(root.right);


        return dataList;
    }

    public static void main() {
        findAbsoluteMinimumDifference findAbsoluteMinimumDifference=new findAbsoluteMinimumDifference();
        //Input 1

//        TreeNode root = new TreeNode(4);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(3);
//        // Establish relationships
//        root.left = node2;
//        root.right = node6;
//        node2.left = node1;
//        node2.right = node3;


        //Input 2
//        TreeNode root = new TreeNode(1);
//        TreeNode node0 = new TreeNode(0);
//        TreeNode node48 = new TreeNode(48);
//        TreeNode node12 = new TreeNode(12);
//        TreeNode node49 = new TreeNode(49);
//
//        // Establish relationships
//        root.left = node0;
//        root.right = node48;
//        node48.left = node12;
//        node48.right = node49;


        //input 3

        TreeNode root = new TreeNode(1);
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);

        // Establish relationships
        root.right = node5;
        node5.left = node3;






        System.out.println("Minimum difference: " + findAbsoluteMinimumDifference.getMinimumDifference(root));

    }
}
