package binarytree;

import java.util.ArrayList;
import java.util.List;

public class rightview {
     static class  TreeNode{
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
     dfs(root, 0, ans);
        return ans;
    }

    public void dfs(TreeNode node, int level, List<Integer> ans) {
        if (node == null) return;

        // If this is the first time we reach this level
        if (level == ans.size()) {
            ans.add(node.val);
        }

        // Go right first, then left
        dfs(node.right, level + 1, ans);
        dfs(node.left, level + 1, ans);
    }
    
    public static void main(String[] args) {
   rightview d =new rightview();
  TreeNode root = new TreeNode(1);
    root.right = new TreeNode(3);
 root.left = new TreeNode(2);
        System.out.println("right view : " + d.rightSideView(root));
    }

}
