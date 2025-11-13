package stack;
import java.util.*;
public class nextgreater {
     public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Build mapping of next greater elements for nums2
        for (int num : nums2) {
            while (!stack.isEmpty() && num > stack.peek()) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // For remaining elements with no greater element
        while (!stack.isEmpty()) {
            nextGreater.put(stack.pop(), -1);
        }
        
        // Build result for nums1 based on mapping
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.get(nums1[i]);
        }
        
        return result;
    }
public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        int[] res=nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }


}
// this is more simpler logic to implement 

// int l1 = nums1.length;
//         int l2 = nums2.length;
//         int[] arrindex = new int[10001];
//         for(int i=0;i<l2;i++){
//             arrindex[nums2[i]] = i;
//         }
//         for(int i=0;i<l1;i++){
//             nums1[i]=findGreatest(nums1[i],nums2,arrindex);
            
//         }
//         return nums1;
//     }
//     private int findGreatest(int num,int[] nums2,int[] arrindex){
//         for(int j=arrindex[num]+1;j<nums2.length;j++){
//             if(nums2[j]>num){
//                 return nums2[j];
                
//             }
//         }
//         return -1;
//     }