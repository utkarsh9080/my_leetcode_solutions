class Solution {
    public int heightChecker(int[] heights) {
        int[] copy = Arrays.copyOf(heights,heights.length);
        Arrays.sort(heights);
        int count=0;
        for(int i=0;i<copy.length;i++){
            if(copy[i]!=heights[i]){
                count++;
            }
        }
        return count;
    }
}