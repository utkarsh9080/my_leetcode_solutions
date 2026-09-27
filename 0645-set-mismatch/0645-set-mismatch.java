class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> mapp= new HashMap<>();
        for(int i =0 ; i<nums.length;i++){
            mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);   
        }
        int key=0;
        for(Map.Entry<Integer,Integer> e : mapp.entrySet()){
            if(e.getValue().equals(2)){
                key=e.getKey();
                break;
            }
        }
        int missing = 0;

        for (int i = 1; i <= nums.length; i++) {
            if (!mapp.containsKey(i)) {
                missing = i;
                break;
            }
        }
        return new int[]{key,missing};
    }
}