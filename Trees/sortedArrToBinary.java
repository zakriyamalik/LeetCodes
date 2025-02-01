package Trees;

public class sortedArrToBinary {
    TreeNode root=null;
    int size=0;
    public TreeNode sortedArrayToBST(int[] nums) {
        size=nums.length/2;
        for(int i=size;i<nums.length;i++)
        {
            root= check2(nums[i],root);
        }
        for (int i=0;i<size;i++)
        {
           root= check2(nums[i],root);
        }
        return root;
    }


    private TreeNode check2(int num, TreeNode root) {
        if(root==null)
        {
            return new TreeNode(num);
        }
        if(num<root.val)
        {
            root.left=check2(num,root.left);
        }
        else
        {
            root.right=check2(num,root.right);
        }
        return root;
    }

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        sortedArrToBinary tree = new sortedArrToBinary();
        TreeNode root = tree.sortedArrayToBST(arr);
    }
}
