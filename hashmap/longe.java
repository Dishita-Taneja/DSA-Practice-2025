package hashmap;

import java.util.HashSet;

public class longe {

    public static int longestConsecutive(int[] nums) {
        // Edge case: empty array
        if (nums.length == 0) return 0;

        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        // Iterate through numbers and find sequence starters
        for (int num : set) {

            // Check if this number is the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                // Count forward until sequence breaks
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};

        int result = longestConsecutive(nums);
        System.out.println("Longest consecutive sequence length: " + result);
    }
}