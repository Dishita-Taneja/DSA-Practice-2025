package array;
public class MaxMinArray {

    public static int minimumDeletions(int[] nums) {
       int n= nums.length;
       int min=0,max=0;
       if (n==1){
        return 1;
       }
      for (int i=0;i<n;i++){
        if (nums[max]<nums[i]){
            max=i;
        }
        if (nums[min]>nums[i]){
            min=i;
        }
      }

        int front = Math.max(max,min) + 1;
        int back = n - Math.min(max,min);
        int both1 = (Math.min(max,min) + 1) + (n - Math.max(max,min)); 
        int both2 = (Math.max(max,min) + 1) + (n - Math.min(max,min));
        return Math.min(Math.min(front, back), Math.min(both1, both2));
    }
public static void main(String[] args){
int [] nums={2,10,7,5,4,1,8,6};
int n=minimumDeletions(nums);
System.out.println(n);
}
}
