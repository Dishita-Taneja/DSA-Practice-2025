package bitmanipulation;

public class single1 {

    public static  int singleNumber(int[] nums) {
        int r=0;
 for (int n:nums){
r^=n;
 }
 return r;
    }
public static void main(String[] args) {
    int[] nums={2,2,1};
    System.out.println(singleNumber(nums));
}
}
