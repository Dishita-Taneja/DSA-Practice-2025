package hashmap;
import java.util.*;
public class zeromat {
public void setZeroes(int[][] matrix) {
int rows = matrix.length;
int cols = matrix[0].length;
boolean firstRowZero = false;
boolean firstColZero = false;
  // Check if first row has any zero
        for (int j = 0; j < cols; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if first column has any zero
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Mark rows and columns based on zero position
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        // Set cells to zero using marks
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Update first row
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }

        // Update first column
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
    }
    public static void main(String[] args) {
        zeromat z=new zeromat();
       int[][] matrix={{1,1,1},{1,0,1},{1,1,1}};
 System.out.println(Arrays.deepToString(matrix));
        z.setZeroes(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
