// class Solution {
//     List<List<Integer>> ans = new ArrayList<>();
//     public List<List<Integer>> permute(int[] nums) {
//         permutations(nums,0,new ArrayList<>());
//         return ans;
//     }
//     public void permutations(int[] nums,int index,List<Integer> current){
//         if(current.size()==nums.length){
//             ans.add(new ArrayList<>(current));
//             current.clear();
//             return;
//         }
//         if(index==nums.length){
//             return;
//         }
//         current.add(nums[index]);
//         permutations(nums,index+1,current);
//         current.remove(current.size()-1);
//         permutations(nums,index+1,current);
//     }
// }




class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        permutations(nums,new ArrayList<>(),new boolean[nums.length]);
        return ans;
    }
    public void permutations(int[] nums, List<Integer> current,boolean[] used){
        if(current.size()==nums.length){
            ans.add(new ArrayList<>(current));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(used[i]){
                continue;
            }
            used[i]=true;
            current.add(nums[i]);
            permutations(nums,current,used);
            current.remove(current.size()-1);
            used[i]=false;
        }
    }
}