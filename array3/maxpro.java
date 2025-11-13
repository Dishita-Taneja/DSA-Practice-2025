package array3;

public class maxpro {
    static int maxProduct(int[] nums) {
    int ma=nums[0];
    int mi=nums[0];
    int mp=nums[0];
    for(int i=1;i<nums.length;i++){
        int c =nums[i];
        if (c<0){
            int t=ma;
            ma=mi;
            mi=t;
        }
        ma=Math.max(c,c*ma);
        mi=Math.min(c,c*mi);
        mp=Math.max(mp,ma);
    }
    return mp;
    }
    public static void main(String[] args) {
        int[] nums={-2,0,-1};
        System.out.println(maxProduct(nums));
    }

}
