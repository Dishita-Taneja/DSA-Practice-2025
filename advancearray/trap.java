package advancearray;

public class trap {

    public static int trap1(int[] height) {
        int n = height.length;
        int[] li = new int[n];
        int[] ri = new int[n];

        // Left max
        li[0] = height[0];
        for (int i = 1; i < n; i++) {
            li[i] = Math.max(height[i], li[i - 1]);
        }

        // Right max
        ri[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            ri[i] = Math.max(height[i], ri[i + 1]);
        }

        // Calculate trapped water
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(li[i], ri[i]) - height[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        int result = trap1(height);
        System.out.println("Total trapped water: " + result);
    }
}
