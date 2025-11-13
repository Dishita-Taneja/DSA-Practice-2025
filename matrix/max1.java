package matrix;
import java.util.Arrays;
public class max1 {
    public static int[] rowAndMaximumOnes(int[][] mat) {
        int row = 0;    // store row index
        int maxCount = 0; // store maximum number of 1s

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 1) count++;
            }

            // If this row has more 1s, update
            if (count > maxCount) {
                maxCount = count;
                row = i;
            }
        }

        return new int[]{row, maxCount};
    }
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{1,1,1},{7,8,9}};
        int[] arr=rowAndMaximumOnes(mat);
        System.out.println(Arrays.toString(arr));

    }

    
}
