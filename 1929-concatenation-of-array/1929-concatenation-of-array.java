class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] num = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            num[i]=nums[i];
            num[i+nums.length]=nums[i];
        }
        return num;
    }
}