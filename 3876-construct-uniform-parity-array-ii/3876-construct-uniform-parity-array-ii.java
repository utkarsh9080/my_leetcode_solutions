import java.util.*;

class Solution {
    public boolean uniformArray(int[] nums) {
        Arrays.sort(nums);

        int smallest = nums[0];

        if (smallest % 2 == 0) {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    return false;
                }
            }
        } else {
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] % 2 == 0) {
                    nums[i] = nums[i] - smallest;
                }
            }
        }

        return true;
    }
}