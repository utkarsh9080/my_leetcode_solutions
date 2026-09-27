class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=Integer.MIN_VALUE;
        int temp=0;
        for(int i =0 ;i<nums.length;i++){
            if(nums[i]==1){
                temp++;
            }else{
                count = Math.max(temp,count);
                temp =0;
            }
        }
        return Math.max(temp,count);
    }
}