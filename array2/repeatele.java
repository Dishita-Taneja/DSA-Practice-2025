// import java.util.Arrays;

// public class repeatele {
//     static void findRepeatingElements(int arr[]) {
// 	    Arrays.sort(arr);
	    
// 	    System.out.print("The repeating elements are: ");
// 	    for(int i=0;i<arr.length-1;i++) 
// 	        if(arr[i] == arr[i+1])
// 	            System.out.println(arr[i]+" ");
// 	}
// 	public static void main(String[] args) {
// 		int[] arr = {1,1,2,3,4,4,5,2};
// 		findRepeatingElements(arr);
// 	}
// }


// USING HASHMAP 
import java.util.*;

public class repeatele {
    public static void main(String[] args) {
        int[] arr = {4, 2, 5, 2, 3, 4, 1};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency of each number
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Print elements with frequency > 1
        System.out.println("Repeating elements:");
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " → repeats " + entry.getValue() + " times");
            }
        }
    }
}