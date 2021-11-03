class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = words.length;
        for(int i=0;i<n;i++) {
            map.put(words[i], i);
        }
        if(map.containsKey("")) {
            int blankIndex = map.get("");
            for(int i=0;i<n;i++) {
                if(i != blankIndex && isPalindrome(words[i])) {
                    list.add(Arrays.asList(i, blankIndex));
                    list.add(Arrays.asList(blankIndex, i));
                }
            }
        }
        for(int i=0;i<n;i++) {
            String reversed = new StringBuilder(words[i]).reverse().toString();
            Integer reversedIndex = map.get(reversed);
            if(reversedIndex != null && reversedIndex != i) {
                list.add(Arrays.asList(i, reversedIndex));
            }
        }
        for(int i=0;i<n;i++) {
            String cur = words[i];
            for(int cut=1;cut<cur.length();cut++) {
                String left = cur.substring(0,cut);
                String right = cur.substring(cut);
                if(isPalindrome(left)) {
                    String reversedRight = new StringBuilder(right).reverse().toString();
                    if(map.containsKey(reversedRight)) {
                        list.add(Arrays.asList(map.get(reversedRight), i));
                    }
                }
                if(isPalindrome(right)) {
                    String reversedLeft = new StringBuilder(left).reverse().toString();
                    if(map.containsKey(reversedLeft)) {
                        list.add(Arrays.asList(i, map.get(reversedLeft)));
                    }
                }
            }
        }
        return list;
    }
    
    private boolean isPalindrome(String str) {
        int i=0;
        int j=str.length()-1;
        while(i < j) {
            if(str.charAt(i++) != str.charAt(j--)) {
                return false;
            }
        }
        return true;
    }
    
    // brute force solution
    // public List<List<Integer>> palindromePairs(String[] words) {
    //     List<List<Integer>> list = new ArrayList<>();
    //     int n = words.length;
    //     for(int i=0;i<n;i++) {
    //         for(int j=0;j<n;j++) {
    //             if(i != j) {
    //                 if(isPalindrome(words[i]+words[j])) {
    //                     list.add(Arrays.asList(i, j));
    //                 }
    //             }
    //         }
    //     }
    //     return list;
    // }
}
