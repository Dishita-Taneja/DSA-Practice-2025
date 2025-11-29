package bitmanipulation;

public class toggle {
   public static int toggleBits(int n, int l, int r) {
        l=l-1;
        r=r-1;
      while(l<=r){
          n=n^(1<<l);
          l++;
      }
      return n;  
    }
    public static void main(String[] args) {
        int n=17;
        int l=2;
        int r=3;
        System.out.println(toggleBits(n, l, r));
    }
}
