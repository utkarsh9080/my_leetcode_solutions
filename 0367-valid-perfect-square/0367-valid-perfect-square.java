// class Solution {
//     public boolean isPerfectSquare(int num) {
//         if(Math.sqrt(num)%1==0){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }

class Solution {
    public boolean isPerfectSquare(long num) {
        long x = num;
        while (x * x > num) {
            x = (x + num / x) / 2;
        }
        return x * x == num;
        
    }
}