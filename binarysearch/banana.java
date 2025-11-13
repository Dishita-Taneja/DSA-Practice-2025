package binarysearch;

public class banana {

    // Function to find the minimum eating speed
    public static int minEatingSpeed(int[] piles, int h) {
        int maxPile = 0;
        for (int pile : piles) {
            maxPile = Math.max(maxPile, pile);
        }

        int left = 1;
        int right = maxPile;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (canFinish(piles, h, mid)) {
                // mid is sufficient, try slower speed
                right = mid;
            } else {
                // mid too slow, need higher speed
                left = mid + 1;
            }
        }

        return left;
    }

    // Helper function to check if Koko can finish all piles at speed k within h hours
    private static boolean canFinish(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            // ceiling division: (pile + k - 1) / k
            hours += (pile + k - 1) / k;

            // Optimization: if already exceeded hours, stop early
            if (hours > h) return false;
        }
        return hours <= h;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed Koko needs: " + result);
    }

}
