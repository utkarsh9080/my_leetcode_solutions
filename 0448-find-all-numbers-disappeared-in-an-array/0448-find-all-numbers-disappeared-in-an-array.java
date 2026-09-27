class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);   
        }
        ArrayList<Integer> missing = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if (!mapp.containsKey(i)) {
                missing.add(i);
            }
        }
        return missing;
    }
}