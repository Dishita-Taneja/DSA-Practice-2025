package matrix;

public class search {
    public static boolean searchMatrix(int[][] matrix, int target) {
        boolean res=false;
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
if (matrix[i][j]==target){
    res=true;
}
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
         int target = 3;
         System.out.println(searchMatrix(matrix,target));
    }
    
}
