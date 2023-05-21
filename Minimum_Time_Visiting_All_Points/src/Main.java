public class Main {
    public static void main(String[] args) {
        int[][] points = {{1,1},{3,4},{-1,0}};

        Solution solution = new Solution();
        System.out.println("minimum time taken to reach all points is :: " + solution.minTimeToVisitAllPoints(points));
    }
}