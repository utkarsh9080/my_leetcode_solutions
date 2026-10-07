// class Solution {
//     public void rotate(int[] nums, int k) {
//         //1,2,3,4,5,6,7
//         //4,3,2,1,5,6,7
//         //7,6,5,1,2,3,4
//         if(nums.length==1||nums.length<k){
//             int l=0;
//             int r=nums.length-1;
//             while(l<r){
//                 int temp =nums[r];
//                 nums[r]=nums[l];
//                 nums[l]=temp;
//                 l++;
//                 r--;
//             }
//             return;
//         }
//         int i=0;
//         int j=nums.length-1-k;
//         while(i<j){
//             int temp =nums[j];
//             nums[j]=nums[i];
//             nums[i]=temp;
//             i++;
//             j--;
//         }

//         i=nums.length-k;
//         j=nums.length-1;
//         while(i<j){
//             int temp =nums[j];
//             nums[j]=nums[i];
//             nums[i]=temp;
//             i++;
//             j--;
//         }


//         i=0;
//         j=nums.length-1;
//         while(i<j){
//             int temp =nums[j];
//             nums[j]=nums[i];
//             nums[i]=temp;
//             i++;
//             j--;
//         }
//     }
// }

class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        if (k == 0) return;
        int i = 0;
        int j = n - k - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = n - k;
        j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
        i = 0;
        j = n - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}