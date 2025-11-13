package stack;
 import java.util.*;
public class smallle {

    public static int[] Smallestonleft(int arr[], int n) {
        int[] res = new int[n];
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            // Find the largest element smaller than arr[i]
            Integer smaller = set.lower(arr[i]);  // like set.lower_bound() in C++

            if (smaller == null)
                res[i] = -1;
            else
                res[i] = smaller;

            // Insert current element into set
            set.add(arr[i]);
        }

        return res;
    }

    // For local testing
    public static void main(String[] args) {
        int[] arr = {2,3 ,4,5,1};
        int[] ans = Smallestonleft(arr, arr.length);
        System.out.println(Arrays.toString(ans));
    }
}

