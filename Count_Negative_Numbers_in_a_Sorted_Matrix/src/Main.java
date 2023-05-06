public class Main {
    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        Solution solution = new Solution();
        System.out.println("negative number count in above row wise decreasing order sorted grid is :: "
                + solution.countNegatives(grid));
    }
}