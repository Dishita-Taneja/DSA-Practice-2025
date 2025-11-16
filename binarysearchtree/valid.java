package binarysearchtree;

public class valid {
    static class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
    public boolean isValidBST(TreeNode root) {
      return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public boolean validate(TreeNode node, long min, long max){
         if (node == null) return true;
         if (node.val <= min || node.val >= max)
            return false;
     return validate(node.left, min, node.val) &&
               validate(node.right, node.val, max);
    }
    public static void main(String[] args) {
        valid v = new valid();
        TreeNode root =new TreeNode(2);
        root.left=new TreeNode(1);
       root.right= new TreeNode(3);
         System.out.println("is tree valid bst: " + v.isValidBST(root));
    }
}
