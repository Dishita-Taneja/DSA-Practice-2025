package bitmanipulation;

public class bitcount {
    // public static int minBitFlips(int start, int goal) {
    //     int ans = start^goal;
    //     int c=0;
    //     for(int i=0;i<31;i++){
    //         if ((ans & (1<<i))!=0){
    //             c++;
    //         }
    //     }
    // return c;}
    //  public static int minBitFlips(int start, int goal) {
    //     int ans = start ^ goal;
    //     int count = 0;

    //     while (ans > 0) {
    //         count += ans & 1;  // check last bit
    //         ans >>= 1;         // shift
    //     }

    //     return count;
    // }

    public static int minBitFlips(int start, int goal) {
        return Integer.bitCount(start ^ goal);
    }

    public static void main(String[] args) {
        int start=10;
        int end=7;
        System.out.println(minBitFlips(start,end));
    }
}
