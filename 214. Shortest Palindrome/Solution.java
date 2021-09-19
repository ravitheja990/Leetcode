class Solution {
    public String shortestPalindrome(String s) {
        if(s == null || s.length() < 2) {
            return s;
        }
        String rev = new StringBuilder(s).reverse().toString();
        String l = s + "#" + rev;
        int p[] = new int[l.length()];
        
        for(int i=1;i<l.length();i++) {
            int j = p[i-1];
            while(j>0 && l.charAt(i) != l.charAt(j)) {
                j = p[j-1];
            }
            
            if(l.charAt(i) == l.charAt(j)) {
                p[i] = j+1;
            }
        }
        
        return rev.substring(0, s.length()-p[l.length()-1]) + s;
    }
}
