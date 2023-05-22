public class Main {
    public static void main(String[] args) {
        int[][] points = {{0,0},{0,1},{1,0},{0,2},{2,0}};
        Solution solution = new Solution();
        System.out.println("max triangle area in given points is :: " + solution.largestTriangleArea(points));
    }
}