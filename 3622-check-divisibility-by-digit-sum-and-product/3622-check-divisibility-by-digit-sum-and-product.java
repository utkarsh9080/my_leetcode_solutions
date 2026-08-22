class Solution {
    public boolean checkDivisibility(int n) {
        int omg=n;
        int sum=0;
        int mul=1;
        while(n>0){
            int temp = n%10;
            sum+= temp;
            mul*= temp;
            n=n/10;
        }
        if(omg%(sum+mul)==0){
            return true;
        }else{
            return false;
        }
    }
}