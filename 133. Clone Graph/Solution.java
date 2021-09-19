/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        Map<Node, Node> visitedMap = new HashMap<>();
        visitedMap.put(node, new Node(node.val, new ArrayList<>()));
        dfs(node, visitedMap);
        
        return visitedMap.get(node);
    }
    
    private void dfs(Node node, Map<Node, Node> visitedMap) {
        for(Node neighbor: node.neighbors) {
            if(!visitedMap.containsKey(neighbor)) {
                visitedMap.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                dfs(neighbor, visitedMap);
            }
            visitedMap.get(node).neighbors.add(visitedMap.get(neighbor));
        }
    }
}
