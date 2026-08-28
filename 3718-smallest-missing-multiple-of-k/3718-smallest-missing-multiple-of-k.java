// class Solution {
//     public int missingMultiple(int[] nums, int k) {
//         HashSet<Integer> h = new HashSet<>();
//         for(int x:nums){
//             h.add(x);
//         }   
//         int temp =k;
//         // for(int i=0;i<h.size();i++){
//         //     if(search(h,k)){
//         //         k=k+temp;
//         //     }else{
//         //         return k;
//         //     }
//         // }
//         // return k+temp;
//         while(search(h,k)){
//             k+=temp;
//         }
//         return k;
//     }
//     static boolean search(HashSet<Integer> h,int k){
//         for(int num:h){
//             if(num==k){
//                 return true;
//             }
//         }
//         return false;
//     }
// }



class Solution {
    public int missingMultiple(int[] nums, int k) {
         int x = k;

        while (true) {
            boolean found = false;

            for (int num : nums) {
                if (num == x) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                return x;
            }

            x += k;
        }
    }
}