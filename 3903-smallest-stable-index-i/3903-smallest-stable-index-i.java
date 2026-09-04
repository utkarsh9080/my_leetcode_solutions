class Solution {
    public int firstStableIndex(int[] nums, int k) {
        if(nums.length==1) return 0;
        int l=0;
        while(l<nums.length){
            int max=Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<=l;i++){
                max = Math.max(max,nums[i]);
            }
            for(int j=l;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            if((max-min)<=k){
                return l;
            }
            l++;
        }
        return -1;
        
    }
}