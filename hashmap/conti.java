package hashmap;

import java.util.HashMap;

public class conti {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // prefixSum 0 first occurs before array starts

        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            // treat 0 as -1
            sum += (nums[i] == 0 ? -1 : 1);

            // if sum seen before → zero-sum subarray exists
            if (map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLen = Math.max(maxLen, length);
            } else {
                // store the FIRST occurrence only
                map.put(sum, i);
            }
        }

        return maxLen;
    }

public static void main(String[] args) {
    int[] nums={0,1,1,1,1,1,0,0,0};
    System.out.println(findMaxLength(nums));
}
}
