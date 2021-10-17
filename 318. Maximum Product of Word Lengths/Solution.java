class Solution {
    
    public int maxProduct(String[] words) {
        int maxLen = 0;
        int n = words.length;
        int state[] = new int[n];
        
        for(int i=0;i<n;i++) {
            state[i] = getStateFromString(words[i]);
        }
        for(int i=0;i<n;i++) {
            for(int j=i+1;j<n;j++) {
                if((state[i] & state[j]) == 0) {
                    maxLen = Math.max(maxLen, words[i].length()*words[j].length());   
                }
            }
        }
        
        return maxLen;
    }
    
    private int getStateFromString(String str) {
        int state = 0;
        for(char c: str.toCharArray()) {
            int index = c-'a';
            state = state | 1 << index;
        }
        return state;
    }
    
    // public int maxProduct(String[] words) {
    //     int maxLen = 0;
    //     for(int i=0;i<words.length;i++) {
    //         String str1 = words[i];
    //         for(int j=i+1;j<words.length;j++) {
    //             String str2 = words[j];
    //             if(!doesGivenWordsContainCommonLetter(str1, str2)) {
    //                 maxLen = Math.max(maxLen, (str1.length())*(str2.length()));
    //             }
    //         }
    //     }
    //     return maxLen;
    // }
    
    // private boolean doesGivenWordsContainCommonLetter(String str1, String str2) {
    //     for(char c : str1.toCharArray()) {
    //         if(str2.indexOf(c) != -1) {
    //             return true;
    //         }
    //     }
    //     return false;
    // }    
}
