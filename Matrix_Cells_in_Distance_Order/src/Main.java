public class Main {
    public static void main(String[] args) {
        int rows = 1, cols = 2, rCenter = 0, cCenter = 0;

        Solution solution = new Solution();
        int[][] matrix = new int[rows*cols][2];
        matrix = solution.allCellsDistOrder(rows, cols, rCenter, cCenter);

        for(int[] point: matrix) {
            System.out.println("x point is :: " + point[0]);
            System.out.println("y point is :: " + point[1]);
        }

    }
}