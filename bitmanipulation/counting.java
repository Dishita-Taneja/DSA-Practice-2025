package bitmanipulation;

import java.util.Arrays;

public class counting {
    public static int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
       for(int i=1;i<=n;i++){
         arr[i]=count(i);
       }
       return arr;
    }
   public static int count(int n){
        int c=0;
       while(n>0){
           c+=n&1;
           n=n>>1;
       }

        return c;
    }
    public static void main(String[] args) {
        int n=2;
        int[] arr =countBits(n);
        System.out.println(Arrays.toString(arr));
    }

}
