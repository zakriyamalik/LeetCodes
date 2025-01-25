package Trees;

// Logic 1

//public class isCousin {
//    boolean res;
//    public boolean isCousins(TreeNode root, int x, int y) {
//        if(root==null)
//        {
//            return false;
//        }
//        if(root.left==null||root.right==null)
//        {
//            return false;
//        }
//       else if(root.left.val==x&&root.right.val==y|| root.left.val==y&&root.right.val==x)
//        {
//            return true;
//        }
//        else
//        {
//            res=isCousins(root.left,x,y);
//        }
//
//        return res;
//    }
//
//    public static void main(String[] args) {
//        isCousin isCousin=new isCousin();
//        // Test the function with a binary tree input one
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(2);
////        root.right = new TreeNode(3);
////        root.left.left = new TreeNode(4);
////        root.left.right = new TreeNode(5);
////        root.right.left = new TreeNode(6);
////        root.right.right = new TreeNode(7);
//
//        //Input 2
//
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(2);
////        root.right = new TreeNode(3);
////        root.left.right = new TreeNode(4); // Right child of 2
////        root.right.right = new TreeNode(5); // Right child of 3
////        int x = 4;
////        int y = 5;
//
//        //input 3
//
////        TreeNode root = new TreeNode(1);
////        root.left = new TreeNode(2);
////        root.right = new TreeNode(3);
////        root.left.left = new TreeNode(4); // Left child of 2
////
////        // Given x = 4 and y = 3
////        int x = 4;
////        int y = 3;
//
//
//
//
//        //input 4
//
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.right = new TreeNode(4); // Right child of 2
//
//        // Given x = 2 and y = 3
//        int x = 2;
//        int y = 3;
//
//
//
//
//        System.out.println(isCousin.isCousins(root, x, y));
//    }
//}


import java.util.LinkedList;
import java.util.Queue;

public class isCousin {
    int count=0;
    TreeNode element;
    Queue<TreeNode> queue=new LinkedList<>();
    boolean res;
    public boolean isCousins(TreeNode root, int x, int y) {
        queue.add(root);
        queue.add(null);
        while(!queue.isEmpty()) {
            count=0;
            for(TreeNode element:queue)
            {
                if(element==null)
                {
                    break;
                }
                if(element.val==x|| element.val==y)
                {
                    count++;
                }
            }
            if(count==2)
            {
                return true;
            }
            TreeNode poped = queue.poll();
            if(poped==null)
            {
                if(!queue.isEmpty())
                {
                    queue.add(null);
                }
            }
            else {

                if (poped.left != null) {
                    queue.add(poped.left);
                }
                if (poped.right != null) {
                    queue.add(poped.right);
                }
            }
            if(poped!=null)
            {
                System.out.println("poped element is " + poped.val);
            }
        }
        return false;

    }

    public static void main(String[] args) {
        isCousin isCousin=new isCousin();
        // Test the function with a binary tree input one
//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4);
//        root.left.right = new TreeNode(5);
//        root.right.left = new TreeNode(6);
//        root.right.right = new TreeNode(7);

        //Input 2

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.right = new TreeNode(4); // Right child of 2
//        root.right.right = new TreeNode(5); // Right child of 3
//        int x = 4;
//        int y = 5;

        //input 3

//        TreeNode root = new TreeNode(1);
//        root.left = new TreeNode(2);
//        root.right = new TreeNode(3);
//        root.left.left = new TreeNode(4); // Left child of 2
//
//        // Given x = 4 and y = 3
//        int x = 4;
//        int y = 3;




        //input 4

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(4); // Right child of 2

        // Given x = 2 and y = 3
        int x = 2;
        int y = 3;




        System.out.println(isCousin.isCousins(root, x, y));
    }
}
