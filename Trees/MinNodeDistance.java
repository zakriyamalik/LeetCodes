package Trees;

import java.util.ArrayList;
import java.util.List;

public class MinNodeDistance {
    List<Integer> dataList=new ArrayList<>();
    List<Integer> toReturn=new ArrayList<>();

    public int minDiffInBST(TreeNode root) {
        toReturn.add(-1);
        check2(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < dataList.size(); i++) {
            int diff = dataList.get(i) - dataList.get(i-1);
            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    private List<Integer> check2(TreeNode root) {
        if(root==null)
        {
            return toReturn;
        }
        check2(root.left);
        dataList.add(root.val);
        check2(root.right);


        return dataList;
    }

    public static void main() {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);
        MinNodeDistance minNodeDistance = new MinNodeDistance();
        System.out.println(minNodeDistance.minDiffInBST(root)); // Output: 1
    }
}
