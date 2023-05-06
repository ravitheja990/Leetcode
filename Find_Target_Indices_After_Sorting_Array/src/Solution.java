import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> tagetIndicesList = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return tagetIndicesList;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int smallerCount = 0;
        int largerCount = 0;

        for(int num: nums) {
            if(num > target) {
                largerCount++;
            }else if(num < target) {
                smallerCount++;
            }
        }

        for(int i=smallerCount;i<n-largerCount;i++) {
            tagetIndicesList.add(i);
        }

        return tagetIndicesList;
    }
}
