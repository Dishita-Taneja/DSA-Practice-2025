package binarytree;

public class pathsum {
    static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
     public boolean hasPathSum(TreeNode root, int t) {
       if (root==null){
        return false;
       }
          if (root.left == null && root.right == null) {
            return t == root.val;
        }
int r= t-root.val;
return hasPathSum(root.left,r)||hasPathSum(root.right,r);
    }
        public static void main(String[] args) {
   pathsum d =new pathsum();
  TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
          root.left = new TreeNode(3);
int t=5;
        System.out.println("diameter: " + d.hasPathSum(root,t));
    }
}
