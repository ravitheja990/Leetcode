public class Main {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        Solution solution = new Solution();
        System.out.println("index of target ele is :: " + solution.search(nums, target));
    }
}