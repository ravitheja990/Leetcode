class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {        
        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        
        int len1 = nums1.length;
        int len2 = nums2.length;
        
        int low = 0, high = len1;
        
        while(low <= high) {
            int partitionA = (low + high)/2;
            int partitionB = (len1 + len2 + 1)/2 -partitionA;
            
            int maxLeftA = partitionA == 0 ? Integer.MIN_VALUE : nums1[partitionA - 1]; 
            int minRightA = partitionA == len1 ? Integer.MAX_VALUE : nums1[partitionA];
            
            int maxLeftB = partitionB == 0 ? Integer.MIN_VALUE : nums2[partitionB - 1];
            int minRightB = partitionB == len2 ? Integer.MAX_VALUE : nums2[partitionB];
            
            if(maxLeftA <= minRightB && maxLeftB <= minRightA) {
                if( (len1 + len2) % 2 == 0) {
                    return (double) ( Math.max(maxLeftA, maxLeftB) + Math.min(minRightA, minRightB) ) / 2;
                }else {
                    return Math.max(maxLeftA, maxLeftB);
                }
            }else if(maxLeftA > minRightB) { 
                high = partitionA-1;
            }else {
                low = partitionA+1;
            } 
        }
        
        throw new IllegalArgumentException();
    }
}
