package array;

public class score {
    public static  long maximumScore(int[] nums) {
        int n=nums.length;
      int[] suffixMin = new int[n];
        suffixMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
        }
        long prefix=0;
         long maxScore = 0;

        for (int i=0;i<n-1;i++){
            prefix += nums[i];
            long score = prefix - suffixMin[i + 1];
            maxScore = Math.max(maxScore, score);
        }
                return maxScore;
    }
    public static void main(String[] args) {
        int[] nums={10,-1,3,-4,-5};
        System.out.println(maximumScore(nums));
    }
}
