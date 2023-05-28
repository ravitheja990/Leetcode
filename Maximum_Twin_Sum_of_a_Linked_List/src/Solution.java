import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int pairSum(ListNode head) {
        int maxTwinSum = 0;
        List<Integer> list = new ArrayList<>();

        while(head != null) {
            list.add(head.val);
            head = head.next;
        }

        int start = 0, end = list.size()-1;

        while(start < end) {
            int eachTwinSum = list.get(start++) + list.get(end--);
            maxTwinSum = Math.max(eachTwinSum, maxTwinSum);
        }

        return maxTwinSum;
    }
}
