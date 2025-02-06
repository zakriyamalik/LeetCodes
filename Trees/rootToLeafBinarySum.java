package Trees;

import java.util.ArrayList;
import java.util.List;

public class rootToLeafBinarySum {
    int left=0;
    int right=0;
    int res=0;
    String eq="";
    List<Integer> list =new ArrayList<>();

    public int sumRootToLeaf(TreeNode root) {
       check2(root);
       return res;
    }

    private int check2(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        list.add(root.val);
        left= check2(root.left);


        right=check2(root.right);
        if(root.left==null&& root.right==null)
        {
            System.out.println(list);

            for (Integer i:list)
            {
                System.out.println(i+" ");
                eq+=i;
            }
            int decimal = Integer.parseInt(eq, 2);
            eq="";

            res+=decimal;

        } list.removeLast();

        return root.val;
    }

    public static void main() {
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);


        //input 2

        TreeNode root = new TreeNode(1);

        // Creating and linking the left subtree
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);

        // Creating and linking the right subtree
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);

        rootToLeafBinarySum solver = new rootToLeafBinarySum();
        int sum = solver.sumRootToLeaf(root);
        System.out.println("Math.Sum of all root-to-leaf paths: " + sum);
    }
}
