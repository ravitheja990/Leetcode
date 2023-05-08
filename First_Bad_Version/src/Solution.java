public class Solution {
    public int firstBadVersion(int n) {
        if(n == 0) return -1;
        if(isBadVersion(1)) return 1;
        if(!isBadVersion(n)) return -1;

        int start = 1;
        int pivot = 1;
        int end = n;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(isBadVersion(mid)) {
                pivot = mid;
                end = mid-1;
            }else {
                start = mid+1;
            }
        }

        return pivot;
    }


    private boolean isBadVersion(int k) {
        return (k >= 3);
    }
}
