package matrix;
import java.util.Arrays;
public class rotate {
    public static void rotaterr(int[][] matrix) {
          int n = matrix.length;
          for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
         for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
}
public static void main(String[] args) {
   int[][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
   rotaterr(matrix);
   System.out.println(Arrays.deepToString(matrix));
}
}