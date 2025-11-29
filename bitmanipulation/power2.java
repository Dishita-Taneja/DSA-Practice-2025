package bitmanipulation;

public class power2 {
     public static boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }
        // while(n%2==0){
        //     n/=2;
        // }
        // if(n==1){
        //     return true;
        // }
        // return false;
        if((n &n-1)==0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
}
