public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 2, 3};
        int target = 2;
        Solution solution = new Solution();
        System.out.println("target element indices list in sorted array is :: " + solution.targetIndices(nums, target));
    }
}