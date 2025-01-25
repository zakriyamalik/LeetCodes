package Trees;

import java.util.ArrayList;
import java.util.List;

public class inOrderTraversal {
    List<Integer> list=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root==null)
        {
            return list;
        }
        inorderTraversal(root.left);
        list.add(root.val);
        inorderTraversal(root.right);
        return list;
    }

    public static void main() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        inOrderTraversal traversal = new inOrderTraversal();
        List<Integer> result = traversal.inorderTraversal(root);
        System.out.println(result); // [1, 3, 2]

    }
}
