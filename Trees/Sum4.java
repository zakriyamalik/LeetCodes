package Trees;

import java.awt.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum4 {
    public List<Integer> list=new ArrayList<>();
    boolean flage=false;
    int left=0;int right=0;
    int sum=0;
    public boolean findTarget(TreeNode root, int k) {
        check2(root,k);
        System.out.println("List is\t"+list);
        right=list.size()-1;
        while(left<right)
        {
            sum= list.get(left)+list.get(right);
            if(sum==k)
            {
                flage=true;break;
            }
            if(sum<k)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
    return flage;
    }

    private TreeNode check2(TreeNode root, int k) {
        if(root==null)
        {
            return null;
        }
        check2(root.left,k);
        list.add(root.val);
        check2(root.right,k);
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4a = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node2b = new TreeNode(2);
        TreeNode node4b = new TreeNode(4);

        // Link nodes to form a BST
        root.right = node2;            // 1's right child is 2 (BST: 2 > 1)
        node2.right = node4a;          // 2's right child is 4 (BST: 4 > 2)
        node4a.left = node2b;          // 4's left child is 2 (BST: 2 ≤ 4)
        node4a.right = node5;          // 4's right child is 5 (BST: 5 > 4)
        node5.left = node4b;           // 5's left child is 4 (BST: 4 < 5)

        Sum4 sum4 = new Sum4();
        boolean result = sum4.findTarget(root, 5);
        System.out.println(result); // Output: true

    }
}
