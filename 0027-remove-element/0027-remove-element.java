class Solution {
    public int removeElement(int[] nums, int val) {
        int in=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[in]=nums[i];
                in++;
            }
        }
        return in;
    }
}