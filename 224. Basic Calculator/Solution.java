class Solution {
    public int calculate(String s) {
        int sum = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) {
                int val = 0;
                while(i < s.length() && Character.isDigit(s.charAt(i))) {
                    val = val * 10;
                    val = val + (s.charAt(i) - '0');
                    i++;
                }
                i--;
                val = val * sign;
                sum  = sum + val;
                sign = 1;
            }else if(ch == '(') {
                stack.push(sum);
                stack.push(sign);
                sum = 0;
                sign = +1;
            }else if(ch == ')') {
                sum = sum * stack.pop();
                sum = sum + stack.pop();
            }else if(ch == '-') {
                sign *= -1;
            }
        }
        
        return sum;
    }
}
