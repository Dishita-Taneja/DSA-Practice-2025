package hashmap;

import java.util.HashMap;

public class largsub {

     public static int maxLength(int arr[]) {
      HashMap<Integer, Integer> map = new HashMap<>();
    int prefix = 0;
    int maxLen = 0;

    for (int i = 0; i < arr.length; i++) {
        prefix += arr[i];

        // If sum becomes 0, that means subarray [0..i] is zero-sum
        if (prefix == 0) {
            maxLen = i + 1;
        }

        // If prefix seen before → zero sum between previous index+1 to i
        if (map.containsKey(prefix)) {
            int len = i - map.get(prefix);
            maxLen = Math.max(maxLen, len);
        } else {
            // store only first occurrence
            map.put(prefix, i);
        }
    }

    return maxLen;
        
    }
    public static void main(String[] args) {
        int[]  arr = {15, -2, 2, -8, 1, 7, 10, 23};
System.out.println(maxLength(arr));
}
}