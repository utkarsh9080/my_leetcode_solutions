class Solution {
    public int addDigits(int num) {
        boolean contine=true;
        int t=num;
        while(contine){
            int temp=t;
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(sum/10==0){
                contine=false;
            }
            t=sum;
        }
        return t;
        
    }
}