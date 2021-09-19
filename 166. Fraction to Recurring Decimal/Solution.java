class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) {
            return "0";
        }
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);
        
        StringBuilder ans = new StringBuilder();
        long rem = num % den;
        long quo = num / den;
        boolean negative = true;
        if(numerator > 0 && denominator > 0 || numerator < 0 && denominator < 0) {
            negative = false;
        }
        ans.append(quo);
        
        if(rem == 0) {
            if(!negative) {
                return ans.toString();
            }
            ans.insert(0, "-");
            return ans.toString();
        }else {
            ans.append(".");
            Map<Long, Integer> map = new HashMap<>();
            while(rem != 0) {
                if(map.containsKey(rem)) {
                    int len = map.get(rem);
                    ans.insert(len, "(");
                    ans.append(")");
                    break;
                }else {
                    map.put(rem, ans.length());
                    rem = rem * 10;
                    quo = rem / den;
                    rem = rem % den;
                    ans.append(quo);
                }
            }
        }
        
        if(!negative) {
            return ans.toString();
        }
        ans.insert(0, "-");
        
        return ans.toString();
    }
}
