package math;
import java.util.Arrays;

import java.util.OptionalInt;

public class min {
//     public static  List<List<Integer>> minimumAbsDifference(int[] arr) {
// Arrays.sort(arr);
// List<List<Integer>> res=new ArrayList<>();
// List<Integer> l1=new ArrayList<>();
// List<Integer> l2=new ArrayList<>();
// int m=0;
// int n=arr.length;
// for(int i=1;i<n;i++){
//     int t=arr[i-1];
// m=Math.min(arr[i]-t,m);
// }
// for(int i=1;i<n;i++){
//      int t=arr[i-1];
//     if(m==arr[i]-t){
//         l1.add(t);
//         l2.add(arr[i]);
//     }
// }
// res.add(0,l1); 
// res.add(1,l2);
// return res;
//     }
public static void main(String[] args) {
    // int[] arr={4,2,1,3};
    
    // System.out.println(minimumAbsDifference(arr));


       int[] numbers = {12, 1, 21, 8, -5};

        // Find the minimum using IntStream.min()
        OptionalInt minOptional = Arrays.stream(numbers).min();
        System.out.println(minOptional);
}
}

