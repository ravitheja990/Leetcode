class Solution {
    class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
        
        public TrieNode() {
            
        }
    }
    
    TrieNode root = new TrieNode();
    boolean[][] flag;
    
    public List<String> findWords(char[][] board, String[] words) {
        Set<String> result = new HashSet<>();
        flag = new boolean[board.length][board[0].length];
        addToTrie(words);
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[0].length;j++) {
                if(root.children[board[i][j]-'a'] != null) {
                    search(board, i, j, root, "", result);
                }
            }
        }
        
        return new ArrayList<>(result);
    }
    
    private void addToTrie(String[] words) {
        for(String str: words) {
            TrieNode node = root;
            for(int i=0;i<str.length();i++) {
                char c = str.charAt(i);
                if(node.children[c-'a'] == null) {
                    node.children[c-'a'] = new TrieNode();
                }
                node = node.children[c-'a'];
            }
            node.isEnd = true;
        }
    }
    
    private void search(char[][] board, int i, int j, TrieNode node, String word, Set<String> result) {
        if(i >= board.length || i < 0 || j >= board[i].length || j < 0 || flag[i][j] || node.children[board[i][j]-'a'] == null) {
            return;
        }
        flag[i][j] = true;
        node = node.children[board[i][j]-'a'];
        if(node.isEnd) {
            result.add(word + board[i][j]);
        }
        search(board, i+1, j, node, word + board[i][j], result);
        search(board, i-1, j, node, word + board[i][j], result);
        search(board, i, j+1, node, word + board[i][j], result);
        search(board, i, j-1, node, word + board[i][j], result);
        
        flag[i][j] = false;
    }
}
