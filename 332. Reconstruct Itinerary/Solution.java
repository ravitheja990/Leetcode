class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        int n = tickets.size();
        for(int i=0;i<n;i++) {
            String source = tickets.get(i).get(0);
            String destination = tickets.get(i).get(1);
            if(!map.containsKey(source)) {
                PriorityQueue<String> pq = new PriorityQueue<>();
                map.put(source, pq);
            }
            map.get(source).add(destination);
        }
        LinkedList<String> list = new LinkedList<>();
        dfs("JFK", map, list);
        return list;
    }
    
    private void dfs(String source, Map<String, PriorityQueue<String>> map, LinkedList<String> list) {
        PriorityQueue<String> pq = map.get(source);
        while(pq != null && !pq.isEmpty()) {
            String destination = pq.remove();
            dfs(destination, map, list);
        }
        list.addFirst(source);
    }
}
