class Solution {
    public int gcd(int a , int b){
        while(b!=0){
            int temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public int[] prefixGcd(int[] arr){
        int[] prefix = new int[arr.length];
        int currmax= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>currmax){
                currmax=arr[i];
            }
            prefix[i]=gcd(arr[i],currmax);
        }
        return prefix;
    }
    public long gcdSum(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int[] prefixgcd = prefixGcd(nums);
        Arrays.sort(prefixgcd);
        long sum=0;
        for (int i = 0; i < prefixgcd.length/2; i++) {
            sum += gcd(prefixgcd[i], prefixgcd[prefixgcd.length - 1 - i]);
        }

        return sum;
    }
}