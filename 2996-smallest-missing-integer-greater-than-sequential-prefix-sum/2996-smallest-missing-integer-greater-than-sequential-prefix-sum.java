// class Solution {
//     public int missingInteger(int[] nums) {
//         int prefixsum=0;
//         if(nums.length==1) return ++nums[0];
//         if(nums[1]==(nums[0]+1)) prefixsum+=nums[0];
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]!=(nums[i-1]+1)){
//                 break;
//             }else{
//                 prefixsum+=nums[i];
//             }
//         }
//         return s(prefixsum,nums);
//     }
//     public int s(int num,int[] nums){
//         for(int i=0;i<nums.length;i++){
//             if(num==nums[i]){
//                 num++;
//                 return s(num,nums);
//             }
//         }
//         return num;
//     }
// }


class Solution {
    public int missingInteger(int[] nums) {
        int prefixsum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1] + 1) {
                break;
            }
            prefixsum += nums[i];
        }
        return s(prefixsum, nums);
    }
    public int s(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (num == nums[i]) {
                return s(num + 1, nums);
            }
        }
        return num;
    }
}