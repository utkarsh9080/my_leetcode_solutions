class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] num = new int[nums.length];
        int i=0,j=n,k=0;
        while(j<nums.length){
            num[k++]=nums[i++];
            num[k++]=nums[j++];
        }
        return num;
    }
}