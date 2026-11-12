// class Solution {
//     public int arrangeCoins(int n) {
//         int num=1,count=0;
//         while(n>=0){
//             if((n-num)>=0){
//                 count++;
//                 n-=num;
//                 num++;
//             }else{
//                 break;
//             }
//         }
//         return count;
//     }
// }


class Solution {
    public int arrangeCoins(int n) {
       int ans=(int)(Math.sqrt( 2* (long) n + 0.25)- 0.5);
       return ans; 
    }
}