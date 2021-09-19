class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0) {
            return false;
        }
        if(n == 1) {
            return true;
        }
        if(n % 2 != 0) {
            return false;
        }
        return isPowerOfTwo(n/2);
        // int num = 1;
        // for(int i=0;i<=Math.ceil(Math.sqrt(n));i++) {
        //     if(num == n) {
        //         return true;
        //     }else {
        //         num = num * 2;
        //     }
        // }
        
        // while(n > 1) {
        //     if(n % 2 == 0) {
        //         n = n/2;
        //     }else {
        //         return false;
        //     }
        // }
        
        // return false;
    }
}
