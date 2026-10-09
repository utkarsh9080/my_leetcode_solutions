// class Solution {
//     static int min = Integer.MIN_VALUE;
//     public int jump(int[] nums) {
//         return j(0,0,nums);

//     }
//     public static int j(int index,int jumpss,int[] nums){
//         if(index>nums.length-1) return jumpss;
//         for(int i=0;i<nums.length;i++){
//             min = Math.min(min,j(i+1,jumpss+1,nums));
//         }
//         return min;
//     }
// }




class Solution {
    public int jump(int[] nums) {
        int jumps=0;
        int l=0,r=0;
        while(r<nums.length-1){
            int fartest =0;
            for(int j =l;j<=r;j++){
                fartest=Math.max(j+nums[j],fartest);
            }
            l=r+1;
            r=fartest;
            jumps++;
        }
        return jumps;
    }
}