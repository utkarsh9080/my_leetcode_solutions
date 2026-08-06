class Solution {
    public int smallestNumber(int n, int t) {
        while (true) {
            if (mul(n) % t == 0)
                return n;
            n++;
        }
    }
    static int mul(int num){
        int mul=1;
        while(num>0){
            int temp = num%10;
            mul*=temp;
            num=num/10;
        }
        return mul;
    }
}