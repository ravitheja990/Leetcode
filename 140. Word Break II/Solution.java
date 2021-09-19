class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        Map<Integer, List<String>> hm = new HashMap<>();
        Set<String> hs = new HashSet<>(wordDict);
        return wordBreakHelper(s, 0, hs, hm);
    }
    
    private List<String> wordBreakHelper(String s, int start, Set<String> hs, Map<Integer, List<String>> hm) {
        if(hm.containsKey(start)) {
            return hm.get(start);
        }
        
        List<String> validSubstr = new ArrayList<>();
        
        if(start == s.length()) {
            validSubstr.add("");
        }
        
        for(int end=start+1;end<=s.length();end++) {
            String prefix = s.substring(start, end);
            if(hs.contains(prefix)) {
                List<String> suffixes = wordBreakHelper(s, end, hs, hm);
                for(String suffix: suffixes) {
                    validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
                }
            }
        }
        
        hm.put(start, validSubstr);
        return validSubstr;
    }
}
