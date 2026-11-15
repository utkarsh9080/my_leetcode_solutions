// class Solution {
//     public boolean checkIfExist(int[] arr) {
//         boolean result = false;
//         for(int i=0;i<arr.length;i++){
//             if(checkker(arr,i,arr[i])){
//                 result=true;
//             }
//         }
//         return result;
//     }
//     public static boolean checkker(int[] arr,int index,int num){
//         for(int i=index+1;i<arr.length;i++){
//             if((num/arr[i])==2){
//                 return true;
//             }
//         }
//         return false;
//     }
// }



class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num * 2) ||
                (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
