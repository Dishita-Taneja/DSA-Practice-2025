package hashmap;

import java.util.HashSet;

public class intersection {
    public static void main(String[] args) {
          int[] nums1 = {1, 2, 2, 1};
          int[] nums2={2,2};
    HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        // O(n)
        for (int num : nums1) {
            set.add(num);
        }

        // O(m)
        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num); 
            }
        }

        System.out.println(result);
    }
}
