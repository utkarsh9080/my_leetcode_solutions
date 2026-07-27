class Solution {
    public int maxProduct(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int p1=(nums[n-2]-1)*(nums[n-1]-1);
        return p1;
    }
}