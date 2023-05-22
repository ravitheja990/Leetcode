public class Main {
    public static void main(String[] args) {
        int[][] coordinates = {{1,1},{2,3},{3,2}};
        Solution solution = new Solution();
        System.out.println("does given coordinates contain a boomerang :: " + solution.isBoomerang(coordinates));
    }
}