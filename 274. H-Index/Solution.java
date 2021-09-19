class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int n = citations.length;
//         Arrays.sort(citations);
//         int hIndex = 0;
        
//         for(int i=0;i<n;i++) {
//             if(n-i > hIndex) {
//                 hIndex = Math.min(n-i, citations[i]);
//             }
//         }
        
//         return hIndex;
        
        //using binary search
        
//         int left = 0, right = n-1;
        
//         while(left <= right) {
            
//             int mid = left + (right - left) / 2;
            
//             if(citations[mid] == n-mid) {
//                 return n-mid;
//             }else if(citations[mid] > n-mid){
//                 right = mid - 1;
//             }else {
//                 left = mid + 1;
//             }
            
//         }
        
//         return n-left;
        
        
        //using bucket or radix sort

        int bucket[] = new int[n+1];
        
        for(int i=0;i<n;i++) {
            if(citations[i] > n) {
                bucket[n]++;
            }else {
                bucket[citations[i]]++;
            }
        }
        
        int count = 0;
        
        for(int i=n;i>=0;i--) {
            count += bucket[i];
            if(count >= i) {
                return i;
            }
        }
        
        return 0;
    }
}
