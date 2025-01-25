package Trees;

public class rangeSumBST {
    int num;
    public int rangeSumBst(TreeNode root, int low, int high) {
        if(root==null)
        {
            return num;
        }
        rangeSumBst(root.left,low,high);
        if(root.val>=low&&root.val<=high)
        {
            num+=root.val;
        }
        rangeSumBst(root.right,low,high);
        return num;
    }

    public static void main() {

        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        rangeSumBST rangeSumBST = new rangeSumBST();
        int result = rangeSumBST.rangeSumBst(root, 7, 15);
        System.out.println("Sum of values between 7 and 15: " + result);
    }
}
