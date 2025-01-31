package Trees;

public class InsertInBinaryTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null)
        {
            return new TreeNode(val);
        }
        if(val<root.val)
        {
            root.left=insertIntoBST(root.left,val);
        }
        else
        {
            root.right=insertIntoBST(root.right,val);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        // Link nodes to form a valid BST
        root.left = node2;    // 4's left child is 2 (BST: 2 < 4)
        root.right = node7;   // 4's right child is 7 (BST: 7 > 4)
        node2.left = node1;   // 2's left child is 1 (BST: 1 < 2)
        node2.right = node3;  // 2's right child is 3 (BST: 3 > 2)
        InsertInBinaryTree insertInBinaryTree=new InsertInBinaryTree();
        insertInBinaryTree.insertIntoBST(root,5);
    }
}
