class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = s.length()-1;
        
        while(left < right) {
            while(left < right && !isVowel(arr[left])) {
                left++;
            }
            while(left < right && !isVowel(arr[right])) {
                right--;
            }
            swap(arr, left, right);
            left++;
            right--;            
        }
        
        return new String(arr);
    }
    
    private void swap(char[] arr, int left, int right) {
        char ch = arr[left];
        arr[left] = arr[right];
        arr[right] = ch;
    }
    
    private boolean isVowel(char ch) {
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
          ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }
}
