package hashmap;
import java.util.HashMap;
import java.util.Arrays;
public class twosum {
    public static int[] two(int[] nums, int target) {
         HashMap<Integer, Integer> map = new HashMap<>();
         for (int i = 0; i < nums.length; i++) {
             int need = target - nums[i];
         if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
         }
            map.put(nums[i], i);
        }

        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        int[] nums={2,7,11,15};
        int t=9;
        int[] res;
        res = two(nums, t);
        System.out.println(java.util.Arrays.toString(res));
    }
}
