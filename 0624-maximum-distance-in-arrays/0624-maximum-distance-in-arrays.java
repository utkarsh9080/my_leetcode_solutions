// class Solution {
//     public int maxDistance(List<List<Integer>> arrays) {
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         for(List<Integer> x:arrays){
//             min= Math.min(min,x.get(0));
//             max= Math.max(max,x.get(x.size()-1));
//         }
//         return max-min;
//     }
// }


class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int min = arrays.get(0).get(0);
        int max = arrays.get(0).get(arrays.get(0).size()-1);
        int ans=0;
        for(int i=1;i<arrays.size();i++){
            int currmax=arrays.get(i).get(arrays.get(i).size()-1);
            int currmin=arrays.get(i).get(0);
            ans = Math.max(ans,currmax-min);
            ans=Math.max(ans,max-currmin);
            min=Math.min(min,currmin);
            max=Math.max(max,currmax);
        }
        return ans;
    }
}