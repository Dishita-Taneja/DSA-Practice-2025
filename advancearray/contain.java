package advancearray;

public class contain {

    public static int maxArea(int[] arr) {
        int n = arr.length;
        int l = 0;
        int r = n - 1;
        int hw = 0;

        while (l < r) {
            int w = r - l;
            int h = Math.min(arr[l], arr[r]);
            int a = w * h;

            hw = Math.max(hw, a);

            if (arr[l] < arr[r]) {
                l++;
            } else {
                r--;
            }
        }
        return hw;
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(arr);
        System.out.println("Maximum water that can be contained: " + result);
    }
}
