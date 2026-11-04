class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int count =0,i=0;
        while(i!=nums.length-1){
            count+=Math.abs(nums[i]-nums[nums.length-1]);
            i++;
        }
        return count;
    }
}