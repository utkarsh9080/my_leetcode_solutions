
// class Solution {
//     public int[] plusOne(int[] digits) {
//         int s=0;
//         for(int i=0;i<digits.length;i++){
//             s+=digits[i];
//             if(i==digits.length-1) break;
//             s=s*10;
//         }
//         s=s+1;
//         int[] n= new int[digits.length];
//         for(int i=0;i<n.length;i++){
//             int temp = s%10;
//             s/=10;
//             n[i]=temp;
//         }
//         return n;
//     }
// }





class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] ans = new int[digits.length+1];
        ans[0]=1;
        return ans;
    }
}