//O(nlogn)

// class Solution {
//     public int thirdMax(int[] nums) {
//         HashSet<Integer> hh = new HashSet();
//         for(int i =0;i<nums.length;i++){
//             hh.add(nums[i]);
//         }
//         ArrayList<Integer> list = new ArrayList<>(hh);
//         Collections.sort(list);
//         if(list.size()<3)return list.get(list.size()-1);
//         return list.get(list.size()-3);
//     }
// }


class Solution {
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == first || num == second || num == third)
                continue;
            if (num > first) {
                third = second;
                second = first;
                first = num;
            }
            else if (num > second) {
                third = second;
                second = num;
            }
            else if (num > third) {
                third = num;
            }
        }
        return third == Long.MIN_VALUE ? (int)first : (int)third;
    }
}
