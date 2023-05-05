public class Main {
    public static void main(String[] args) {
        int k = 3;
        int[] nums = {4, 5, 8, 2};
        Solution solution = new Solution(k, nums);
        System.out.println("kth largest element in :: " + solution.add(3));
        System.out.println("kth largest element in :: " + solution.add(5));
        System.out.println("kth largest element in :: " + solution.add(10));
        System.out.println("kth largest element in :: " + solution.add(9));
        System.out.println("kth largest element in :: " + solution.add(4));
    }
}