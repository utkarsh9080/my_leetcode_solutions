class Solution {
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> ls = new ArrayList<>(hm.entrySet());
        per(nums, new ArrayList<>(), ls);
        return ans;
    }

    public void per(int[] nums, List<Integer> current, List<Map.Entry<Integer, Integer>> ls) {
        if (current.size() == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }
        for (Map.Entry<Integer, Integer> entry : ls) {
            if (entry.getValue() == 0) continue;
            int c = entry.getKey();
            current.add(c);
            entry.setValue(entry.getValue()-1);
            per(nums,current,ls);
            current.remove(current.size()-1);
            entry.setValue(entry.getValue() + 1);
        }
    }
}