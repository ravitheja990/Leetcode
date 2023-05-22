import java.util.Arrays;

public class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int[][] matrix = new int[rows*cols][2];
        int index = 0;


        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[index][0] = i;
                matrix[index][j] = j;
                index++;
            }
        }



        Arrays.sort(matrix, (a, b) -> ( ( ( Math.abs(rCenter - a[0]) ) + ( Math.abs(cCenter-a[1]) )  )  -
                ( ( Math.abs(rCenter - b[0]) ) + ( Math.abs(cCenter - b[1]) )  )  )  );

        return matrix;
    }
}
