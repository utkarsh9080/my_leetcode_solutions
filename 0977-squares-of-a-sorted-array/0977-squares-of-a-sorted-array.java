// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             nums[i]=nums[i]*nums[i];
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int[] res = new int[nums.length];
        int i = nums.length-1;
        while(right>=left){
            if((nums[left]*nums[left])>(nums[right]*nums[right])){
                res[i] = nums[left]*nums[left];
                left++;
                i--;
            }
            else{
                res[i] = nums[right]*nums[right];
                right--;
                i--;
            }
        }
        return res;
    }
}