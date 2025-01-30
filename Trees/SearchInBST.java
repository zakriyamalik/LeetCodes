package Trees;

import java.util.ArrayList;
import java.util.List;

public class SearchInBST {
    int[] arr;
    List<Integer> list=new ArrayList<>();
    TreeNode treeNode=new TreeNode();
    public TreeNode searchBST(TreeNode root,int val)
    {
        treeNode=check2(root,val);
        return treeNode;
    }

    private TreeNode check2(TreeNode root, int val) {
        if(root==null)
        {
            return null;
        }
        if(root.val==val)
        {
            //getSubTree(root);
            return root;
        }
       treeNode= check2(root.left,val);
        if(treeNode!=null)
        {
            return treeNode;
        }
       treeNode= check2(root.right,val);
        return treeNode;
    }

    private void getSubTree(TreeNode root) {
        if(root==null)
        {
            return;
        }
        list.add(root.val);
        getSubTree(root.left);
        getSubTree(root.left);

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

        SearchInBST searchInBST=new SearchInBST();
        TreeNode treeNode1= searchInBST.searchBST(root,2);
        System.out.println(treeNode1.val);

    }

}
