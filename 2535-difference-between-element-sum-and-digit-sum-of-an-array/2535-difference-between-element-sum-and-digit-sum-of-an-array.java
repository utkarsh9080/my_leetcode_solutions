class Solution {
    public int differenceOfSum(int[] nums) {
        int sum1=0,sum2=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            sum2+=digit(nums[i]);
        }
        return Math.abs(sum1-sum2);
    }
    public static int digit(int num){
        int sum=0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
}