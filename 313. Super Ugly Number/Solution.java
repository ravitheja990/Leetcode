class Solution {
//     public int nthSuperUglyNumber(int n, int[] primes) {
//         int[] dp = new int[n+1];
//         int k = primes.length;
//         int[] pointers = new int[k];
//         dp[1] = 1;
        
//         Arrays.fill(pointers, 1);
        
//         for(int j=2;j<=n;j++) {
//             int min = Integer.MAX_VALUE;
            
//             for(int i=0;i<k;i++) {
//                 min = Math.min(min, dp[pointers[i]] * primes[i]);
//             }
            
//             dp[j] = min;
            
//             for(int i=0;i<k;i++) {
//                 if(min == dp[pointers[i]] * primes[i]) {
//                     pointers[i]++;
//                 }
//             }
//         }
        
//         return dp[n];
//     }
    
    public class Pair implements Comparable<Pair>{
        int prime;
        int pointer;
        int value;

        public Pair(int prime, int pointer, int value) {
            this.prime = prime;
            this.pointer = pointer;
            this.value = value;
        }

        public int compareTo(Pair pair) {
            return this.value-pair.value;
        }
    }
    
    public int nthSuperUglyNumber(int n, int[] primes) {        
        int[] dp = new int[n+1];
        dp[1] = 1;
        Queue<Pair> pq = new PriorityQueue<Pair>();
        int k = primes.length;
        
        for(int i=0;i<k;i++) {
            pq.add(new Pair(primes[i], 1, primes[i]));
        }
        
        for(int i=2;i<=n;) {
            Pair rp = pq.remove();
            if(dp[i-1] != rp.value) {
                dp[i] = rp.value;
                i++;
            }
            pq.add(new Pair(rp.prime, rp.pointer+1, rp.prime * dp[rp.pointer+1]));
        }
        
        return dp[n];
    }
    
}
