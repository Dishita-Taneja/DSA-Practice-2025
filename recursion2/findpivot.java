package recursion2;

public class findpivot {
    public static int pivotIndex(int[] nums) {
       int total = 0;
        for (int num : nums) {
            total += num;  }
        int ls = 0;
        for (int i = 0; i < nums.length; i++) {
            if (ls == total - ls - nums[i]) {
                 return i; 
            }
            ls += nums[i];
        }

        return -1;
    }
    public static void main(String[] args) {
        int[] nums={1,7,3,6,5,6};
        System.out.println(pivotIndex(nums));
    }
}
