public class Main {
    public static void main(String[] args) {
        int[][] coordinates = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
        Solution solution = new Solution();

        System.out.println("are given coordinates form a straight line :: " + solution.checkStraightLine(coordinates));
    }
}