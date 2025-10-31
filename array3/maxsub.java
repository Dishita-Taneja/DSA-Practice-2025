package array3;

public class maxsub {
    public int maxSubArray(int[] nums) {
        int c=0;
        int m=Integer.MIN_VALUE;
        for (int i=0;i<nums.length;i++){
            c=Math.max(nums[i],c+nums[i]);
            m=Math.max(m,c);
        }
        return m;
    }
    public static void main(String[] args) {
        int[] nums={5,4,-1,7,8};
        System.out.println(maxSubArray(nums));
    }
}

