class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        // int count=0;
        // for(int i =0 ;i<flowerbed.length ;i++){
        //     if(flowerbed[i]==1){
        //         count =0;
        //     }
        //     if(flowerbed[i]==0){
        //         count++;
        //         if(count%2==1&&count!=1){
        //             n--;
        //         }
        //     }
        // }
        // return n==0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (left && right) {
                    flowerbed[i] = 1;
                    n--;
                    if (n == 0) {
                        return true;
                    }
                }
            }
        }
        return n <= 0;

    }
}