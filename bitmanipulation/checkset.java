package bitmanipulation;

public class checkset {
  public static int isBitSet(int N) {
           if (N == 0) return 0; 
       return ((N & (N + 1)) == 0) ? 1 : 0;
        
    }
    public static void main(String[] args) {
       System.out.println(isBitSet(7)); 
    }
}
