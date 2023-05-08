import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int n1 = nums1.length;
        int n2 = nums2.length;

        if(nums1[0] == nums2[n2-1]) return new ArrayList<>(Arrays.asList(nums1[0]));
        if(nums2[0] == nums1[n1-1]) return new ArrayList<>(Arrays.asList(nums2[0]));

        List<Integer> list = new ArrayList<>();
        int prev = -1;

        for(int num: nums1) {
            int common = getCommon(nums2, num);
            if(common > prev) {
                list.add(common);
                prev = common;
            }
        }

        return list;
    }

    private int getCommon(int[] arr, int val) {
        int start = 0;
        int end = arr.length-1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == val) return val;
            else if(arr[mid] > val) end = mid-1;
            else start = mid+1;
        }

        return -1;
    }
}
