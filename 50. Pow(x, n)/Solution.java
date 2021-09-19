class Solution {
    public double myPow(double x, int n) {
        double result = 1.0;
        long power = n;
        if(power < 0) power = -1 * power;
        while(power > 0) {
            if(power % 2 == 1) {
                result *= x;
                power -= 1;
            }else {
                x *= x;
                power /= 2;
            }
        }
        
        if(n < 0) 
            return (double) 1/result;
        return result;
    }
}
