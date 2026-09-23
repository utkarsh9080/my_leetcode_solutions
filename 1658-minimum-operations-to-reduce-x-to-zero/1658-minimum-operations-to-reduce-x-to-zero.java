// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int i = 0, j = nums.length - 1;
//         int count = 0;
//         if (nums.length == 1 && nums[0] != x) {
//             return -1;
//         }
//         if (nums.length == 1 && nums[0] == x) {
//             return 1;
//         }
//         while (i <= j) {
//             if (x == 0)
//                 break;

//             if (nums[i] == nums[j] && nums[i] < x) {
//                 x = x - nums[i++];
//                 count++;
//                 continue;
//             }
//             if (nums[i] > nums[j] && nums[i] < x) {
//                 x = x - nums[i++];
//                 count++;
//             } else if (nums[i] < nums[j] && nums[j] < x) {
//                 x = x - nums[j--];
//                 count++;
//             } else {
//                 break;
//             }
//         }
//         if (x == 0)
//             return count;
//         return -1;
//     }
// }

class Solution {
    public int minOperations(int[] nums, int x) {
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int target = total - x;
        if (target == 0) {
            return nums.length;
        }
        int left = 0;
        int sum = 0;
        int maxLen = -1;
        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];
            while (left <= right && sum > target) {
                sum -= nums[left++];
            }
            if (sum == target) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
        }
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }
}




