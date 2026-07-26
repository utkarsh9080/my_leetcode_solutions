class Solution {
    public int maximumProduct(int[] nums) {
        int n= nums.length;
        Arrays.sort(nums);
        int p1=nums[n-3]*nums[n-2]*nums[n-1];
        int p2=nums[0]*nums[1]*nums[n-1];
        return Math.max(p1,p2);
    }
}