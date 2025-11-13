package array;

import java.util.Arrays;

public class RunningSum {
    public int[] runningSum(int[] nums) {
        for (int i=1;i<nums.length;i++){
            nums[i]=nums[i]+nums[i-1];
        }
        return nums;}
        public static void main(String[] args){
           int [] nums={1,2,3,4};
 RunningSum obj = new RunningSum();
        obj.runningSum(nums); 
        System.out.println("Running sum: " + Arrays.toString(nums));
        }
}
