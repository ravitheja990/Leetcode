class LRUCache {
    int capacity;
    Map<Integer, Integer> cacheMap = new HashMap<>();
    LinkedList<Integer> list = new LinkedList<Integer>();
    
    public LRUCache(int capacity) {
        this.capacity = capacity;
    }
    
    public int get(int key) {
        if(cacheMap.containsKey(key)) {
            list.remove(new Integer(key));
            list.addLast(key);
            return cacheMap.get(key);
        }
        return -1;
    }
    
    public void put(int key, int value) {
        int cacheSize = cacheMap.size();
        if(cacheSize < capacity) {
            if(cacheMap.containsKey(key)) {
                cacheMap.put(key, value);
                list.remove(new Integer(key));
                list.addLast(key);
            }else {
                cacheMap.put(key, value);
                list.addLast(key);
            }
        }else {
            if(cacheMap.containsKey(key)) {
                cacheMap.put(key, value);
                list.remove(new Integer(key));
                list.addLast(key);
            }else {
                int removedKey = list.removeFirst();
                list.addLast(key);
                cacheMap.remove(removedKey);
                cacheMap.put(key, value);
            }
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
