package recursion1;

public class power {
     public static int reverseExponentiation(int n) {
        if (n==0){
            return 0;
        }
        long base=n;
        long rev = 0;
        while (n > 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
       long exp=rev;
       long mod = 1_000_000_007;
   long  result = 1;
   while(exp>0){
    if (exp % 2 == 1) { 
                result = (result * base) % mod;
            }
            base = (base * base) % mod; 
            exp = exp / 2; 
}
     return (int)result;   
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(reverseExponentiation(n));
    }
}
