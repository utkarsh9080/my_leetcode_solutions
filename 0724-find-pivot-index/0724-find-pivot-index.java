// class Solution {
//     public int pivotIndex(int[] nums) {
//         for(int i=0;i<nums.length;i++){
//             int lefts=0,rights=0;
//             for(int j=0;j<=i;j++){
//                 lefts+=nums[j];
//             }
//             for(int k=i;k<nums.length;k++){
//                 rights+=nums[k];
//             }
//             if(lefts==rights){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }


class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0;
        for(int x:nums) sum+=x;
        int leftSum=0;
        for(int i=0;i<nums.length;i++){
            int rightSum=sum-nums[i]-leftSum;
            if(rightSum==leftSum) return i;
            leftSum+=nums[i];
        }
        return -1;
    }
}