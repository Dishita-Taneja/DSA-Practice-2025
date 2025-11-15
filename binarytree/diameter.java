package binarytree;

public class diameter {
 static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
     int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return d;}
        public int height(TreeNode node){
        if (node ==null){
            return 0;}
            int lh= height(node.left);
           int rh = height(node.right); 
           d= Math.max(d,lh+rh) ;
      return 1+Math.max(lh,rh);
    }
    public static void main(String[] args) {
    diameter d =new diameter();
  TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        System.out.println("diameter: " + d.diameterOfBinaryTree(root));
    }
}
