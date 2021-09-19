class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> wellFormedParenthesis = new ArrayList<>();
        
        generateAllWellFormedParenthesis("(", 1, 0, wellFormedParenthesis, n);
        
        return wellFormedParenthesis;
    }
    
    private void generateAllWellFormedParenthesis(String current, int open, int close, List<String> wellFormedParenthesis, int n) {
        if(2*n == current.length()) {
            wellFormedParenthesis.add(current);
            return;
        }
        if(open < n) {
            generateAllWellFormedParenthesis(current+"(", open+1, close, wellFormedParenthesis, n);
        }
        if(close < open) {
            generateAllWellFormedParenthesis(current+")", open, close+1, wellFormedParenthesis, n);
        }
    }
}
