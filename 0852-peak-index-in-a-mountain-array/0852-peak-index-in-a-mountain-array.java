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