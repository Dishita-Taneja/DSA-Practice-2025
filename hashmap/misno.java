package hashmap;

public class misno {
     public static int missingNumber(int[] nums) {
        int n=nums.length;
        int e=n*(n+1)/2;
        int a=0;
        for(int i:nums){
            a+=i;
        }

        return e-a;
    }
    public static void main(String[] args) {
        int[] nums={3,0,1};
        System.out.println(missingNumber(nums));
    }
}
