// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int[] n = new int[arr.length];
//         for (int i = 0; i < arr.length; i++) {
//             if (i == arr.length - 1) {
//                 n[i] = -1;
//                 break;
//             }
//             n[i] = gimmemax(arr, i);
//         }
//         return n;
//     }
//     public static int gimmemax(int[] arr, int index) {
//         int max = 0;
//         for (int i = index + 1; i < arr.length; i++) {
//             max = Math.max(max, arr[i]);
//         }
//         return max;
//     }
// }
// too much?

class Solution {
    public int[] replaceElements(int[] arr) {
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }
}
