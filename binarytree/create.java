package binarytree;
import java.util.*;
public class create {
    

class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] desc : descriptions) {
            int parentVal = desc[0];
            int childVal = desc[1];
            int isLeft = desc[2];

            // Create nodes if not already present
            map.putIfAbsent(parentVal, new TreeNode(parentVal));
            map.putIfAbsent(childVal, new TreeNode(childVal));

            TreeNode parent = map.get(parentVal);
            TreeNode child = map.get(childVal);

            // Link child to parent
            if (isLeft == 1)
                parent.left = child;
            else
                parent.right = child;

            // Track child nodes
            children.add(childVal);
        }

        // Root is the node that is not a child of any node
        for (int val : map.keySet()) {
            if (!children.contains(val))
                return map.get(val);
        }

        return null; // Should not happen
    }

    // Simple test
    public static void main(String[] args) {
        create obj = new create();
        int[][] descriptions = {
            {20, 15, 1},
            {20, 17, 0},
            {15, 10, 1}
        };
        TreeNode root = obj.createBinaryTree(descriptions);
        System.out.println("Root node value: " + root.val); // Expected 20
    }

}
