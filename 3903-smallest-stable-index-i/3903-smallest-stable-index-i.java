// class Solution {
//     public int firstStableIndex(int[] nums, int k) {
//         if(nums.length==1) return 0;
//         int l=0;
//         while(l<nums.length){
//             int max=Integer.MIN_VALUE;
//             int min = Integer.MAX_VALUE;
//             for(int i=0;i<=l;i++){
//                 max = Math.max(max,nums[i]);
//             }
//             for(int j=l;j<nums.length;j++){
//                 min=Math.min(min,nums[j]);
//             }
//             if((max-min)<=k){
//                 return l;
//             }
//             l++;
//         }
//         return -1;
        
//     }
// }

class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int[] right=new int[n];
        right[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
         right[i]=Math.min(right[i+1],nums[i]);
        }
        int left=0;
        for(int i=0;i<n;i++){
            left=Math.max(left,nums[i]);
            if(left-right[i]<=k){
                return i;
            }
        }
        return -1;
    }

}