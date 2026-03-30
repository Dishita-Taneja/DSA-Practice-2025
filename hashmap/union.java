package hashmap;

import java.util.HashSet;

public class union {
    public static void main(String[] args) {
        int[] arr={7,3,9};
        int[] ar={6,3,9,2,9,4};
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            s.add(arr[i]);
        }
        for(int i=0;i<ar.length;i++){
            s.add(ar[i]);
        }
        System.out.println(s);
        System.out.println(s.size());
    }
}
