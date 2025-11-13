package binarytree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class levelorder {
     static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }}

     public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> arr = new ArrayList<>();
        if(root == null) {
           return arr;
       }
   Queue<TreeNode> q=new LinkedList<>();
   q.add(root);
   while(!q.isEmpty()){
    int n=q.size();
    List<Integer> list= new ArrayList<>();
    for (int i=0;i<n;i++){
   TreeNode re=q.remove();
   list.add(re.val);
   if(re.left!=null){
q.add(re.left);
   } 
   if(re.right!=null){
    q.add(re.right);
   }      
    }
    arr.add(list);
   }   
return arr;
    }
    public static void main(String[] args) {
        levelorder p =new levelorder();
  TreeNode root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left = new TreeNode(9);
 List<List<Integer>> a= p.levelOrder1(root);
        System.out.println(a);
    
    }
}
