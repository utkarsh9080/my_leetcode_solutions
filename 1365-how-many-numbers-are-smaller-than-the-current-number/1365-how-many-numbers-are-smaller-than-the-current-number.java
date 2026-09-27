class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int count=0,j=0;
            while(j<nums.length){
                if(nums[i]>nums[j]){
                    count++;
                }
                j++;
            }
            ans[i]=count;
        }
        return ans;
    }
}