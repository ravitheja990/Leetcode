class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> letterCombinationsOfDigits = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return letterCombinationsOfDigits;
        }
        
        Map<Character, String> mapping = new HashMap<>();
        mapping.put('2', "abc");
        mapping.put('3', "def");
        mapping.put('4', "ghi");
        mapping.put('5', "jkl");
        mapping.put('6', "mno");
        mapping.put('7', "pqrs");
        mapping.put('8', "tuv");
        mapping.put('9', "wxyz");
        
        backtrack(mapping, 0, digits, new StringBuilder(), letterCombinationsOfDigits);
        
        return letterCombinationsOfDigits;
    }
    
    private void backtrack(Map<Character, String> mapping, int index, String digits, StringBuilder sb, List<String> letterCombinationsOfDigits) {
        if(index == digits.length()) {
            letterCombinationsOfDigits.add(sb.toString());
            return;
        }
        
        String current = mapping.get(digits.charAt(index));
        
        for(int i=0;i<current.length();i++) {
            sb.append(current.charAt(i));
            backtrack(mapping, index+1, digits, sb, letterCombinationsOfDigits);
            sb.deleteCharAt(sb.length()-1);
        }
        
        
    }
}
