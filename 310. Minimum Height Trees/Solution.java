class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> result = new ArrayList<>();
        
        if(n <= 0) return result;
        
        if(n == 1) {
            result.add(0);
            return result;
        }
        
        int degree[] = new int[n];
        List<List<Integer>> adjacencyList = new ArrayList<>();
        
        for(int i=0;i<n;i++) {
            adjacencyList.add(new ArrayList<>());
        }
        
        for(int e[]: edges) {
            degree[e[0]]++;
            degree[e[1]]++;
            adjacencyList.get(e[0]).add(e[1]);
            adjacencyList.get(e[1]).add(e[0]);
        }
        
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i=0;i<n;i++) {
            if(degree[i] == 1) {
                queue.add(i);
            }
        }
        
        while(n > 2) {
            int size = queue.size();
            n = n-size;
            while(size-- > 0) {
                int v = queue.remove();
                for(int i: adjacencyList.get(v)) {
                    degree[i]--;
                    if(degree[i] == 1) {
                        queue.add(i);
                    }
                }
            }
        }
        result.addAll(queue);
        
        return result;
    }
}
