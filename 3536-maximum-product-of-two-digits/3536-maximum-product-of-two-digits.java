// class Solution {
//     public int maxProduct(int n) {
//         ArrayList<Integer> ar = new ArrayList<>();
//         while(n>0){
//             ar.add(n%10);
//             n=n/10;
//         }
//         Collections.sort(ar);
//         return ar.get(ar.size()-1)*ar.get(ar.size()-2);
//     }
// }

//worst tc lol

class Solution {
    public int maxProduct(int n) {
        int max1 = 0;
        int max2 = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
            n = n / 10;
        }
        return max2 * max1;
    }
}