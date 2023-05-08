public class Solution {
    public boolean isPerfectSquare(int num) {
        if(num == 0 || num == 1 || num == 4) return true;
        int start = 3;
        int end = num/3;

        while(start <= end) {
            long mid = start + (end-start)/2;
            long square = mid*mid;
            if(square == num) return true;
            else if(square > num) end = (int) mid-1;
            else start = (int) mid+1;
        }

        return false;
    }
}
