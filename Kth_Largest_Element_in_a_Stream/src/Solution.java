import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    int size;
    Queue<Integer> minHeap;
    public Solution(int k, int[] nums) {
        this.size = k;
        this.minHeap = new PriorityQueue<>();
        for(int num: nums) {
            minHeap.add(num);
            if(minHeap.size() > this.size) {
                minHeap.remove();
            }
        }
    }
    public int add(int val) {
        minHeap.add(val);
        if(minHeap.size() > this.size) {
            minHeap.remove();
        }
        return minHeap.peek();
    }
}
