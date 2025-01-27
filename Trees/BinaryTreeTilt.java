package Trees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTilt {
    int left=0;
    int right=0;
    List<Integer> result=new ArrayList<>();
    int res;
    Stack<Integer> stack=new Stack<>();
    public int findTilt(TreeNode root)
    {
        findTilt1(root);
        for(Integer e:result)
        {
            res+=e;
        }
        return res;
    }
    public int findTilt1(TreeNode root) {
        if(root==null)
        {
            return 0;
        }
        left= findTilt1(root.left);
        stack.add(left);

        right=findTilt1(root.right);
        left=stack.pop();
        res=Math.abs(left-right);
        result.add(res);

        System.out.println("Node is : "+root.val+" Left Node is : "+left+" Right is : "+right+" Result is : "+res);

        return root.val;
    }

    public static void main() {
        // Example usage:
        //Input 1
//        TreeNode root = new TreeNode(4);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(9);
//        root.left.left = new TreeNode(1);
//        root.left.right = new TreeNode(3);
//        root.right.left = new TreeNode(5);
//        root.right.right = new TreeNode(7);


        //Input 2


        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(7);


        //Input 3




        BinaryTreeTilt tiltFinder = new BinaryTreeTilt();
        int tilt = tiltFinder.findTilt(root);
        System.out.println("Tilt: " + tilt);
    }
}
