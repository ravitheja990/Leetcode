public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 2, 1};
        int[] queries = {3, 10, 21};

        Solution solution = new Solution();
        int[] output = solution.answerQueries(nums, queries);
        for(int val: output) {
            System.out.println("output arr :: " + val);
        }
    }
}