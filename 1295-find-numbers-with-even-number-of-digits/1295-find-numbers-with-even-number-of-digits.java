class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        // for(int i: nums){
        //     String s = Integer.toString(i);
        //     if((s.length()%2)==0){
        //         count++;
        //     }
        // }
        // return count;
        for(int i: nums){
            int s = digits(i);
            if((s%2)==0){
                count++;
            }
        };
        return count;
    };
    int digits(int num){
            if(num<0){num=num*-1;};
            return (int)(Math.log10(num))+1;
        };
}