package binarysearch;
  import java.util.Arrays;
public class cow {

    // Function to check if we can place 'k' cows
    // such that the minimum distance between any two cows is at least 'dist'
    public static boolean canPlaceCows(int[] stalls, int n, int k, int dist) {
        int count = 1; // place first cow at first stall
        int lastPos = stalls[0];

        for (int i = 1; i < n; i++) {
            if (stalls[i] - lastPos >= dist) {
                count++;
                lastPos = stalls[i];
            }
            if (count == k) {
                return true; // all cows placed successfully
            }
        }
        return false;
    }

    // Main function to find the largest minimum distance
    public static int aggressiveCows(int[] stalls, int n, int k) {
        Arrays.sort(stalls); // sort stall positions first
        int low = 1;
        int high = stalls[n - 1] - stalls[0];
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (canPlaceCows(stalls, n, k, mid)) {
                ans = mid;          // mid is possible, try for larger distance
                low = mid + 1;
            } else {
                high = mid - 1;     // mid not possible, try smaller distance
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] stalls = {1, 2, 8, 4, 9};
        int n = stalls.length;
        int k = 3;

        System.out.println("Largest minimum distance: " + aggressiveCows(stalls, n, k));
    }

}
