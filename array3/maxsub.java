package array3;

public class maxsub {
    static int maxSubArray(int[] nums) {
        int c=0;
        int m=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            c=Math.max(nums[i],c+nums[i]);
            m=Math.max(m,c);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
}

