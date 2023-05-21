public class Main {
    public static void main(String[] args) {
        int[] rec1 = {0,0,2,2};
        int[] rec2 = {1,1,3,3};

        Solution solution = new Solution();
        System.out.println("do given two rectangles overlap :: " + solution.isRectangleOverlap(rec1, rec2));
    }
}