class Solution {
    public int maximumWealth(int[][] accounts) {
        int h=0; 
          for(int person =0;person<accounts.length;person++){
            int i=0;
            for(int account=0 ;account<accounts[person].length;account++){
                i=accounts[person][account]+i;
            }
            if(h<i){
                    h=i;
                }
          }
          return h;
    }
}