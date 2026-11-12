class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            String s= Integer.toString(nums[i]);
            String c= Integer.toString(nums[i+1]);
            String d = s+c;
            int temp = Integer.parseInt(d);
            min = Math.min(temp,min);
        }
        return min;
    }

}