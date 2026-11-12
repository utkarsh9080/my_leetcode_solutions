class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
         //1 2 3 4 
         // -4 -3 6 10 20 30
        // Arrays.sort(arr1);
        // Arrays.sort(arr2);
        int count =0;
        for(int i=0;i<arr1.length;i++){
            // if(Math.abs(arr1[i]-arr2[arr2.length-1])>d){
            //     count++;
            // }
            boolean h = true;
            for(int j=0;j<arr2.length;j++){
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    h=false;
                    break;
                }
            }
            if(h){
                count++;
            }
        }
        return count;
    }
}