package binarytree;

import java.util.ArrayList;
import java.util.List;

  
public class postorder {


    
    static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}

    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null) {
           return new ArrayList<>();
       }
       List<Integer> list =new ArrayList<>();
         
     list.addAll(postorderTraversal(root.left));
   
    list.addAll(postorderTraversal(root.right));
     list.add(root.val);
       return list;
    }
    public static void main(String[] args) {
        postorder p =new postorder();
  TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("Preorder Traversal: " + p.postorderTraversal(root));
    
    }
}

