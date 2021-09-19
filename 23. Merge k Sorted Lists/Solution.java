/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        
        return mergeKSortedLists(lists, 0, lists.length-1);
    }
    
    private ListNode mergeKSortedLists(ListNode lists[], int si, int ei) {
        if(ei < si) return null;
        if(si == ei) return lists[si];
        int mid = (si + ei)/2;
        ListNode l1 = mergeKSortedLists(lists, si, mid);
        ListNode l2 = mergeKSortedLists(lists, mid+1, ei);
        
        return mergeTwoSLL(l1, l2);
    }
    
    private ListNode mergeTwoSLL(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return l1 != null ? l1 : l2;
        
        ListNode dummyNode = new ListNode(-1);
        ListNode prev = dummyNode;
        ListNode c1 = l1, c2 = l2;
        
        while(c1 != null && c2 != null) {
            if(c1.val < c2.val) {
                prev.next = c1;
                c1 = c1.next;
            }else {
                prev.next = c2;
                c2 = c2.next;
            }
            prev = prev.next;
        }
        
        prev.next = c1 != null ? c1 : c2;        
        
        return dummyNode.next;
    }
}
