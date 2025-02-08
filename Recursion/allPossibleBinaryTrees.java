package Recursion;

import java.util.ArrayList;
import java.util.List;

public class allPossibleBinaryTrees {
    List<TreeNode> list = new ArrayList<>();
    int counter = 0;
    TreeNode head = new TreeNode();
    TreeNode first = new TreeNode();
    TreeNode parent = new TreeNode();
    List<List<TreeNode>> lists = new ArrayList<>();

    public List<TreeNode> allPossibleFBT(int n) {
        head.val = counter++;
        parent = head;
        first = head;
        n--;
        fun2(head, first, parent, n);
        return list;
    }

    private List<TreeNode> fun2(TreeNode head, TreeNode first, TreeNode parent, int n) {
        if (n == 2) {
            head.left = new TreeNode(counter++);
            head.right = new TreeNode(counter++);

            addTreeInList(first, list);

            // Print the tree in diagram format using the root reference 'first'
            System.out.println("Printing tree diagram:");
            printTreeDiagram(first);

            head.left = null;
            head.right = null;
            lists.add(new ArrayList<>(list));

            return list;
        }
        head.left = new TreeNode(counter++);
        head.right = new TreeNode(counter++);

        n -= 2;
        fun2(head.left, first, head, n);
        // Based on your logic: if there is still data and children exist, process the right subtree.
        if ( first.right != null && first.left != null) {
            fun2(head.right, first, head, n);
            head.left = null;
            head.right = null;
            System.out.println("Now");
        }
        return list;
    }

    // Inorder traversal to add nodes to the list.
    private void addTreeInList(TreeNode first, List<TreeNode> list) {
        if (first == null) {
            return;
        }
        addTreeInList(first.left, list);
        list.add(first);
        addTreeInList(first.right, list);
    }

    // Helper method to print the tree in a diagram-style format.
    private void printTreeDiagram(TreeNode root) {
        int height = getHeight(root);
        int width = (int) Math.pow(2, height) - 1;
        String[][] res = new String[height][width];

        // Fill the 2D array with spaces.
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                res[i][j] = " ";
            }
        }

        // Place the node values into the array.
        fill(root, 0, 0, width - 1, res);

        // Print the diagram row by row.
        for (int i = 0; i < height; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < width; j++) {
                sb.append(res[i][j]);
                // You can add extra spacing here if needed.
            }
            //System.out.println(sb.toString());
        }
    }

    // Recursive helper method to fill the 2D array with node values.
    private void fill(TreeNode root, int level, int left, int right, String[][] res) {
        if (root == null) {
            return;
        }
        int mid = (left + right) / 2;
        res[level][mid] = Integer.toString(root.val);
        fill(root.left, level + 1, left, mid - 1, res);
        fill(root.right, level + 1, mid + 1, right, res);
    }

    // Helper method to compute the height of the tree.
    private int getHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static void main() {
        int n = 7;
        allPossibleBinaryTrees allPossibleBinaryTrees = new allPossibleBinaryTrees();
        allPossibleBinaryTrees.allPossibleFBT(n);
    }
}
