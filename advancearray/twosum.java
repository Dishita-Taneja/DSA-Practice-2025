package advancearray;

public class twosum {
    public static int[] twoSumar(int[] n, int t) {
        int[] a = new int[2];
        int r = 0;

        for (int i = 0; i < n.length; i++) {
            for (int j = i + 1; j < n.length; j++) {
                int o = n[i] + n[j];
                if (o == t) {
                    a[r] = i;
                    r++;
                    a[r] = j;
                    r++;
                    break;
                }
            }
        }
        return a;
    }
     public static void main(String[] args) {
      int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumar(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
}}
