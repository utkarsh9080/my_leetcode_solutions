class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int[] max = new int[2];
        max[0]=Integer.MIN_VALUE;
        while(i<arr.length){
            if(arr[i]>max[0]){
                max[0]=arr[i];
                max[1]=i;
            }
            i++;
        }
        return max[1];
    }
}


// class Solution {
//     public int peakIndexInMountainArray(int[] arr) {
//         int start=0;
//         int end=arr.length-1;
//         int index=0;
//         while(start<=end){
//             int mid=(start+end)/2;
//             if(mid!=0 && mid!=arr.length-1&& arr[mid]>arr[mid+1] & arr[mid]>arr[mid-1] ){
//                 return mid;
//             }else if(arr[mid]<arr[mid+1]){
//                 start=mid+1;
//             }else{
//                 end=mid-1;
//             }
           
//         }
//          return index;
//     }
// }
