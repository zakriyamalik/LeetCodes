package Trees;

import java.util.ArrayList;
import java.util.List;

public class treeDiameter {
    List<Integer> counters=new ArrayList<>();
    int counter=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        diameterOfBinaryTree(root.left);
        counter++;
        System.out.println("root.value: "+root.val);
        diameterOfBinaryTree(root.right);
        counters.add(counter);
        counter--;

        return 1;
    }

    public static void main() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        treeDiameter treeDiameter = new treeDiameter();
        int diameter = treeDiameter.diameterOfBinaryTree(root);
        System.out.println("Diameter of the binary tree: " + diameter);
    }

}
