public class Main {
    public static void main(String[] args) {
        int[][] points = {{1,3},{3,3},{5,3},{2,2}};
        int[][] queries = {{2,3,1},{4,3,1},{1,1,2}};

        Solution solution = new Solution();
        System.out.println("list of counts of points inside each query circle is :: " + solution.countPoints(points, queries));
    }
}