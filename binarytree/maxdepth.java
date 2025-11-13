package binarytree;

public class maxdepth {
    static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
    public int maxDepth(TreeNode root) {
         if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
 public static void main(String[] args) {
        maxdepth p =new maxdepth();
  TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("maximum depth: " + p.maxDepth(root));
    
    }


}
