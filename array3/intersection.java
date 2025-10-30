package array3;

import java.util.Arrays;
import java.util.HashSet;

public class intersection {
 static int[] intersection2(int[] nums1, int[] nums2) {
          HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();

        for (int n : nums1) set1.add(n);
        for (int n : nums2)
            if (set1.contains(n)) res.add(n);

        int[] result = new int[res.size()];
        int i = 0;
        for (int n : res) result[i++] = n;
        return result;
    }
    public static void main(String[] args) {
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        int[] res=intersection2(nums1,nums2);
        System.out.println(Arrays.toString(res));

    }
}
