package Trees;

public class findAbsoluteMinimumDifference {
    int nextVal=0;
    boolean modBit=true;
    int res=0;
    public int getMinimumDifference(TreeNode root) {
        if(root==null)
        {
            return -1;
        }
        res=root.val;
        nextVal=getMinimumDifference(root.left);
        if(nextVal!=-1&&modBit)
        {
            System.out.println("Root.value is : "+root.val);
            res= Math.abs(root.val-nextVal);
            modBit=false;
        }
        return res;
    }

    public static void main() {
        findAbsoluteMinimumDifference findAbsoluteMinimumDifference=new findAbsoluteMinimumDifference();



        //Input 1

//        TreeNode root = new TreeNode(4);
//        TreeNode node2 = new TreeNode(2);
//        TreeNode node6 = new TreeNode(6);
//        TreeNode node1 = new TreeNode(1);
//        TreeNode node3 = new TreeNode(3);
//        // Establish relationships
//        root.left = node2;
//        root.right = node6;
//        node2.left = node1;
//        node2.right = node3;


        //Input 2
        TreeNode root = new TreeNode(1);
        TreeNode node0 = new TreeNode(0);
        TreeNode node48 = new TreeNode(48);
        TreeNode node12 = new TreeNode(12);
        TreeNode node49 = new TreeNode(49);

        // Establish relationships
        root.left = node0;
        root.right = node48;
        node48.left = node12;
        node48.right = node49;





        System.out.println("Minimum difference: " + findAbsoluteMinimumDifference.getMinimumDifference(root));

    }
}
