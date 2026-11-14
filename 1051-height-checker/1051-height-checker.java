// class Solution {
//     public int heightChecker(int[] heights) {
//         int[] copy = Arrays.copyOf(heights,heights.length);
//         Arrays.sort(heights);
//         int count=0;
//         for(int i=0;i<copy.length;i++){
//             if(copy[i]!=heights[i]){
//                 count++;
//             }
//         }
//         return count;
//     }
// }

class Solution {
    public int heightChecker(int[] heights) {
        int[] count = new int[101];
        for (int h : heights) {
            count[h]++;
        }
        int res = 0;
        int currentExpectedHeight = 1;
        // traverse the heights array
        for (int i = 0; i < heights.length; i++) {
            while (count[currentExpectedHeight] == 0) {
                currentExpectedHeight++;
            }
            // compare the actual height to the sorted in the array of count
            if (heights[i] != currentExpectedHeight) {
                res++;
            }
            // consume the occurrence of that expected height
            count[currentExpectedHeight]--;
        }
        return res;
    }
}