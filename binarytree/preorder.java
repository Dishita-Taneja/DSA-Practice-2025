package binarytree;

import java.util.ArrayList;
import java.util.List;

public class preorder {
    
    static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null) {
           return new ArrayList<>();
       }
       List<Integer> list =new ArrayList<>();
          list.add(root.val);
     list.addAll(preorderTraversal(root.left));
   
    list.addAll(preorderTraversal(root.right));
       return list;
    }
    public static void main(String[] args) {
        preorder p =new preorder();
  TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Preorder Traversal: " + p.preorderTraversal(root));
    
    }
}
