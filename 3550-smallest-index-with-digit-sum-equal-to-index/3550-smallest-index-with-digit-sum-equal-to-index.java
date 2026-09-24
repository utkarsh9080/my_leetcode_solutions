class Solution {
    public int smallestIndex(int[] nums) {
        for(int i =0 ; i<nums.length;i++){
            if(i==sumofdi(nums[i])) return i;
        }
        return -1;
    }
    public static int sumofdi(int num){
        int sum=0;
        while(num>0){
            int temp = num%10;
            sum+=temp;
            num = num/10;
        }
        return sum;
    }
}