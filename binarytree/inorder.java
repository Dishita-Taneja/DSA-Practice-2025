package binarytree;

import java.util.ArrayList;
import java.util.List;
public class inorder {

    
  class  TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null) {
           return new ArrayList<>();
       }
       List<Integer> list =new ArrayList<>();
   
     list.addAll(inorderTraversal(root.left));
          list.add(root.val);
    list.addAll(inorderTraversal(root.right));
       return list;
    }
    public static void main(String[] args) {
        inorder p =new inorder();
  TreeNode root =p. new TreeNode(1);
        root.right = p.new TreeNode(2);
        root.right.left =p. new TreeNode(3);

        System.out.println("Preorder Traversal: " + p.inorderTraversal(root));
    
    }
}

