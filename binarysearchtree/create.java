package binarysearchtree;

public class create {
 TreeNode root;
 static class TreeNode {
    int val;
    TreeNode left, right;

    TreeNode(int val) {
        this.val = val;
    }
}
public TreeNode insert(TreeNode root, int val) {
    if (root == null) 
        return new TreeNode(val);

    if (val < root.val)
        root.left = insert(root.left, val);
    else
        root.right = insert(root.right, val);

    return root;
}
public static void main(String[] args) {
    create c=new create();
    c.root = c.insert(c.root, 1);
    c.root = c.insert(c.root, 2);
    c.root = c.insert(c.root, -1);
    System.out.println(c.root.left.val);
    System.out.println(c.root.val);
     System.out.println(c.root.right.val);
}
}
