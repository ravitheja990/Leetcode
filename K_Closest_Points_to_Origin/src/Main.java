public class Main {
    public static void main(String[] args) {
        int[][] points = {{1, 3}, {-2, 2}};
        int k=1;

        Solution solution = new Solution();
        System.out.println("k closest points are :: " + solution.kClosest(points, k));
    }
}