class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack = new Stack<>();
        int n = s.length();
        int freq[] = new int[26];
        boolean exists[] = new boolean[26];
        
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        
        for(int i=0;i<n;i++) {
            char ch = s.charAt(i);
            freq[ch-'a']--;
            if(exists[ch-'a']) continue;
            
            while(stack.size() > 0 && stack.peek() > ch && freq[stack.peek()-'a'] > 0) {
                char removed = stack.pop();
                exists[removed - 'a'] = false;
            }
            stack.push(ch);
            exists[ch-'a'] = true;            
        }
        
        char arr[] = new char[stack.size()];
        for(int i=arr.length-1;i>=0;i--) {
            arr[i] = stack.pop();
        }
        
        return new String(arr);
    }
}
