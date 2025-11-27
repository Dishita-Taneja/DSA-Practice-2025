package hashmap;

import java.util.HashMap;

public class larsu {
    public static int findSubarray(int[] arr) {
           HashMap<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0;
        int count = 0;

        // initialize frequency of 0 prefix sum
        map.put(0, 1);

        for (int num : arr) {
            prefixSum += num;

            // if prefixSum was seen before -> zero sum subarray exists
            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }

            // increase frequency
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }
   public static void main(String[] args) {
    int[] arr={0, 0, 5, 5, 0, 0};
    System.out.println(findSubarray(arr));
   } 
}